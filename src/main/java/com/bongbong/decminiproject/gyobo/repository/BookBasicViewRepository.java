package com.bongbong.decminiproject.gyobo.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bongbong.decminiproject.gyobo.entity.BookBasicView;



@Repository
public interface BookBasicViewRepository extends JpaRepository<BookBasicView, Long> {
  public List<BookBasicView> findAll();
  
  @Query(value = "SELECT m FROM BookBasicView m WHERE m.title LIKE %:keyword%")
  public Page<BookBasicView> findTitle(@Param("keyword") String keyword, Pageable page);
  
}
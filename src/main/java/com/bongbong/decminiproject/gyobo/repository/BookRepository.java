package com.bongbong.decminiproject.gyobo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bongbong.decminiproject.gyobo.entity.BookBasicEntity;



@Repository
public interface BookRepository extends JpaRepository<BookBasicEntity, Long> {
  public Page<BookBasicEntity> findAll(Pageable pageable);
  
  public Page<BookBasicEntity> OrderByRegDtDesc(Pageable pageable);

  @Query(value = "SELECT m FROM BookBasicEntity m WHERE m.title LIKE %:keyword%")
  public Page<BookBasicEntity> findTitle(@Param("keyword") String keyword, Pageable page);

  @Query(value = "SELECT m FROM BookBasicEntity m WHERE m.author LIKE %:keyword%")
  public Page<BookBasicEntity> findAuthor(@Param("keyword") String keyword, Pageable page);

  @Query(value = "SELECT m FROM BookBasicEntity m WHERE m.category LIKE %:keyword%")
  public Page<BookBasicEntity> findCategory(@Param("keyword") String keyword, Pageable page);
  
  @Query(value = "SELECT m FROM BookBasicEntity m WHERE m.publisher LIKE %:keyword%")
  public Page<BookBasicEntity> findPublisher(@Param("keyword") String keyword, Pageable page);
}
package com.bongbong.decminiproject.gyobo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bongbong.decminiproject.gyobo.entity.BookSalesList;


@Repository
public interface BookRankingRepository extends JpaRepository<BookSalesList, Long> {
  public List<BookSalesList> findAll();  
}

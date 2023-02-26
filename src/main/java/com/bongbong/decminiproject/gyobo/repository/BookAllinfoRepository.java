package com.bongbong.decminiproject.gyobo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bongbong.decminiproject.gyobo.entity.BookAllinfoEntity;

@Repository
public interface BookAllinfoRepository extends JpaRepository<BookAllinfoEntity, Long> {
  public List<BookAllinfoEntity> findBySeq(Long seq);
}

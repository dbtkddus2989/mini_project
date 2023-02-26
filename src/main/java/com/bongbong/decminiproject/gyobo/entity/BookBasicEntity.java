package com.bongbong.decminiproject.gyobo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "book_basic_info")
@Entity
public class BookBasicEntity {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "bbi_seq") private Long Seq;
  @Column(name = "bbi_title") private String title;
  @Column(name = "bbi_author") private String author;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
  @Column(name = "bbi_reg_dt") private Date regDt;
  @Column(name = "bbi_publisher") private String publisher;
  @Column(name = "bbi_price") private Long price;
  @Column(name = "bbi_image") private String image;
  @Column(name = "bbi_category") private String category;  
}



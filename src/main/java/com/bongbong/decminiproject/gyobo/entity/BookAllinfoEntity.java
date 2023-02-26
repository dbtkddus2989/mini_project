package com.bongbong.decminiproject.gyobo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;


@Data
@Entity
@Immutable
@Table(name = "book_all_info")
public class BookAllinfoEntity {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "bbi_seq") private Long seq;
  @Column(name = "bbi_title") private String title;
  @Column(name = "bbi_author") private String author;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
  @Column(name = "bbi_reg_dt") private Date regDt;
  @Column(name = "bbi_publisher") private String publisher;
  @Column(name = "bbi_price") private Long price;
  @Column(name = "discount_price") private Long discountPrice;
  @Column(name = "bbi_image") private String image;
  @Column(name = "bbi_category") private String category;
  @Column(name = "bdi_seq") private Long bdiSeq;
  @Column(name = "bdi_subtitle") private String subtitle;
  @Column(name = "bdi_discount") private Double discount;
  @Column(name = "bdi_translater") private String translater;
  @Column(name = "bdi_overview") private String overview;
  @Column(name = "bdi_soldout") private Long soldout;
  @Column(name = "bdi_point") private Long point;
  @Column(name = "bdi_bbi_seq") private Long bdiBbiSeq;
}

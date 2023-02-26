package com.bongbong.decminiproject.gyobo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "book_detail_info")
@Entity
public class BookDetailEntity {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "bdi_seq") private Long seq;
  @Column(name = "bdi_subtitle") private String subtitle;
  @Column(name = "bdi_discount") private double discount;
  @Column(name = "bbi_translater") private String translater;
  @Column(name = "bdi_overview") private String overview;
  @Column(name = "bdi_soldout") private Long soldout;
  @Column(name = "bdi_point") private Long point;
  @Column(name = "bbi_bdi_seq") private Long bdiSeq;
}


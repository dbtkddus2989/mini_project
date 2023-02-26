package com.bongbong.decminiproject.gyobo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Immutable
@Builder
@Table(name = "book_sales_list")
public class BookSalesList {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "bbi_seq") private Long seq;
@Column(name = "bbi_title") private String title;
@Column(name = "bbi_author") private String author;
@Column(name = "bbi_reg_dt") private Date regDt;
@Column(name = "bbi_publisher") private String publisher;
@Column(name = "bbi_price") private Long price;
@Column(name = "bbi_image") private String image;
@Column(name = "bbi_category") private String category;
@Column(name = "bsi_seq") private Long bsiSeq;
@Column(name = "bsi_sales_amount") private Long salesAmount;
@Column(name = "bsi_bbi_seq") private Long bsiBbiSeq;
}

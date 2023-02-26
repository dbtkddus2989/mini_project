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
public class BookSalesEntity {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "bsi_seq") private Long seq;
@Column(name = "bsi_sales_amount") private Long salesAmount;
@Column(name = "bsi_bbi_seq") private Long bbiSeq;
}

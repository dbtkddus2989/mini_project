package com.bongbong.decminiproject.member.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "book_member_info")
@JsonIgnoreProperties( value={"pwd"}, allowSetters = false, allowGetters = true)
public class MemeberInfoEntity {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name ="bmi_seq" ) private Long seq;
  @Column(name ="bmi_id" ) private String id;
  @JsonProperty("pwd")
  @Column(name ="bmi_pwd" ) private String pwd;
  @Column(name ="bmi_nickname" ) private String nickname;
  @Column(name ="bmi_gender" ) private Integer gender;
  @Column(name ="bmi_status" ) private Integer status;
} 

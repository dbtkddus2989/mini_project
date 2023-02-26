package com.bongbong.decminiproject.gyobo.service;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.bongbong.decminiproject.gyobo.entity.BookBasicEntity;
import com.bongbong.decminiproject.gyobo.repository.BookAllinfoRepository;
import com.bongbong.decminiproject.gyobo.repository.BookBasicViewRepository;
import com.bongbong.decminiproject.gyobo.repository.BookRankingRepository;
import com.bongbong.decminiproject.gyobo.repository.BookRepository;

@Service
public class BookService {
  @Autowired BookRepository bookRepo;

  public Map<String, Object> getBookList(@PathVariable String type, @RequestParam @Nullable String keyword, Pageable page) {
    Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
    if(type.equals("title")) {
      Page<BookBasicEntity> list = bookRepo.findTitle(keyword, page);
      resultMap.put("list", list);
    }
    else if(type.equals("author")) {
      Page<BookBasicEntity> list = bookRepo.findAuthor(keyword, page);
      resultMap.put("list", list);
    }
    else if(type.equals("category")) {
      Page<BookBasicEntity> list = bookRepo.findCategory(keyword, page);
      resultMap.put("list", list);
    }
    else if(type.equals("publisher")) {
      Page<BookBasicEntity> list = bookRepo.findPublisher(keyword, page);
      resultMap.put("list", list);
    }
    else {
      resultMap.put("status", false);
      resultMap.put("message", "잘못된 타입 선택입니다 [title, author, category, publisher]");
      return resultMap;
    }
    return resultMap;
  }

  public Map<String, Object> bookRanking(Pageable pageable) {
    Map<String, Object> resultMap = new LinkedHashMap<String, Object>();    
    resultMap.put("message", "랭킹조회");
    resultMap.put("list", brRepo.findAll(pageable));
    return resultMap;
  }

  @Autowired BookRankingRepository brRepo;
  public Map<String,Object>listbook(Pageable pageable){
    Map<String,Object> resultMap = new LinkedHashMap<String,Object>();
    resultMap.put("status", true);
    resultMap.put("message", "리스트를 조회했습니다.");
    resultMap.put("list", bookRepo.findAll(pageable));
    resultMap.put("code", HttpStatus.OK);
    return resultMap;
    }

  public Map<String, Object> getBookRecent(Pageable pageable){
      Map<String, Object> resultMap = new LinkedHashMap<String, Object>();  
      resultMap.put("status", true);
      resultMap.put("message", "최신순으로 조회 완료");
      resultMap.put("code", HttpStatus.OK);
      resultMap.put("list", bookRepo.OrderByRegDtDesc(pageable));
      return resultMap;
 }

 @Autowired BookAllinfoRepository baRepo; 
 public Map<String, Object> bookDetailRequest(Long seq) {
   Map<String, Object> resultMap = new LinkedHashMap<String, Object>();    
   resultMap.put("message", seq + "번의 책정보 조회");
   resultMap.put("list", baRepo.findBySeq(seq));    
   return resultMap;
 }  


 @Autowired BookBasicViewRepository bbvRepo;
 public Map<String,Object>listViewbook(Pageable pageable){
   Map<String,Object> resultMap = new LinkedHashMap<String,Object>();
   resultMap.put("status", true);
   resultMap.put("message", "리스트를 조회했습니다.");
   resultMap.put("list", bbvRepo.findAll(pageable));
   resultMap.put("code", HttpStatus.OK);
   return resultMap;
   }

   @Autowired BookBasicViewRepository bbbvRepo;
   public Map<String, Object> getBookListt(@PathVariable String type, @RequestParam @Nullable String keyword, Pageable page) {
    Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
    if(type.equals("title")) {
      resultMap.put("list", bbbvRepo.findTitle(keyword, page));      
    }
    return resultMap;
  }
}

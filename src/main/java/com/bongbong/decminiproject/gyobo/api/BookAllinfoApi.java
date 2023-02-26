package com.bongbong.decminiproject.gyobo.api;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.bongbong.decminiproject.gyobo.service.BookService;

@RestController
@RequestMapping("/api/book")

public class BookAllinfoApi {
  @Autowired BookService bService;  
  @GetMapping("/detail") // 책 상세정보 조회
  public ResponseEntity<Object> bookDetail(@RequestParam Long Seq) {
    Map<String, Object> resultMap = bService.bookDetailRequest(Seq);
    return new ResponseEntity<>(resultMap, HttpStatus.OK);
  }

  @GetMapping("/ranking") // 책 랭킹순 조회 & 페이징
  public ResponseEntity<Object> bookRanking(Pageable pageable) 
   {        
    Map<String, Object> resultMap = bService.bookRanking(pageable);
    return new ResponseEntity<>(resultMap, HttpStatus.OK);
   }

   @GetMapping("/recent") // 책 최신순 정렬& 페이징
  public ResponseEntity<Object> getBookRecent(Pageable pageable){
    Map<String, Object> resultMap =  bService.getBookRecent(pageable);
    return new ResponseEntity<>(resultMap, (HttpStatus) resultMap.get("code"));
  }  

  @GetMapping("/list/{type}") // type판별 후 keyword 검색 & 페이징
  public ResponseEntity<Object> getBookList(@PathVariable String type, @RequestParam @Nullable String keyword, Pageable page) {
    Map<String, Object> resultMap = bService.getBookList(type, keyword, page);
    return new ResponseEntity<>(resultMap, HttpStatus.OK);
  }

  @GetMapping("/listall") // 리스트 전체 조회 & 페이징처리
  public ResponseEntity<Object> getbookEntity(Pageable pageable){
    Map<String,Object> map = bService.listbook(pageable);
    return new ResponseEntity<>(map, HttpStatus.OK);
  }  

  @GetMapping("/list") // 리스트 전체 조회 & 페이징처리
  public ResponseEntity<Object> listView(Pageable pageable){
    Map<String,Object> map = bService.listViewbook(pageable);
    return new ResponseEntity<>(map, HttpStatus.OK);
  }  

  @GetMapping("/test/{type}") // type판별 후 keyword 검색 & 페이징
  public ResponseEntity<Object> getBookListt(@PathVariable String type, @RequestParam @Nullable String keyword, Pageable page) {
    Map<String, Object> resultMap = bService.getBookListt(type, keyword, page);
    return new ResponseEntity<>(resultMap, HttpStatus.OK);
  }
}

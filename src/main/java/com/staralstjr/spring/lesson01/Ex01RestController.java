package com.staralstjr.spring.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/ex01")
@RestController   // @Controller + @ResponseBody
public class Ex01RestController {

	// 웹 API = 웹 서버를 통해서 데이터만 주고받는 것
	@RequestMapping("/3")
	public String printString() {
		return "@RestController 사용";
	}
	
	@RequestMapping("/4")
	public Map<String, String> printMap(){
		Map<String, String> map = new HashMap<>();
		
		map.put("김인규","강사");
		map.put("유재석","개그맨");
		map.put("아이유", "가수");
		return map;
	}
	
	@RequestMapping("/5")
	public Data printData() {
		Data data = new Data();
		data.setId(1);
		data.setName("권민석");
		// "{\"id\":" + data.getId();
		return data;
	}
	
	// 리스폰스 엔티디
	@RequestMapping("/6")
	public ResponseEntity<Data> entity(){
		Data data = new Data();
		data.setId(1);
		data.setName("권민석");
		
		ResponseEntity<Data> responseEntity = new ResponseEntity<>(data, HttpStatus.INTERNAL_SERVER_ERROR);
		
		return responseEntity;
	}
}

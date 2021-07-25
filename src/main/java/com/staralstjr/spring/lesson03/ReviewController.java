package com.staralstjr.spring.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.staralstjr.spring.lesson03.bo.ReviewBO;
import com.staralstjr.spring.lesson03.model.Review;

@RestController
public class ReviewController {
	@Autowired
	private ReviewBO reviewBO;
	
	@RequestMapping("/lesson03/ex01")
	// /lesson03/ex01?id=3
	public Review ex01(
			@RequestParam("id") int id // value, required=true 포함된 심플
			// @RequestParam(value="id")int id // 필수 없으면 400에러
			// @RequestParam(value="id", required=true)int id // 필수 없으면 400에러
			// @RequestParam(value="id", required=false)int id // 필수 아님
			// @RequestParam(value="id", defaultValue="1")int id // 필수 없으면 id가 자동으로 1을 출력!
	
			
			
			) {
		
		return reviewBO.getReview(id);
		
	}
}

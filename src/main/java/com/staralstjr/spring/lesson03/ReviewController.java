package com.staralstjr.spring.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.staralstjr.spring.lesson03.bo.ReviewBO;
import com.staralstjr.spring.lesson03.model.Review;

@RestController
public class ReviewController {
	@Autowired
	private ReviewBO reviewBO;
	
	@RequestMapping("/lesson03/ex01")
	public Review ex01() {
		
		return reviewBO.getReview(3);
		
	}
}

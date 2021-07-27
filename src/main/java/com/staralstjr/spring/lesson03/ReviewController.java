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
	@RequestMapping("/lesson03/ex02")
	public String ex02() {
		// parameter를 통한 전달
		
//		int count = reviewBO.addReview(4, "콤비네이션피자", "김바다", 4.5, "할인도 많이 받고 잘 먹었습니다.");
		
		Review review = new Review();
		review.setStoreId(2);
		review.setMenu("뿌링클");
		review.setUserName("김인규");
		review.setPoint(4.0);
		review.setReview("역시 뿌링클은 진리 입니다!!");
		
		int count = reviewBO.addReview(review);
		
		return "insert success " + count;
		
	}
	
	// update
	@RequestMapping("/lesson03/ex03")
	public String ex03(
			@RequestParam("id") int id
			, @RequestParam("review") String review) {
		
		int count = reviewBO.updateReviewById(id, review);
		return "update 성공 : " + count;
	}
	
	// delete
	@RequestMapping("/lesson03/ex04")
	public String ex04(
			@RequestParam("id") int id) {
		int count = reviewBO.deleteReviewById(id);
		return "delete 성공 : " + count;
	}
}

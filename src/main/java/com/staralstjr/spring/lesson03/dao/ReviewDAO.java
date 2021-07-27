package com.staralstjr.spring.lesson03.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.staralstjr.spring.lesson03.model.Review;

@Repository
public interface ReviewDAO {
	
	public Review selectReview(@Param("id") int id);
	
	public int insertReview(
			@Param("storeId") int storeId,
			@Param("menu")String menu,
			@Param("userName")String userName,
			@Param("point")double point,
			@Param("review")String review
			);
	
	public int insertReviewFromObject(Review review);
	
	public int updateReviewById(@Param("id") int id, @Param("review") String review);
	
	public int deleteReviewById(@Param("id") int id);
}

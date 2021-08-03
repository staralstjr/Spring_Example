package com.staralstjr.spring.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.staralstjr.spring.lesson04.dao.NewUserDAO;
import com.staralstjr.spring.lesson04.model.NewUser;

@Service
public class NewUserBO {
	@Autowired
	private NewUserDAO newUserDAO;
	
	public int addNewUser(String name, String yyyymmdd, String email, String introduce) {
		return newUserDAO.insertNewUser(name, yyyymmdd, email, introduce);
	}
	
	// 최근 한 사용자의 데이터
	public NewUser getLastUser() {
		return newUserDAO.selectLastUser();
	}
}

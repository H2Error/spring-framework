package com.test.hemycoo.service;

import com.test.hemycoo.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private User user;

	public void test() {
		System.out.println("userService");
		System.out.println(user.getId());
		System.out.println(user.getName());
	}
}

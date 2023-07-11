package com.test.hemycoo.config;

import com.test.hemycoo.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.test")
@Configuration
public class AppConfig {

	// 此处若是在@Bean中加上("user")，那么在容器中Bean的名字就是createUser
	@Bean("user")
	public User createUser() {
		User user = new User();
		user.setId(100);
		user.setName("cahu");
		System.out.println("cahu");
		return user;
	}
}

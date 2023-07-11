package com.test.hemycoo;

import com.test.hemycoo.bean.User;
import com.test.hemycoo.config.AppConfig;
import com.test.hemycoo.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		String[] beanNamesForType = context.getBeanNamesForType(User.class);
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		User user = (User) context.getBean("user");
		user.test();
		UserService userService = (UserService) context.getBean("userService");
		userService.test();
		System.out.println();
	}
}

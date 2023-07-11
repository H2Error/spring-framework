package com.test.hemycoo.bean;

import org.springframework.stereotype.Component;

public class User {
	private int id;
	private String name;

	public User test() {
		System.out.println("test");
		this.id = 5;
		this.name = "test";
		return this;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

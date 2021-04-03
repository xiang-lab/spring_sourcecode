package com.kinight.spring.service;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class IndexService {

//	@PreDestroy
	public void close() {
		System.out.println("close");
	}

	private String age;

	public int query() {
		return 10;
	}

}

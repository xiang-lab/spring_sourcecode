package com.kinight.spring.app;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.kinight")
//@MapperScan("com.kinight.spring.mapper")
public class Appconfig {

	@Bean
	public E e() {
		System.out.println("e init");
		return new E();
	}

	@Bean
	public F f() {
		e();
		return new F();
	}

}

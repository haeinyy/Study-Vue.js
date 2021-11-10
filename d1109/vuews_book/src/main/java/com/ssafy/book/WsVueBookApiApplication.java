package com.ssafy.book;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.ssafy.book.repo")
public class WsVueBookApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(WsVueBookApiApplication.class, args);
	}
}

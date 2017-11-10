package com.example.demomysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class DemomysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemomysqlApplication.class, args);
	}
	//添加了一个方法
	@RequestMapping("/hello")
	public String hello(){
		return "no hello world";
	}
}

package com.zygh.lqjc2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zygh.lqjc2.dao")
public class Lqjc2Application {

	public static void main(String[] args) {
		SpringApplication.run(Lqjc2Application.class, args);
	}

}

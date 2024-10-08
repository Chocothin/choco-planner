package com.example.choco_planner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ChocoPlannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChocoPlannerApplication.class, args);
	}
}

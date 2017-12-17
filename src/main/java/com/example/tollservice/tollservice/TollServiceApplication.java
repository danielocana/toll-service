package com.example.tollservice.tollservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class TollServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TollServiceApplication.class, args);
	}
}

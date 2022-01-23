package com.ar.microa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
@EnableEurekaClient
public class MicroaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroaApplication.class, args);
	}

	
	
	
}

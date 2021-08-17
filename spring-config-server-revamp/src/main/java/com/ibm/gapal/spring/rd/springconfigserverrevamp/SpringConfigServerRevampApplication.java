package com.ibm.gapal.spring.rd.springconfigserverrevamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringConfigServerRevampApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigServerRevampApplication.class, args); 
	}

}

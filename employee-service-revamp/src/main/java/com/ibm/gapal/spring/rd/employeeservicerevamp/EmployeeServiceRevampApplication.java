package com.ibm.gapal.spring.rd.employeeservicerevamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RefreshScope
@SpringBootApplication
public class EmployeeServiceRevampApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceRevampApplication.class, args);
	}

}

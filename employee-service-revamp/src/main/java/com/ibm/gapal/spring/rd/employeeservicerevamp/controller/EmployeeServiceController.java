package com.ibm.gapal.spring.rd.employeeservicerevamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.gapal.spring.rd.employeeservicerevamp.model.EmployeeConfiguration;

@RefreshScope
@RestController
public class EmployeeServiceController {
	
	@Autowired
	private EmployeeConfiguration employeeConfiguration;
	
    @GetMapping("/service")
    public ResponseEntity<EmployeeConfiguration> getServiceName() {
    	System.out.println("Config value : " + employeeConfiguration.getOrganisationName());
        return new ResponseEntity<EmployeeConfiguration>(employeeConfiguration,HttpStatus.OK);
    }	

}

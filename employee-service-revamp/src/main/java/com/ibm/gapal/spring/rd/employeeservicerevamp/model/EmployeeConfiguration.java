/**
 * 
 */
package com.ibm.gapal.spring.rd.employeeservicerevamp.model;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author 02029H744
 *
 */
@Component  
@ConfigurationProperties("employee-service") 

public class EmployeeConfiguration {
	
	private String organisationName;
	private Integer maxEmployeeStrength;
	private Integer minEmployeeStrength;
	private String salaryRange;
	private String yearOfEmployment;
	
	public String getOrganisationName() {
		return organisationName;
	}
	public void setOrganisationName(String organisationName) {
		this.organisationName = organisationName;
	}
	public Integer getMaxEmployeeStrength() {
		return maxEmployeeStrength;
	}
	public void setMaxEmployeeStrength(Integer maxEmployeeStrength) {
		this.maxEmployeeStrength = maxEmployeeStrength;
	}
	public Integer getMinEmployeeStrength() {
		return minEmployeeStrength;
	}
	public void setMinEmployeeStrength(Integer minEmployeeStrength) {
		this.minEmployeeStrength = minEmployeeStrength;
	}
	public List<String> getSalaryRange() {
		return Arrays.asList(salaryRange.split(","));
	}
	public void setSalaryRange(String salaryRange) {
		this.salaryRange = salaryRange;
	}
	public List<String> getYearOfEmployment() {
		return Arrays.asList(yearOfEmployment.split(","));
	}
	public void setYearOfEmployment(String yearOfEmployment) {
		this.yearOfEmployment = yearOfEmployment;
	}
	
	

}

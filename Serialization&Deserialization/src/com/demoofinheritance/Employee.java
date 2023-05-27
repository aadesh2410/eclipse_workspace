package com.demoofinheritance;

import java.io.Serializable;

public class Employee implements Serializable{
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeCity() {
		return employeeCity;
	}
	public void setEmployeeCity(String employeeCity) {
		this.employeeCity = employeeCity;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = -1966519173808412528L;
	private String employeeName;
	private String employeeCity;
	int a = 10;
	int b = 20;
}

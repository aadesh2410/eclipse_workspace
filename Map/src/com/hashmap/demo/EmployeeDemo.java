package com.hashmap.demo;

public class EmployeeDemo {

	int employeeId;
	String employeeName;
	String employeeCity;
	public EmployeeDemo(int employeeId, String employeeName, String employeeCity) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeCity = employeeCity;
	}
	@Override
	public String toString() {
		return "EmployeeDemo [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeCity="
				+ employeeCity + "]";
	}

	
}

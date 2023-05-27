package com.demo;

public class EmployeeForDemo7 {

	
	private String employeeName;
	private int employeeId;
	private int employeeSalary;
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public EmployeeForDemo7(int id, String name, int salary) {
		this.employeeId = id;
		this.employeeName = name;
		this.employeeSalary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeForDemo7 [employeeName=" + employeeName + ", employeeId=" + employeeId + ", employeeSalary="
				+ employeeSalary + "]";
	}
	
}

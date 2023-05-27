package com.assignment20;

public class Employee_Prog3 {
	private String employeeName;
	private int employeeId;
	private int salary;
	private String city;
	private String companyName;
	public String getEmployeeName() {
		return employeeName;
	}
	public Employee_Prog3(String employeeName, int employeeId, int salary, String city, String companyName) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.salary = salary;
		this.city = city;
		this.companyName = companyName;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Override
	public String toString() {
		return "Employee_Prog3 [employeeName=" + employeeName + ", employeeId=" + employeeId + ", salary=" + salary
				+ ", city=" + city + ", companyName=" + companyName + "]";
	}
	
	
}

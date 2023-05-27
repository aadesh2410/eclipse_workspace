package com.test;

import java.util.Scanner;

public class Main {
	
	public static void getEmployeeDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter employee name");
		String employeeName = scanner.next();
		System.out.println("enter employee id");
		String id = scanner.next();
		System.out.println("enter employee mobile number");
		String number = scanner.next();
		
		Employee employee = new Employee();
		employee.setEmployeeName(employeeName);
		employee.setEmployeeId(id);
		employee.setEmployeeMobileNumber(number);
		
		employee.getEmployeeName();
		employee.getEmployeeId();
		employee.getEmployeeMobileNumber();
		System.out.println(employee);
		scanner.close();
	}
	
	public static void main(String[] args) {
		getEmployeeDetails();
	}

}

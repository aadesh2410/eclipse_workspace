package com.local;

public class GlobalVariableDemo {
	int employee_id = 123456;
	String employee_first_name = "Aadesh";
	String employee_last_name = "More";
	int employee_age = 24;
	
	public String empFullName (String a, String b) {
		String str = a + b;
		return str;
	}
	
	public static void main(String [] args) {
		GlobalVariableDemo GVD = new GlobalVariableDemo();
		System.out.println("Employee ID is >> " + GVD.employee_id);
		System.out.println("Employee first name is >> " + GVD.employee_first_name);
		System.out.println("Employee last name is >> " + GVD.employee_last_name);
		System.out.println("Employee age is >> " + GVD.employee_age);
		String final_string = GVD.empFullName(GVD.employee_first_name, GVD.employee_last_name);
		System.out.println("Employee complete name is >> " + final_string);
	}
}

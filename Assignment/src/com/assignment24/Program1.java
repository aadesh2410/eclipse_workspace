package com.assignment24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//1. Suppose I have Employee class that containing I'd, name and city now 
//I want to sort the data based on comparable interface by using name.

public class Program1 {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Aadesh", 10, "pune"));
		empList.add(new Employee("vaibhav", 20, "mumbai"));
		empList.add(new Employee("samruddhi", 25, "kolhapur"));
		empList.add(new Employee("jayesh", 36, "jalgaon"));
		
		Collections.sort(empList);
		
		System.out.println(empList);
		
	}
	
	
	
}

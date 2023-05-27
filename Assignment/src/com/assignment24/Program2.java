package com.assignment24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//2. Suppose I have Student class containing I'd, name and salary 
//now I want to sort the data based on comparator interface by using salary.

public class Program2 {
 
	public static void main(String[] args) {
		List<Employee2> empList = new ArrayList<Employee2>();
		empList.add(new Employee2("Aadesh", 10000, "pune"));
		empList.add(new Employee2("vaibhav", 20000, "mumbai"));
		empList.add(new Employee2("samruddhi", 25000, "kolhapur"));
		empList.add(new Employee2("jayesh", 36000, "jalgaon"));
		
		Collections.sort(empList, new SalaryComparator());
		
		for (Employee2 employee2 : empList) {
			System.out.println(employee2);
		}
	}
}

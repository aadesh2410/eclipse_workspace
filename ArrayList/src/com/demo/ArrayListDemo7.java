package com.demo;

import java.util.ArrayList;
import java.util.Iterator;

//aaraylist with generic datatype as a class
public class ArrayListDemo7 {

	public static void main(String[] args) {
		
		ArrayList<EmployeeForDemo7> aList = new ArrayList<EmployeeForDemo7>();
		
		//passing employee class objects into add method
		aList.add(new EmployeeForDemo7(21, "Aadesh", 50000));
		aList.add(new EmployeeForDemo7(22, "Pranav", 20000));
		EmployeeForDemo7 employee = new EmployeeForDemo7(23, "Bhushan", 50000);
		aList.add(employee);
		
		
		
		//printing all the employee objects in arrayformat using tostring format
		System.out.println(aList);
		
		System.out.println();
		System.out.println();
		//printing using foreach loop
		for (EmployeeForDemo7 emp : aList) {
			System.out.println(emp);
		}
		System.out.println();
		System.out.println();
		//using iterator
		Iterator<EmployeeForDemo7> itr = aList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();
		System.out.println();
		ArrayList<EmployeeForDemo7> newArrayList = new ArrayList<EmployeeForDemo7>();
		ArrayListDemo8 al8 = new ArrayListDemo8();
		newArrayList = al8.getEmployeeList(aList);
		
		for (EmployeeForDemo7 employeeForDemo7 : newArrayList) {
			System.out.println(employeeForDemo7);
		}
		
		
	
	}
	
}

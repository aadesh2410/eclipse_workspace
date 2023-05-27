package com.assignment20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//3. Design the method for ArrayList<Employee> which returns the list of employee and 
//print that data.
public class Program3 {

	public static void main(String[] args) {

		Employee_Prog3 eProg3 =  new Employee_Prog3("Aadesh",1234,50000,"Pune","Oracle");
		Employee_Prog3 eProg3_2  = new Employee_Prog3("Bothe",234,90000,"mumbai","TDL");
		Scanner scanner = new Scanner(System.in);
		List<Employee_Prog3> employeeList = new ArrayList<Employee_Prog3>();
//		System.out.println("Enter the number of Employeees");
//		int empNum = scanner.nextInt();

//		System.out.println("Enter the employee name");
//		eProg3.setEmployeeName(scanner.next());
//		System.out.println("Enter the employee id");
//		eProg3.setEmployeeId(scanner.nextInt());
//		System.out.println("Enter the employee salary");
//		eProg3.setSalary(scanner.nextInt());
//		System.out.println("Enter the employees' company name");
//		eProg3.setCompanyName(scanner.next());
//		System.out.println("Enter the employee city");
//		eProg3.setCity(scanner.next());

		employeeList.add(eProg3);
		employeeList.add(eProg3_2);

	//	System.out.println(employeeList);
		for (Employee_Prog3 employee_Prog3 : employeeList) {
			System.out.println(employee_Prog3);
		}
	scanner.close();
	}
}

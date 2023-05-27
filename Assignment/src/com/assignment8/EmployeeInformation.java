package com.assignment8;



/*1.2 Design the class as EmployeeInformation which takes the input for 
*multiple students from user and Design method public void getUserInput(), 
 country is same for all the students.
1.3 Pass the input to getStudentInformation() method
1.4 Print the multiple student information into getStudentInformation () method.
*/

import java.util.Scanner;

public class EmployeeInformation {
	public void getUserInput() {
		Employee student= new Employee();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first name");
		student.firstName = scanner.nextLine();
		System.out.println("enter the last name");
		student.lastName = scanner.nextLine();
		System.out.println("enter city name");
		student.city = scanner.nextLine();
		System.out.println("enter mobile number");
		student.mobileNumber = scanner.nextLong();
		
		
		
//		
//		employee.firstName = fname;
//		employee.lastName = lname;
//		employee.mobileNumber = mobileNumber;
//		employee.city = cityName;
//		System.out.println(employee);
		
		getStudentInformation(student.firstName,student.lastName,student.mobileNumber,student.city, student.country);
		scanner.close();

	}
	
	public void getStudentInformation(String firstName,String lastName, Long mobileNumber, String city, String country) {
		//Employee employee = new Employee();
		/*employee.firstName = firstname;
		employee.lastName = lastname;
		employee.mobileNumber = mobnumber;
		employee.city = cityname;*/
		
		System.out.println("The first name of student is >> " + firstName);
		System.out.println("The last name of student is >> " + lastName);
		System.out.println("The mobile number of student is >> " + mobileNumber);
		System.out.println("The city from which student belongs is >> "+ city);
		System.out.println("Student country name is >> "+ country);
		
		
	}
	 
	
}

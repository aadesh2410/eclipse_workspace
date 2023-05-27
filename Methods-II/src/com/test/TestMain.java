package com.test;

import java.util.Scanner;

public class TestMain {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter student name");
		String student_name = scanner.nextLine();
		System.out.println("Enter student school name");
		String school_name = scanner.nextLine();
		System.out.println("Enter student roll number");
		int student_rollno = scanner.nextInt();
		System.out.println("Enter total marks");
		int total_marks = scanner.nextInt();
		scanner.close();
		
		
		
		
		//creating object of class having addstudentdetails method
		TestStudent testStudent = new TestStudent();
		
		Student student =testStudent.addStudentDetails(school_name, student_name, student_rollno, total_marks);
		//Student student1 = new Student();
		
		
		System.out.println(student);
		student.getStudentPercentage(total_marks);
	}
	
}

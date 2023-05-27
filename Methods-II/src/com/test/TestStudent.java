package com.test;

public class TestStudent {

	public Student addStudentDetails(String school_name, String student_name, int rollno, int total_marks) {
		Student studentobj = new Student();
		studentobj.setSchool_name(school_name);
		studentobj.setStudent_name(student_name);
		studentobj.setStudent_rollno(rollno);
		studentobj.setTotal_marks(total_marks);
		return studentobj;
	}
	
	
}

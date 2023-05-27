package com.test;

public class Student {

	private String student_name;
	private int student_rollno;
	private String school_name;
	private int total_marks;

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public int getStudent_rollno() {
		return student_rollno;
	}

	public void setStudent_rollno(int student_rollno) {
		this.student_rollno = student_rollno;
	}

	public String getSchool_name() {
		return school_name;
	}

	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}

	public int getTotal_marks() {
		return total_marks;
	}

	public void setTotal_marks(int total_marks) {
		this.total_marks = total_marks;
	}

	public void getStudentPercentage(int x) {
		System.out.println("percentage = " + x + "%");
	}
	
	@Override
	public String toString() {
		return "Student [student_name=" + student_name + ", student_rollno=" + student_rollno + ", school_name="
				+ school_name + ", total_marks=" + total_marks + "]";
	}
}

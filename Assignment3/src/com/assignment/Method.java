package com.assignment;

public class Method {

	public static String getStudentName() {
		String a = "Aadesh";
		// System.out.println("Student name is);
		return a;
	}

	public static String getStudentName1(String str) {
		String x = "Aadesh" + "\t" + str;
		return x;
	}

	public static void main(String[] args) {
		String str = getStudentName();
		System.out.println("Student name is >>>>" + str);
		String str1 = getStudentName1("More");
		System.out.println("Student full name is >>>>" + str1);
	}

}

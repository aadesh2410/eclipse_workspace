package com.program5;

public class FifthProgram {

	public static void main(String[] args) {
		int maths_marks = 75;
		int science_marks = 35;
		int history_marks = 98;
		int geography_marks = 78;
		int english_marks = 100;
		int total = TotalOfMarks.getTotal(maths_marks, science_marks, history_marks, geography_marks, english_marks);
		float average = AverageOfMarks.average(total);
		System.out.println("Total marks in 5 subjects = " + total + "\n" + "Average marks of 5 subjects = " + average);
	}
}

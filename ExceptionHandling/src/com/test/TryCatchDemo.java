package com.test;

public class TryCatchDemo {

	public static void main(String[] args) {

		// Scenario1
		// simple try-catch block
		try {
			int a = 10 / 0;
			
		} catch (ArithmeticException e) {
			try {
				int b = 0/0;
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			
		}

		// Scenario2
		// single try block not allowed
		// use try-catch or try-finally
//		try {
//			int a = 0/0;
//		}
//		

		// Scenario3
		// try catch finally allowed

		// Scenario4
		// try and multiple catches
		// in this case, Exception is the parent class
		// so all are handled here, so next catch becomes 
		//unreachable.
//		try {
//			int a = 0 / 0;
//		} catch (Exception e) {
//			e.printStackTrace();
//		} catch (ArithmeticException e) {
//				e.printStackTrace();
//		}
		
		//Scenario5
		
	}
}

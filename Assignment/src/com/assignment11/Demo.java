package com.assignment11;


// I have student class, now user restricts to create the object of that class from outside, write the code for it.



//One way
/*
//abstract public class Demo {
//	
//	
//	public static void main(String[] args) {
//		
//		Demo demo = new Demo();
//			
//	}
//}
*/


//2nd way
class Demo1 {
	
	private Demo1() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Demo1 demo1 = new Demo1();
	}
}
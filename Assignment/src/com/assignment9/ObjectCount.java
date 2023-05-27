package com.assignment9;

//1. Write the Java program in which create the multiple objects and display the count of number of objects created into class.
public class ObjectCount {

	
	
	//making it static doesn't initialized the variable everytime object is created
	static int count = 0;
	
	{
		count++;
	}
//	public ObjectCount() {
//		
//		//System.out.println(count);
//		
//	}

	public static void main(String[] args) {

		ObjectCount num1 = new ObjectCount();
		ObjectCount num2 = new ObjectCount();
		ObjectCount num3 = new ObjectCount();
		ObjectCount num4 = new ObjectCount();
		ObjectCount num5 = new ObjectCount();
		ObjectCount num6 = new ObjectCount();
		ObjectCount num7 = new ObjectCount();
		ObjectCount num8 = new ObjectCount();
		ObjectCount num9 = new ObjectCount();

		System.out.println(count);

	}

}

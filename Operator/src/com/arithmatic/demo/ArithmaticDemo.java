package com.arithmatic.demo;


//separate class for each operation
public class ArithmaticDemo {
	public static void main(String[] args) {
		
		/*
		 * Object creation 
		Addition add = new Addition();
		Substraction sub = new Substraction();
		Multiplication mul = new Multiplication();
		Division div = new Division();
		Modulus mod = new Modulus();
		*/
		
		// methods are static so accessed using classname.
		int add_result = Addition.add(25, 265);
		int sub_result = Substraction.sub(78, 45);
		int mul_result = Multiplication.mul(10, 14);
		int div_result = Division.div(625, 25);
		int mod_result = Modulus.mod(10000, 10);
		
		System.out.println("Addition = " + add_result + "\n" + "Substraction = " + sub_result + "\n" + "Multiplication = " + mul_result + "\n" + "Division = " + div_result + "\n" + "Modulus = " + mod_result);
	}
}

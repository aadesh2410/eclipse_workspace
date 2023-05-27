package com.test;

public class ConstructorDemo {

	long id;
	String employee_name;
	String employee_dept;
	
	//user defined - no arguments
	public ConstructorDemo() {
		
	}
	
	//user defined - argumented
	//constructorOverloading
	public ConstructorDemo(long id, String employee_name, String employee_dept) {
		this.id = id;
		this.employee_name = employee_name;
		this.employee_dept = employee_dept;
	}
	//@Overloading
	//user defined - argumented
	//but with different set of parameters
	public ConstructorDemo(String name, String dept) {
		this.employee_dept = dept;
		this.employee_name = name;
	}
	
	public static void main(String [] args) {
		ConstructorDemo con1 = new ConstructorDemo();
		System.out.println(con1);
		
		ConstructorDemo con2 = new ConstructorDemo(1289382137, "Aadesh More", "IT");
		System.out.println(con2);
		
		ConstructorDemo con3 = new ConstructorDemo("Prathmesh Vane", "Trash");
		System.out.println(con3);
		


	}

	@Override
	public String toString() {
		return "ConstructorDemo [id=" + id + ", employee_name=" + employee_name + ", employee_dept=" + employee_dept
				+ "]";
	}
	
	
}



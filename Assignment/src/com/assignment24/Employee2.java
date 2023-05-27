package com.assignment24;

public class Employee2 {

	private String name;
	private int salary;
	private String city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + salary + ", city=" + city + "]";
	}

	public Employee2(String name, int id, String city) {
		super();
		this.name = name;
		this.salary = id;
		this.city = city;
	}

}

package com.assignment24;

public class Employee implements Comparable<Employee> {

	
	private String name;
	private int id;
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public int compareTo(Employee employee) {
		return this.name.compareTo(employee.name);
		
		
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", city=" + city + "]";
	}
	public Employee(String name, int id, String city) {
		super();
		this.name = name;
		this.id = id;
		this.city = city;
	}
	
	
}

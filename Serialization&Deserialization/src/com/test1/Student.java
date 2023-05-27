package com.test1;

import java.io.Serializable;

public class Student implements Serializable {

	/**
	 * 
	 */
	// code of the class
	// random value for cross checking class during serialization
	private static final long serialVersionUID = 1L;
	private String name;
	private String lastName;
	private String city;
	// field not to be serialized
	//default value is stored into the file while serialization
	private transient int marks;

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}

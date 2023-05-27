package com.test1;

public class Car {

	private int wheels;
	private int fuel_capacity;
	private String company_name;
	private String model_number;
	private int totalRun;
	float mileage;

	public int getTotalRun() {
		return totalRun;
	}

	public void setTotalRun(int totalRun) {
		this.totalRun = totalRun;
	}

	// getter setter methods for above private variables
	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getFuel_capacity() {
		return fuel_capacity;
	}

	public void setFuel_capacity(int fuel_capacity) {
		this.fuel_capacity = fuel_capacity;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getModel_number() {
		return model_number;
	}

	public void setModel_number(String model_number) {
		this.model_number = model_number;
	}

	@Override
	public String toString() {
		return "Car [wheels=" + wheels + ", fuel_capacity=" + fuel_capacity + ", company_name=" + company_name
				+ ", model_number=" + model_number + ", totalRun=" + totalRun + ", mileage=" + mileage + "]";
	}

}

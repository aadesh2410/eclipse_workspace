package com.test1;

public class CarDetails {

	public Car getCarDetails(String company_name, String model_name, int fuel_capacity, int wheels, int totalRun) {
		Car car = new Car();

		// setting up car variables
		car.setCompany_name(company_name);
		car.setFuel_capacity(fuel_capacity);
		car.setModel_number(model_name);
		car.setWheels(wheels);
		car.setTotalRun(totalRun);

		// getting car variables
//		String companyName = car.getCompany_name();
//		String modelName = car.getModel_number();
//		int noOfWheels = car.getWheels();
//		int fuelCapacity = car.getFuel_capacity();
//		int totalrun = car.getTotalRun();

//		System.out.println("Car company name >> " + companyName);
//		System.out.println("Car model number >> " + modelName);
//		System.out.println("Car fuel capacity >> " + fuelCapacity + " litres");
//		System.out.println("No of wheels for the car >> " + noOfWheels);

		return car;
	}

	public Car mileage(String company_name, String model_name, int fuel_capacity, int wheels, int totalRun, int fuel) {
		// Car car = new Car();
		CarDetails carDetails = new CarDetails();
		Car car = carDetails.getCarDetails(company_name, model_name, fuel_capacity, wheels, totalRun);
		car.mileage = totalRun / fuel;
		// System.out.println("Mileage of the car is >>" + temp_mileage);
		return car;

	}

}

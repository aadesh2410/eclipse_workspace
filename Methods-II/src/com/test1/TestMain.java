package com.test1;

import java.util.Scanner;

public class TestMain {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the brand name");
		String brandName = scanner.nextLine();
		System.out.println("Enter the model number");
		String modelNumber = scanner.nextLine();
		System.out.println("Enter number of wheels for your car");
		int noOfWheels = scanner.nextInt();
		System.out.println("Enter the fuel capacity");
		int fuelCapacity = scanner.nextInt();
		System.out.println("Enter total kms");
		int totalrun = scanner.nextInt();
		
		
		CarDetails carDetails = new CarDetails();
		//car object is initialized completely
		Car test = carDetails.getCarDetails(brandName, modelNumber, fuelCapacity, noOfWheels, totalrun);
		
		Car test1 = carDetails.mileage(brandName, modelNumber, fuelCapacity, noOfWheels, totalrun,50);
		
		//printing car class object
		//Car car = new Car();
		System.out.println(test);
		System.out.println(test1);
		scanner.close();
	}
}

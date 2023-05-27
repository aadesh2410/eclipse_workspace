package com.assignment12.program3;

import java.util.Scanner;

public class Insurance {

	int iD;
	String personName;
	String insuranceCompany;
	
	void getInsuranceDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter customer ID");
		iD = scanner.nextInt();
		System.out.println("Enter person name");
		personName = scanner.next();
		System.out.println("Enter insurance company name");
		insuranceCompany = scanner.next();
		getInsuranceInformation(iD, personName, insuranceCompany);
		
	}
	
	private void getInsuranceInformation(int iD, String pName, String companyName) {
		System.out.println("Person name is >> " + pName);
		System.out.println("Person ID is >>"+ iD);
		System.out.println("Insurance company name is >>"+ companyName);
	}
	
}

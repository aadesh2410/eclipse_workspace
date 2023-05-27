package com.assignment12.program3;

import java.util.Scanner;

public class LifeInsurance extends Insurance{

	int premiumAmount;
	
	public void getLifeInsuranceDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter customer ID");
		iD = scanner.nextInt();
		System.out.println("Enter person name");
		personName = scanner.next();
		System.out.println("Enter insurance company name");
		insuranceCompany = scanner.next();
		System.out.println("Enter premium amount for LifeInsurance");
		premiumAmount = scanner.nextInt();
		getLifeInsuranceInformation(iD, personName, insuranceCompany, premiumAmount);
	}
	
	
	private void getLifeInsuranceInformation(int iD, String pName, String companyName, int premiumAmt) {
		System.out.println("Person name is >> " + pName);
		System.out.println("Person ID is >> "+ iD);
		System.out.println("Insurance company name is >>"+ companyName);
		System.out.println("The premium amount for life insurance is >> " + premiumAmt);
	}
}

package com.assignment12.program3;

import java.util.Scanner;

public class TermPolicy extends LifeInsurance {

	int duration;
	
	public void getTermPolicyDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter customer ID");
		iD = scanner.nextInt();
		System.out.println("Enter person name");
		personName = scanner.next();
		System.out.println("Enter insurance company name");
		insuranceCompany = scanner.next();
		System.out.println("Enter premium amount for LifeInsurance");
		premiumAmount = scanner.nextInt();
		System.out.println("Enter the duration for the policy");
		duration = scanner.nextInt();
		getTermPolicyInformation(iD, personName, insuranceCompany, premiumAmount, duration);
	}
	
	private void getTermPolicyInformation(int iD, String pName, String companyName, int premiumAmt, int duration) {
		System.out.println("Person name is >> " + pName);
		System.out.println("Person ID is >> "+ iD);
		System.out.println("Insurance company name is >>"+ companyName);
		System.out.println("The premium amount for life insurance is >> " + premiumAmt);
		System.out.println("The duration for termpolicy is >>" + duration + " years");
	}
}

package com.assignment12.program2;

import java.util.Scanner;

public class HDFCBank extends Bank {

	static float rateOfInterest = 7f;

	public void getSBIBankDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter principle amount");
		principleAmount = scanner.nextDouble();
		System.out.println("Enter the tenure for which amount is invested");
		tenure = scanner.nextInt();
		double interestAmount = getCalculateInterest(principleAmount, tenure, rateOfInterest);
		System.out.println("Interest amount of HDFCBank is >>" + interestAmount);
	}

	public double getCalculateInterest(double principleAmount, int tenure, float rateOfInterest) {
		double interest = (principleAmount * tenure * rateOfInterest) / 100;
		return interest;
	}

}

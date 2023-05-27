package com.assignment15;

import java.util.Scanner;

/*1.1 Design the Policy class that contain policy id, policy name, policy type, premium amount etc. 
1.2 Design the below method into Policy class and which return the policy object
public Policy getPolicyDetails() 
1.3 Input should be taken from user and print that data into getPolicyDetails () method.
*/
public class Policy {

	// declaring the variables
	int policyId;
	String policyName;
	String policyType;
	int premiumAmount;

	// designing the method
	public Policy getPolicyDetails() {
		Scanner scanner = new Scanner(System.in);
		Policy policy = new Policy();
		System.out.println("Enter policy Id");
		policy.policyId = scanner.nextInt();
		System.out.println("Enter policy Name");
		policy.policyName = scanner.next();
		System.out.println("Enter policy type");
		policy.policyType = scanner.next();
		System.out.println("Enter premium amount");
		policy.premiumAmount = scanner.nextInt();
		System.out.println(policy);
		scanner.close();
		return policy;
	}

	@Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", policyName=" + policyName + ", policyType=" + policyType
				+ ", premiumAmount=" + premiumAmount + "]";
	}

}

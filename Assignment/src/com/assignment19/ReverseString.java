package com.assignment19;

import java.util.Scanner;

public class ReverseString {

	public String conRevstr(String S1) {
        // code here
        String S3 = S1;  //AadeshMore
        String revStr = "";
        for(int i = 0;i< S3.length();i++){
            char ch = S3.charAt(i); //A a
            revStr = ch + revStr;  // A (a+A)
            //System.out.println(revStr);
        }
        return revStr;
    }
	
	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String rev = reverseString.conRevstr(scanner.next());
		System.out.println("String after reversal >>"+rev);
		scanner.close();
	}
}

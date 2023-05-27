package com.string;

public class StringReverse {

	
	static String conRevstr(String S1) {
        // code here
        String S3 = S1;  //AadeshMore
        String revStr = "";
        for(int i = 0;i< S3.length();i++){
            char ch = S3.charAt(i); //A a
            revStr = ch + revStr;  // A (a+A)
            System.out.println(revStr);
        }
        return revStr;
    }
	
	public static void main(String[] args) {
		String rev = conRevstr("Aadesh");
		System.out.println(rev);
	}
}

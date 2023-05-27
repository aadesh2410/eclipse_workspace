package com.stringbuffer;

public class AllMethods {

	
	 public static void main(String[] args) {
		
		 
		 
		 
		 
		 //Method 1
		 //append
		 StringBuffer sBuffer1 = new StringBuffer("Aadesh");
		 sBuffer1.append(" More");
		 System.out.println(sBuffer1);
		 
		 
		 //Method2
		 //insert - inserts given str at given position
		 StringBuffer sBuffer2 = new StringBuffer("Aadesh");
		 sBuffer2.insert(1, "More");
		 System.out.println(sBuffer2); 	//AMoreadesh
		 
		 //Method 3
		 //replace - replace from start to end-1 by given string
		 StringBuffer sBuffer3 = new StringBuffer("Aadesh");
		 sBuffer3.replace(1, 3, "More");
		 System.out.println(sBuffer3);  	//AMoreesh
		 
		 //Method 4
		 //delete - delete string from beginIndex to EndIndex-1
		 StringBuffer sBuffer4 = new StringBuffer("Aadesh");
		 sBuffer4.delete(1, 5);
		 System.out.println(sBuffer4); //Ah
		 
		 //Method 5
		 //reverse 
		 StringBuffer sBuffer5 = new StringBuffer("Aadesh");
		 sBuffer5.reverse();
		 System.out.println(sBuffer5);
		 
		 //Method 6
		 //capacity
		 //default is 16
		 System.out.println(sBuffer5.capacity());
	 }
}

package com.practice;

public class Gfg1 {

	
	
	    public static double[]  FindRoots(int A, int B, int C)
	    {
	        // code here
	        
	        double [] result = new double[2];
	        
	        double temp = Math.pow((B*B - 4*A*C), 0.5);
	        
	        
	        result[0] = ((-1 * B ) + temp) / 2;
	        result[1] = ((-1 * B ) - temp) / 2;
	        System.out.println(result[0] + " " + result[1]);
	        return result;
	    }
	
	public static void main(String[] args) {
		
		FindRoots(1,5,4);
		
		
	}
	
}

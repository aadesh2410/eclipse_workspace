package com.scanner;


	public class Main {  
//	    public  void var(Integer x, int y) {  
//	        System.out.println("Integer int");  
//	    }  

	    public void var(long x) {
			System.out.println("Long ... x");
		}
	    public  void var(int x) {  
	        System.out.println("int... x");  
	    }  
	    public void var(double x) {
			System.out.println("Double ... x");
		}
	    public void var(short x) {
			System.out.println("Short ... x");
		}

	    public  void var(Integer x) {  
	        System.out.println("Integer...");  
	    }  

	    public static void main(String args[]) {   
	        Main main= new Main();
	        //Integer integer = 20;
	        main.var(10);
	        //System.out.println("Program terminated");
	    }  
	}


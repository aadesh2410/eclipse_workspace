package com.test;

public class ThreadMethodDemo extends Thread{

	
	public static void main(String[] args) {
		
		
		ThreadMethodDemo tmd = new ThreadMethodDemo();
		
		tmd.setPriority(10); 
		tmd.setName("First thread");
		
		System.out.println(tmd.getId());
		System.out.println(tmd.getName());
		System.out.println(tmd.getPriority());
		System.out.println(tmd.getState());
		
		
	}
}

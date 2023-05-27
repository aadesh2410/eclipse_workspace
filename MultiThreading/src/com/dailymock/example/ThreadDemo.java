package com.dailymock.example;

public class ThreadDemo extends Thread{
	
	//run method implementation
	public void run() {
		
		System.out.println("Hello");
		try {
			
			//static method
			//we use it to pause the execution of current thread for given time period in miliseconds
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Inside run method");
		
		//current thread status is printed
		System.out.println("This thread name is >> "+ Thread.currentThread().getName());
	}
	
	
	
	public static void main(String[] args) {
	
		//create a current class object
		ThreadDemo t1= new ThreadDemo();
		ThreadDemo t2 = new ThreadDemo();
		
		//getting thread Id
		System.out.println(t1.getId());
		System.out.println(t2.getId());
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		
		//setting thread name as per our convinience
		t1.setName("Thread One");
		t2.setName("Thread Two");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		//start method
//		t1.start();
//		t2.start();
//		
		// getting priority methods
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		// set priority 
		t1.setPriority(1);
		t2.setPriority(10);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		// returns int for active number of thread inside current thread group
		int x = Thread.activeCount();
		System.out.println("Active thread count is >> "+x);
		
		t1.suspend();
		t1.resume();
		System.out.println(t1.getState());
	}

}

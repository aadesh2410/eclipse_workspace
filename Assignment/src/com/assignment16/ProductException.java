package com.assignment16;

/*
  1. Design the Product class in which design void productCheck(int weight) in check 
whether weight is less than 100, then throw the ProductException  with a meaningful message. 
2. Design the ProductException class in which write custom exceptions.
3. Create MainProduct class in which pass the input to productCheck method with try and catch block.
 */
public class ProductException extends RuntimeException{
	
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	//
	//private String message;
	public ProductException(String message) {
		super(message);
	}
	
	
}

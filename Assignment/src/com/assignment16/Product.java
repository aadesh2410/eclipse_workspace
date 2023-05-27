package com.assignment16;

/*
 * 1. Design the Product class in which design void productCheck(int weight) in check 
whether weight is less than 100, then throw the ProductException  with a meaningful message. 
2. Design the ProductException class in which write custom exceptions.
3. Create MainProduct class in which pass the input to productCheck method with try and catch block.
 */
public class Product {

	void productCheck(int weight) {
		if (weight < 100) {
			System.out.println("Entered weight = " + weight);
			System.out.println("Entered weigth is absolutely correct");
		}else {
			throw new ProductException("Invalid weight");
		}
	}

}

package com.assignment20;

import java.util.ArrayList;

/*
 * . Suppose I have arraylist which contain elements as 
 * [mumbai, pune, Bangalore, Hyderabad, mumbai],
 *  now I want to remove the mumbai from list and print that data.
 */
public class Program4 {

	public static void main(String[] args) {
		ArrayList<String> cityList = new ArrayList<>();
		cityList.add("mumbai");
		cityList.add("pune");
		cityList.add("Bangalore");
		cityList.add("Hyderabad");
		cityList.add("mumbai");
		
		for(int i = 0 ; i < cityList.size();i++) {
			if(cityList.get(i).equals("mumbai")) {
				cityList.remove(i);
			}else
				continue;
		}
		for (String string : cityList) {
			System.out.println(string);
		}
	}
}

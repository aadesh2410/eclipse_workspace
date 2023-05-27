package com.assignment23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//Design the below example by using HashMap<String, ArrayList<String>>
public class Program {

	
	public static void main(String[] args) {
		
		Map<String, ArrayList<String>> state = new HashMap<String, ArrayList<String>>();
		ArrayList<String> maharashtra = new ArrayList<>();
		maharashtra.add("mumbai");
		maharashtra.add("pune");
		maharashtra.add("nagpur");
		
		ArrayList<String> karnataka= new ArrayList<>();
		karnataka.add("bangalore");
		karnataka.add("mysore");
		
		ArrayList<String> madhyapradesh	= new ArrayList<>();
		madhyapradesh.add("bhopal");
		madhyapradesh.add("indore");
		
		state.put("maharashtra", maharashtra);
		state.put("karnataka", karnataka);
		state.put("madhyapradesh", madhyapradesh);
		
		Map<String, Map<String, ArrayList<String>>> country = new HashMap<>();
		country.put("india", state);
		
		System.out.println(country);
	}
	
}

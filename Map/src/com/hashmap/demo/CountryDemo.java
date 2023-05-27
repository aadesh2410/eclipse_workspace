package com.hashmap.demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountryDemo {

	public static void main(String[] args) {
		ArrayList<String> maharashtra = new ArrayList<>();
		maharashtra.add("Pune");
		maharashtra.add("mumbai");
		maharashtra.add("magpur");
		ArrayList<String> karnataka = new ArrayList<>();
		karnataka.add("bangalore");
		karnataka.add("mysore");
		karnataka.add("belgaon");
		ArrayList<String> mp = new ArrayList<>();
		mp.add("indore");
		mp.add("bhopal");
		mp.add("dhar");
		
		HashMap<String, ArrayList<String>> state = new HashMap<>();
		state.put("MH",maharashtra);
		state.put("KA", karnataka);
		state.put("MP", mp);
		
		HashMap<String, HashMap<String, ArrayList<String>>> country = new HashMap<>();
		country.put("ind", state);
		
		System.out.println(country);
		
	}
	
	
}

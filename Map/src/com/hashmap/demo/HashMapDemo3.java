package com.hashmap.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo3 {
	
	public HashMap<EmployeeDemo, Integer> getEmployeeMap(){
		
		HashMap<EmployeeDemo, Integer> hashMap = new HashMap<>();
		hashMap.put(new EmployeeDemo(101, "Aadesh", "Pune"), 45);
		hashMap.put(new EmployeeDemo(104, "Vaibhav", "Mumbai"), 10);
		return hashMap;
		
	}
	
	static ArrayList<Integer> javaIterator(int n, int k, int[] arr) {
	       ArrayList<Integer> arraylist = new ArrayList<>();
	       for(int i = 0 ; i  < n ; i++){
	           arraylist.add(arr[i]);
	       }
	       for(Integer integer: arraylist){
	           if(k < integer){
	               arraylist.remove(k);
	           }else{
	               continue;
	           }
	       }
	       return arraylist;
	    }
	
	public static void main(String[] args) {
		
		HashMapDemo3 hm3 = new HashMapDemo3();
		Map<EmployeeDemo, Integer> map = hm3.getEmployeeMap();
		
		System.out.println(map);
		
	}
	
	
}

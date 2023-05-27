package com.demo;

import java.util.ArrayList;

public class ArrayListDemo9 {
	
	
	public ArrayList<Integer> getAddtion(ArrayList<Integer> arrayList1 , ArrayList<Integer> arrayList2){
		return arrayList1;
	}

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<>();
		ArrayList<Integer> arrayList2 = new ArrayList<>();

		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList2.add(40);
		arrayList2.add(50);
		arrayList2.add(60);

//		Integer sum = arrayList.get(0) + arrayList2.get(0);
//		System.out.println(sum);
		ArrayList<Integer> sum = new ArrayList<>();
		for (int i = 0; i < arrayList.size(); i++) {
			//Integer sum = 0;
			sum.add(arrayList.get(i) + arrayList2.get(i));  
			
		}
		//System.out.println(sum);
		System.out.println(sum);
	}
}

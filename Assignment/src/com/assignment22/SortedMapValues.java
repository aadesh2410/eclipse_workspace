package com.assignment22;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//1. Suppose I have Map<String,Integer> contain key as Ram, Sohan, Ashok, Ajay, Prasanna
// and value is 3,2,1,6,5 now I want to sort the value from map and print it
public class SortedMapValues {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("ram", 3);
		map.put("sohan", 2);
		map.put("ashok", 1);
		map.put("ajay", 6);
		map.put("prasanna", 5);

		System.out.println(map);

		Set<Entry<String, Integer>> set = map.entrySet();
		System.out.println(set);

		Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator();

		int intarray[] = new int[set.size()];
		String strarray[] = new String[set.size()];
		int j = 0;
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> i = iterator.next();
			intarray[j] = i.getValue();
			strarray[j] = i.getKey();
			j++;
		}

		Arrays.sort(intarray);
		// 1 2 3 5 6
		for (int i = 0; i < intarray.length; i++) {
			System.out.print(intarray[i] + " ");
		}
		System.out.println();
		// for preserving the order of insertion
		Map<String, Integer> sortedMap = new LinkedHashMap<>();

		Iterator<Entry<String, Integer>> iterator1 = map.entrySet().iterator();
		int k = 0;
		while (iterator1.hasNext()) {
			Map.Entry<String, Integer> i = iterator1.next();
			if (map.get(i.getKey()) == intarray[k]) {
				sortedMap.put(i.getKey(), intarray[k]);
				k++;
			}
		}
		System.out.println(sortedMap);
	}
}

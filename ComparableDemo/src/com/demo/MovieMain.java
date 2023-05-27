package com.demo;

import java.util.*;
import java.util.ArrayList;

public class MovieMain {
	
	
	public static void main(String[] args) {
		
		List<Movie> list = new ArrayList<Movie>();
		list.add(new Movie("Drishyam", 150, 9.0f));
		list.add(new Movie("Avataar", 180, 10.0f));
		list.add(new Movie("Gangubai", 120, 8.5f));
		list.add(new Movie("Suryavanshi", 145, 5.0f));
		list.add(new Movie("Tenet", 170, 9.6f));
		
		
		System.out.println("before sorting" + list);
		
		Collections.reverse(list);
		Collections.sort(list);
		
		
		for(Movie movie : list) {
			System.out.println(movie);
		}
	}
}

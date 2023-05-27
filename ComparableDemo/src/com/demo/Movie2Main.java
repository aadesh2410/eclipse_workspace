package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Movie2Main {

	public static void main(String[] args) {

		List<Movie2> list = new ArrayList<Movie2>();
		list.add(new Movie2("Drishyam", 150, 9.0f));
		list.add(new Movie2("Avataar", 180, 10.0f));
		list.add(new Movie2("Gangubai", 120, 8.5f));
		list.add(new Movie2("Suryavanshi", 145, 5.0f));
		list.add(new Movie2("Tenet", 170, 9.6f));
		list.add(new Movie2("Avataar", 130, 6.5f));
		list.add(new Movie2("Gangubai", 130, 6.7f));
		list.add(new Movie2("Avataar", 160, 1.0f));
		
//		Scanner scanner = new Scanner(System.in);
//		Movie2 movie2 = new Movie2();
//		movie2.setName(scanner.next());
//		movie2.setRating(scanner.nextFloat());
//		movie2.setRunTime(scanner.nextInt());
//		
//		list.add(movie2);

		System.out.println("before sorting");

		for (Movie2 movie : list) {
			System.out.println(movie);
		}
		Collections.sort(list, new NameComparatorSort());
		System.out.println("after sorting on name");
		for (Movie2 movie : list) {
			System.out.println(movie);
		}
		Collections.sort(list, new LengthComparatorSort());
		System.out.println("after sorting on runtime");
		for (Movie2 movie : list) {
			System.out.println(movie);
		}
		
		Collections.sort(list, new RatingComparatorSort());
		System.out.println("after sorting on rating");
		for (Movie2 movie : list) {
			System.out.println(movie);
		}
		
		Collections.sort(list, new CustomizedSort());
		System.out.println("after using customized sort");
		for (Movie2 movie : list) {
			System.out.println(movie);
		}
	}
}

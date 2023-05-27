package com.demo;

import java.util.Comparator;

public class LengthComparatorSort implements Comparator<Movie2> {

	@Override
	public int compare(Movie2 o1, Movie2 o2) {
		
		return (o1.getRunTime() - o2.getRunTime());
	}

	
	
}

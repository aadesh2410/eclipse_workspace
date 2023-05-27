package com.demo;

import java.util.Comparator;

public class NameComparatorSort implements Comparator<Movie2> {

	@Override
	public int compare(Movie2 movie1, Movie2 movie2) {
		
		return movie1.getName().compareTo(movie2.getName());
	}

	
	
}

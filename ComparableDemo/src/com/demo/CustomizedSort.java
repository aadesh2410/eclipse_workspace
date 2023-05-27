package com.demo;

import java.util.Comparator;

public class CustomizedSort implements Comparator<Movie2>{

	@Override
	public int compare(Movie2 movie1, Movie2 movie2) {
		
		
		int runtimeComparator = movie1.getRunTime() - movie2.getRunTime();
		int nameComparator = movie1.getName().compareTo(movie2.getName());
		double ratingComparator= movie1.getRating() - movie2.getRating();
		
		
		//if name values are same, return this oer that
//		if(nameComparator == 0) {
//			return runtimeComparator;
//		}else {
//			return nameComparator;
//		}
		
		return (int) ((ratingComparator == 0) ? ((nameComparator== 0) ? runtimeComparator:nameComparator) : ratingComparator);
	}

	
	
}

package com.demo;

import java.util.Comparator;

public class RatingComparatorSort implements Comparator<Movie2> {

	@Override
	public int compare(Movie2 o1, Movie2 o2) {
		if (o1.getRating() == o2.getRating())
			return 0;
		else if (o1.getRating() > o2.getRating()) {
			return 1;
		} else {
			return -1;
		}

	}

}

package com.demo;


//to sort movie object ascendingly using rating.
public class Movie implements Comparable<Movie> {

	String name;
	int runTime;
	float rating;
	public Movie(String name, int runTime, float rating) {
		super();
		this.name = name;
		this.runTime = runTime;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [name=" + name + ", runTime=" + runTime + ", rating=" + rating + "]";
	}
	@Override
	public int compareTo(Movie movie) {
//		if (movie.rating == rating) {
//			return 0;
//		}else if (movie.rating < rating) {
//			return 1; 
//		}else {
//			return -1;
//		}
		return (int) (runTime - movie.runTime);
	}
	
	
	
}

package com.demo;



public class Movie2{

	
	private String name;
	private int runTime;
	private float rating;
	public Movie2(String name, int runTime, float rating) {
		super();
		this.name = name;
		this.runTime = runTime;
		this.rating = rating;
	}
	
	public Movie2() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRunTime() {
		return runTime;
	}
	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie2 [name=" + name + ", runTime=" + runTime + ", rating=" + rating + "]";
	}
	
	
	
}

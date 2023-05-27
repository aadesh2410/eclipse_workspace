package com.test;

public class Address {

	private String streetName;
	private int pincode;
	private String city;
	private String state;
	private String country;
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", pincode=" + pincode + "]";
	}
	public Address(String streetName, String city, String state, String country) {
		super();
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
}

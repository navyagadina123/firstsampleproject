package com.cg.model;

public class Address {
	
	String street;
	String state;
	String city;
	int zipcode;
	String country;
	
	
	public Address() {
		super();
	}
	public Address(String street, String state, String city, int zipcode, String country) {
		super();
		this.street = street;
		this.state = state;
		this.city = city;
		this.zipcode = zipcode;
		this.country = country;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", state=" + state + ", city=" + city + ", zipcode=" + zipcode
				+ ", country=" + country + "]";
	}
	

}

package com.sravan.tableDemo.entity;



public class Address {
	// declaring address fields
	private int id;
	private String firstLine;
	private String secondLine;
	private String city;
	private String state;
	private int zipcode;
	
	
	public Address() {
		
	}
	
	//initialization the Address details using constructor 
	
	public Address(int id, String firstLine, String secondLine, String city, String state, int zipcode) {
		super();
		this.id = id;
		this.firstLine = firstLine;
		this.secondLine = secondLine;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	// Declaring getters and setters for columns
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstLine() {
		return firstLine;
	}
	public void setFirstLine(String firstLine) {
		this.firstLine = firstLine;
	}
	public String getSecondLine() {
		return secondLine;
	}
	public void setSecondLine(String secondLine) {
		this.secondLine = secondLine;
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
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", firstLine=" + firstLine + ", secondLine=" + secondLine + ", city=" + city
				+ ", state=" + state + ", zipcode=" + zipcode + "]";
	}
	
	
	
	
	

}

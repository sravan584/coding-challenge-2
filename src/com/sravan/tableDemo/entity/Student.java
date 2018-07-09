package com.sravan.tableDemo.entity;

import java.util.ArrayList;
import java.util.List;


public class Student {
	private long id;
	
	private String name;
	
	private int phone;
	
	private List<Address> address;
	
	
	
	//initialization the student details using default constructor 
	public Student() {
		this.id = 1;
		this.name = "sravan";
		this.phone = 123456;
		
	}
	//initialization the student details using constructor 

	public Student(long id, String name, int phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	
	// Declaring getters and setters for columns
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	

	
	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	public void add(Address tempAddress) {
		if(address==null) {
			address=new ArrayList<>();
		}

		address.add(tempAddress);
		
	}
	

	// overriding toString Class to return the student details
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
	
	

}

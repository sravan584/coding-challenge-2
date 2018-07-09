package com.sravan.tableDemo.controller;

import com.sravan.tableDemo.entity.Address;
import com.sravan.tableDemo.entity.Student;

public class CreateStudent {

	public static void main(String[] args) {
		// create student object
		// one way creating with no argument constutor
		Student theStudent=new Student();
		Address address1=new Address(1, " white blossom", "", "jacksonville", "FL", 32258);
		Address address2=new Address(2, "franklin river dr", "", "southfield", "MI", 48034);
		theStudent.add(address1);
		theStudent.add(address2);
		System.out.println(theStudent);

	}

}

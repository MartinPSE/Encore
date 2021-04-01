package com.encore.child;

import com.encore.parent.Person;

public class Student extends Person{
	
	private int stuID;

	public Student(String name, int age, String address, int stuID) {
		super(name, age, address);
		this.stuID = stuID;
	}

	@Override
	public String toString() {
		return super.toString()+","+"Student [stuID=" + stuID + "]";
	}
	
	
	

}

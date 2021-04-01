package com.encore.service;

import com.encore.util.MyDate;


public class Programmer {
	public String name;
	public MyDate birthdate;
	public String company;
	public String tech;
	public NoteBook notebook;
	
	
	public Programmer(String name, MyDate birthdate, String company, String tech) {
		super();
		this.name = name;
		this.birthdate = birthdate;
		this.company = company;
		this.tech = tech;
	}
	
	public void setNotebook(NoteBook notebook) {
		this.notebook = notebook;
	}
	public NoteBook getNoteBook() {
		return notebook;
	}
			
	
	public String getProgrammerInfo() {
		return name +"," + birthdate.getDate() + "," + company + "," + tech ;
	}
	
	
	

}

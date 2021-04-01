package com.encore.vo;

public class Engineer {
	
	private String name;
	private MyDate birthDate;
	private double salary;
	private String tech;
	private double bonus;
	
	public Engineer(String name, MyDate birthDate, double salary, String tech, double bonus) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.salary = salary;
		this.tech = tech;
		this.bonus = bonus;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBirthDate(MyDate birthDate) {
		this.birthDate = birthDate;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public String getName() {
		return name;
	}

	public MyDate getBirthDate() {
		return birthDate;
	}

	public double getSalary() {
		return salary;
	}

	public String getTech() {
		return tech;
	}

	public double getBonus() {
		return bonus;
	}
	
	public String getDetails() {
		return name+","+birthDate.toString()+","+salary+","+tech+","+bonus;
	}
	
	
	
	
	

}

package com.encore.banking;


public class Customer {
	public String name;
	public int ssn;


	public Customer(String name, int ssn) {
		this.name = name;
		this.ssn = ssn;
	}

	public Account account;

	public void setAccount(Account account) {
		this.account = account;
	}

	public Account getAccount() {
		return account;
	}
	
	public String getCustInfo(String name, int ssn) {
		return name +"," +  ssn;
	}
	
	
}


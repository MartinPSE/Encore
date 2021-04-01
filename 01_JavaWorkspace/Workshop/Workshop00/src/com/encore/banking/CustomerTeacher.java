package com.encore.banking;

// 은행 업무를 보는 고객 ... Account를 Hasing 해야 한다.



public class CustomerTeacher {
	public String name;
	public int ssn;

	
	// 1. 선언하자
	public AccountTeacher account;

	//2. 통장 주입
	public void setAccount(AccountTeacher account) {
		this.account = account;
	}

	//3. 고객이 개설한 통장을 받아서 사용하는 기능 
	public AccountTeacher getAccount() {
		return account;
	}

	
	//2. 주입의 통로
	public CustomerTeacher (String name, int ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	
	public String customerInfo() {
		return name +',' + ssn;
	}
	

}

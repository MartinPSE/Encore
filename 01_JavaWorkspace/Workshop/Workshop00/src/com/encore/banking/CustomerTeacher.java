package com.encore.banking;

// ���� ������ ���� �� ... Account�� Hasing �ؾ� �Ѵ�.



public class CustomerTeacher {
	public String name;
	public int ssn;

	
	// 1. ��������
	public AccountTeacher account;

	//2. ���� ����
	public void setAccount(AccountTeacher account) {
		this.account = account;
	}

	//3. ���� ������ ������ �޾Ƽ� ����ϴ� ��� 
	public AccountTeacher getAccount() {
		return account;
	}

	
	//2. ������ ���
	public CustomerTeacher (String name, int ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	
	public String customerInfo() {
		return name +',' + ssn;
	}
	

}

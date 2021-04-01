package com.encore.array;
/*
 *  ���� �������� ������ �ִ� ���� ������ ��� �ִ� Ŭ����
 */



public class Customer {
	
	// �ʵ� ����
	private String name;
	private int ssn;
	
	// ������ ��� ... ������ ����
	public Customer(String name, int ssn) {
		super();
		this.name = name;
		this.ssn = ssn;
	}
	
	//////////// Has a Relation //////////////	
	// �ʵ� �߰� --> �������� ������ ������ ���� �ǵ���
	private Account[] accounts;
		

	// ��� �߰� --> �߰��� �ʵ带 setter�� ����.
	public void setAccount(Account[] account) {
		this.accounts = account;
	}
	
	// ����߰� --> �߰��� �ʵ带 �޾ƿ��� ���
	public Account[] getAccount() {
		return accounts;
	}
	/////////////////////////////////////////
	
	// �ʵ� ������ �޾ƿ�
	public String getCustomerInfo() {
		return name + " , " + ssn;
	}

		

	


	
	
	
	

}

package self.bank;

public class Customer {
	// �߰�.. ( ��� ���� �߰� �Ѵ�..? --> �⺻���� �ٲ��ִ� ���. )
	public static final String DEFAULT_NAME = "Encore";	
	

	private String name;
	private int ssn; // �ֹι�ȣ
	private Account account;
	private Address address;
	
	// ������ �����ε�.
	/*
	 *  this Ű����
	 *  ::
	 *  1. �ʵ��� �̸��� ���� ������ �̸��� ������ �����ϱ� ���ؼ� �ʵ� �տ� ���ΰ�.
	 *  2. ������ ���� this ----> this(null, ssn);
	 *  	���� Ŭ�������� �Ǵٸ� �����ڸ� ȣ��
	 */
	
	public Customer(int ssn) {
		this (DEFAULT_NAME, ssn, null, null); 
	}
	
	public Customer(String name, int ssn, Address address) {
		this(name, ssn, address, null);
	}
	
	public Customer(String name, int ssn, Address address, Account account) {
		this.name = name;
		this.ssn = ssn;
		this.account = account;
		this.address = address;
	}
	



	public String getName() {
		return name;
	}
	public int getSsn() {
		return ssn;
	}
	public Account getAccount() {
		return account;
	}
	public Address getAddress() {
		return address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Customer [name=" + name + ", ssn=" + ssn + ", account=" + account + ", address=" + address + "]";
	}
	

	
	
}

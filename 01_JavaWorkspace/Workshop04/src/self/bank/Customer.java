package self.bank;

public class Customer {
	// 추가.. ( 상수 값을 추가 한다..? --> 기본값을 바꿔주는 방법. )
	public static final String DEFAULT_NAME = "Encore";	
	

	private String name;
	private int ssn; // 주민번호
	private Account account;
	private Address address;
	
	// 생성자 오버로딩.
	/*
	 *  this 키워드
	 *  ::
	 *  1. 필드의 이름과 로컬 변수의 이름이 같을때 구분하기 위해서 필드 앞에 붙인가.
	 *  2. 생성자 앞의 this ----> this(null, ssn);
	 *  	같은 클래스에서 또다른 생성자를 호출
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

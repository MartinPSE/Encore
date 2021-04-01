package self.bank;

public class BankService {
	
	public static final int MAX_CUSTOMERS = 100;
	public Customer[] customers;
	public int numberOfCustomers;
	
	
	private static BankService bank = new BankService();
	private BankService() {
		customers =new Customer[MAX_CUSTOMERS];
		numberOfCustomers = 0;
	}
	
	public static BankService GetInstance() {
		return bank;
	}
	public void addCustomer(Customer cust) {		
		//구현..배열에 cust를 추가한다.
		if (numberOfCustomers==MAX_CUSTOMERS) { // 고객의 수가 꽉찼다.
			System.out.println("고객의 수가 꽉찼습니다.");
			return ; 
		}
		else {
			customers[numberOfCustomers++] = cust;
		}
		
	}
	
	public Customer getCustomer(int ssn) {
		
		//구현,  ssn 같으면 만들지 마세요.
		Customer customer = null;
		for (int i = 0; i<numberOfCustomers ; i ++) {
			if(customers[i].getSsn() == ssn) customer = customers[i];		
			} return customer;
	}
	
	public void showAll() {
		if(numberOfCustomers == 0) {
			System.out.println("회원이 아무도 없습니다.");
			return;
		}
		//구현
		//여기서 출력되도록 합니다...return type이 void^^
		for (int i =0; i<numberOfCustomers ; i++ ) {
			System.out.println(customers[i]);
		}
	}
}

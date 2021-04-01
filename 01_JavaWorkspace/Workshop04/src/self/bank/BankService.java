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
		//����..�迭�� cust�� �߰��Ѵ�.
		if (numberOfCustomers==MAX_CUSTOMERS) { // ���� ���� ��á��.
			System.out.println("���� ���� ��á���ϴ�.");
			return ; 
		}
		else {
			customers[numberOfCustomers++] = cust;
		}
		
	}
	
	public Customer getCustomer(int ssn) {
		
		//����,  ssn ������ ������ ������.
		Customer customer = null;
		for (int i = 0; i<numberOfCustomers ; i ++) {
			if(customers[i].getSsn() == ssn) customer = customers[i];		
			} return customer;
	}
	
	public void showAll() {
		if(numberOfCustomers == 0) {
			System.out.println("ȸ���� �ƹ��� �����ϴ�.");
			return;
		}
		//����
		//���⼭ ��µǵ��� �մϴ�...return type�� void^^
		for (int i =0; i<numberOfCustomers ; i++ ) {
			System.out.println(customers[i]);
		}
	}
}

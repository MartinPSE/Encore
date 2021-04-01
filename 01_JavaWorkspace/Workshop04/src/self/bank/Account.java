package self.bank;

public class Account {
	public int balance;

	public Account(int balance) {
		this.balance = balance;
	}
	
	
	public void deposit (int amt) {
		if ( amt < 1000 ) {
			System.out.println("�Աݾ��� 1000�� �̻��̾�� �մϴ�.");
			return;
			}
		else balance += amt;
	}
	
	public void withdraw (int amt) { 
		if ( amt > balance) {
			System.out.println("���忡 �ܾ��� �����մϴ�");
			return;
		}
		balance -= amt;
	}

	@Override
	public String toString() {
		return  "���� �ܾ��� " + balance + "�� �Դϴ�.";
	}
	
	
	
}

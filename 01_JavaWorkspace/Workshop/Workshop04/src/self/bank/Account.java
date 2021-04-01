package self.bank;

public class Account {
	public int balance;

	public Account(int balance) {
		this.balance = balance;
	}
	
	
	public void deposit (int amt) {
		if ( amt < 1000 ) {
			System.out.println("입금액은 1000원 이상이어야 합니다.");
			return;
			}
		else balance += amt;
	}
	
	public void withdraw (int amt) { 
		if ( amt > balance) {
			System.out.println("통장에 잔액이 부족합니다");
			return;
		}
		balance -= amt;
	}

	@Override
	public String toString() {
		return  "현재 잔액은 " + balance + "원 입니다.";
	}
	
	
	
}

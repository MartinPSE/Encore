package exception.user.test;

import java.util.Scanner;

class Account {
	int balance;
	
	public Account () {}
	
	public Account(int balance) {
		super();
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}
	
	
	
	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int amt) throws AmountInputException{
		// �Աݾ��� 10000���� �ȵǸ� AmountInputException�� �߻�
		if (amt < 10000) throw new AmountInputException();
		
		// �������� �Ա��̸� �ܾ׿� �ݾ��� �߰��ϰ� �Աݵ� �ݾװ� �����ܰ�� ������ ����Ѵ�.
		else {
			balance += amt;
			System.out.println("�Աݵ� �ݾ��� : " + amt +"�� �Դϴ�"+"\n���� �����ܰ�� : "+balance+"�� �Դϴ�");
		}
		
	
	}
	
	public void withdraw(int amt) throws InvalidAmountException{
		
		// ���� �ܾ׺��� �� ���� �ݾ��� ����Ϸ��� ��� InvalidAmountException �߻�
		if (amt > balance) throw new InvalidAmountException();
		// ��ݾ��� �ܾ׺��� �۰ų� ���ٸ� �ܾ׿��� ��ݾ��� ����.. �� ����ߴ����� �����ܰ� ���.
		else{
			balance -= amt;
			System.out.println("��ݾ��� : " + amt +"�� �̰�, ���� �����ܰ�� " + balance + "�� �Դϴ�.");
		}
	}
	
	
}


class AmountInputException extends Exception {
	
	AmountInputException() {
		this("10000�� �̻���� �Ա��� �����Ͻʴϴ�.");
	}
	AmountInputException(String message) {
		super(message);
		
	}
	
}

class InvalidAmountException extends Exception {
	
	InvalidAmountException() {
		this("�ܾ��� �����մϴ�.");
	}
	InvalidAmountException(String message){
		super(message);
	}
	
	
}






public class BankAccountExceptionTest4 {

	public static void main(String[] args) {
		
		/*
		 *  ��ü ����
		 * �޼ҵ� ����ȣ�� .. ���ܸ� ���⼭ �������!
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		Account acc = new Account();
		int current = acc.getBalance();
		if (current == 0) {
			System.out.println("���� ���忡 ���� �����ʴϴ�.");
			System.out.println("���忡 ���� �Ա� �Ŀ� ���� ������ �������ּ���>>>");
			
			int money = sc.nextInt();
			acc.setBalance(money);
		}
		
		
		System.out.println("1.�Ա� 2. ���");
		int option = sc.nextInt();
		
		switch(option) {
		case 1:
			System.out.println("�Ա� �Ͻ� �ݾ�(��)�� �Է����ּ��� : ");
			int amt = sc.nextInt();
			try {
				acc.deposit(current+amt);
			} catch (AmountInputException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 2:
			System.out.println("��� �Ͻ� �ݾ�(��)�� �Է����ּ��� : ");
			int amt1 = sc.nextInt();
			try {
				acc.withdraw(amt1);
			} catch (InvalidAmountException e) {
				System.out.println(e.getMessage());
			}
			break;
		
		}
		
		
		
	}

}

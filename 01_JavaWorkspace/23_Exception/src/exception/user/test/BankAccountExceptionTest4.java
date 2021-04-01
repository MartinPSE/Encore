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
		// 입금액이 10000원이 안되면 AmountInputException을 발생
		if (amt < 10000) throw new AmountInputException();
		
		// 정상적인 입금이면 잔액에 금액을 추가하고 입금된 금액과 통장잔고는 얼마인지 출력한다.
		else {
			balance += amt;
			System.out.println("입금된 금액은 : " + amt +"원 입니다"+"\n현재 통장잔고는 : "+balance+"원 입니다");
		}
		
	
	}
	
	public void withdraw(int amt) throws InvalidAmountException{
		
		// 현재 잔액보다 더 많음 금액을 출금하려는 경우 InvalidAmountException 발생
		if (amt > balance) throw new InvalidAmountException();
		// 출금액이 잔액보다 작거나 같다면 잔액에서 출금액을 빼고.. 얼마 출금했는지와 통장잔고 출력.
		else{
			balance -= amt;
			System.out.println("출금액은 : " + amt +"원 이고, 현재 통장잔고는 " + balance + "원 입니다.");
		}
	}
	
	
}


class AmountInputException extends Exception {
	
	AmountInputException() {
		this("10000원 이상부터 입금이 가능하십니다.");
	}
	AmountInputException(String message) {
		super(message);
		
	}
	
}

class InvalidAmountException extends Exception {
	
	InvalidAmountException() {
		this("잔액이 부족합니다.");
	}
	InvalidAmountException(String message){
		super(message);
	}
	
	
}






public class BankAccountExceptionTest4 {

	public static void main(String[] args) {
		
		/*
		 *  객체 생성
		 * 메소드 각각호출 .. 예외를 여기서 잡아주자!
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		Account acc = new Account();
		int current = acc.getBalance();
		if (current == 0) {
			System.out.println("현재 통장에 돈이 없으십니다.");
			System.out.println("통장에 돈을 입금 후에 다음 과정을 진행해주세요>>>");
			
			int money = sc.nextInt();
			acc.setBalance(money);
		}
		
		
		System.out.println("1.입금 2. 출금");
		int option = sc.nextInt();
		
		switch(option) {
		case 1:
			System.out.println("입금 하실 금액(원)을 입력해주세요 : ");
			int amt = sc.nextInt();
			try {
				acc.deposit(current+amt);
			} catch (AmountInputException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 2:
			System.out.println("출금 하실 금액(원)을 입력해주세요 : ");
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

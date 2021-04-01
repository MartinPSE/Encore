package self.bank.test;

/*
 * 
 *   KeyPoint 는 BankService.getinstane 를 이용해서 --> BankService 를 calling 해야 한다.
 *   
 */

import java.rmi.server.ServerCloneException;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import self.bank.Account;
import self.bank.Address;
import self.bank.BankService;
import self.bank.Customer;

public class BankTest {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 화면을 대신한다.
		while(true) {
			System.out.println("1.고객 등록    2.계좌생성    3.은행업무    4.고객전체명단    5.특정고객정보    6.나가기");
			int num = sc.nextInt();
			
			switch (num) {
			case 1:
				addCustomer();
				break;
				
			case 2:
				createAccount();
				break;
				
			case 3:
				banking();
				break;
			case 4:
				BankService.GetInstance().showAll();
				break;
			case 5:
				showCustomer();
				break;
			case 6:
				System.out.println("이용해주셔서 감사합니다.");
				sc.close();
				return;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
		
	}
	
	public static void addCustomer() {
		System.out.println("[ 이름  주민등록번호 우편번호 도(행정구역) 지역명 ]순으로 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		//1. Scanner로 name, ssn, zipCode, region, city값을 각각 입력받는다.
		String name = sc.next(); 
		int ssn = sc.nextInt();
		int zipCode = sc.nextInt();
		String region = sc.next();
		String city = sc.next();
		
	
		//2. 입력받은 값으로Customer 객체를 생성
		Customer newCustomer = new Customer(name, ssn, new Address(zipCode, region, city));
		
		//3. 배열에 추가함 ---> service 클래스에 있는 addCustomer() calling 
		
		BankService.GetInstance().addCustomer(newCustomer);
		
		
		
		System.out.println(name + "님 회원등록 성공했습니다.");		
	}
	
	public static void createAccount() {
		System.out.print("회원의 주민번호를 입력하세요 : "); // 회원인 사람만 통장을 개설하게 하기 위한 필터링. 
		
		Scanner sc = new Scanner(System.in);
		int ssn = sc.nextInt();
		
		int balance = 0;

		//1. 입력받은 ssn에 해당하는 고객이 없지 않다면 통장개설을 하기위한 잔액을 먼저 입력받고 통장을 개설함
		if(BankService.GetInstance().getCustomer(ssn).getName() != "") { // 등록된 이름이 있으면 (즉, 회원이 존재한다면)
			System.out.println(" 잔액을 먼저 입력해주세요");
			balance = sc.nextInt(); //  이 금액으로 계좌 개설
			
			BankService.GetInstance().getCustomer(ssn).setAccount(new Account(balance));
						
		}		
				
		//2. 만약에 회원이 없다면 return시킴
		else {
			System.out.println("회원 가입을 먼저 해주셔야 합니다.");
			return;
		}
		
		
	}

	public static void showCustomer() {
		System.out.print("회원의 주민번호를 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		int ssn = sc.nextInt();
		// 1. 주민번호에 해당하는 고객이 존재한다면 정보를 출력함
		
		if (BankService.GetInstance().getCustomer(ssn) != null) {
			System.out.println(BankService.GetInstance().getCustomer(ssn));
		}
	
		
		// 2. 그렇지 않다면 존재하는 회원이 없다는 메세지를 출력하고 return
		else {
			System.out.println("존재하지 않는 회원입니다");
			return ; 
		}
		
	}
	
	public static void banking() {
		System.out.print("회원의 주민번호를 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		int ssn = sc.nextInt();
		
		if(BankService.GetInstance().getCustomer(ssn) == null) {
			System.out.println("존재하는 회원이 없습니다.");
			return;
		}
		
		if(BankService.GetInstance().getCustomer(ssn).getAccount() == null) {
			System.out.println("통장개설부터 하세요.");
			return;
		}
		
		while(true) {
			System.out.println("1.입금    2.출금    3.잔액확인    4.나가기");
			int num = sc.nextInt();
			
			switch (num) {
			case 1:
				deposit(ssn);
				break;
				
			case 2:
				withdraw(ssn);
				break;
			case 3:
				showBalance(ssn);
				break;
			case 4:
				System.out.println("안녕히 가세요");
				return;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}
	
	public static void deposit(int ssn) {
		System.out.print("입금할 금액을 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		int amt = sc.nextInt();
		
		BankService.GetInstance().getCustomer(ssn).getAccount().deposit(amt);
		System.out.println(BankService.GetInstance().getCustomer(ssn).getAccount());
	}
	
	public static void withdraw(int ssn) {
		System.out.print("출금할 금액을 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		int amt = sc.nextInt();
		BankService.GetInstance().getCustomer(ssn).getAccount().withdraw(amt);
		System.out.println(BankService.GetInstance().getCustomer(ssn).getAccount());
		// 위와 동일하게 로직 작성
	}
	
	public static void showBalance(int ssn) {
		System.out.println(BankService.GetInstance().getCustomer(ssn).getAccount());
		//고객의 잔액을 출력한다.     Service 객체 가져오고 --> 특정고객가져오고 --> 고객의 계좌 --> 고객의 잔고.
	}
	
}

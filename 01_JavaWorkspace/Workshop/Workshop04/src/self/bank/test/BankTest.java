package self.bank.test;

/*
 * 
 *   KeyPoint �� BankService.getinstane �� �̿��ؼ� --> BankService �� calling �ؾ� �Ѵ�.
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
		Scanner sc = new Scanner(System.in); // ȭ���� ����Ѵ�.
		while(true) {
			System.out.println("1.�� ���    2.���»���    3.�������    4.����ü���    5.Ư��������    6.������");
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
				System.out.println("�̿����ּż� �����մϴ�.");
				sc.close();
				return;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				break;
			}
		}
		
	}
	
	public static void addCustomer() {
		System.out.println("[ �̸�  �ֹε�Ϲ�ȣ �����ȣ ��(��������) ������ ]������ �Է��ϼ���.");
		
		Scanner sc = new Scanner(System.in);
		//1. Scanner�� name, ssn, zipCode, region, city���� ���� �Է¹޴´�.
		String name = sc.next(); 
		int ssn = sc.nextInt();
		int zipCode = sc.nextInt();
		String region = sc.next();
		String city = sc.next();
		
	
		//2. �Է¹��� ������Customer ��ü�� ����
		Customer newCustomer = new Customer(name, ssn, new Address(zipCode, region, city));
		
		//3. �迭�� �߰��� ---> service Ŭ������ �ִ� addCustomer() calling 
		
		BankService.GetInstance().addCustomer(newCustomer);
		
		
		
		System.out.println(name + "�� ȸ����� �����߽��ϴ�.");		
	}
	
	public static void createAccount() {
		System.out.print("ȸ���� �ֹι�ȣ�� �Է��ϼ��� : "); // ȸ���� ����� ������ �����ϰ� �ϱ� ���� ���͸�. 
		
		Scanner sc = new Scanner(System.in);
		int ssn = sc.nextInt();
		
		int balance = 0;

		//1. �Է¹��� ssn�� �ش��ϴ� ���� ���� �ʴٸ� ���尳���� �ϱ����� �ܾ��� ���� �Է¹ް� ������ ������
		if(BankService.GetInstance().getCustomer(ssn).getName() != "") { // ��ϵ� �̸��� ������ (��, ȸ���� �����Ѵٸ�)
			System.out.println(" �ܾ��� ���� �Է����ּ���");
			balance = sc.nextInt(); //  �� �ݾ����� ���� ����
			
			BankService.GetInstance().getCustomer(ssn).setAccount(new Account(balance));
						
		}		
				
		//2. ���࿡ ȸ���� ���ٸ� return��Ŵ
		else {
			System.out.println("ȸ�� ������ ���� ���ּž� �մϴ�.");
			return;
		}
		
		
	}

	public static void showCustomer() {
		System.out.print("ȸ���� �ֹι�ȣ�� �Է��ϼ��� : ");
		
		Scanner sc = new Scanner(System.in);
		int ssn = sc.nextInt();
		// 1. �ֹι�ȣ�� �ش��ϴ� ���� �����Ѵٸ� ������ �����
		
		if (BankService.GetInstance().getCustomer(ssn) != null) {
			System.out.println(BankService.GetInstance().getCustomer(ssn));
		}
	
		
		// 2. �׷��� �ʴٸ� �����ϴ� ȸ���� ���ٴ� �޼����� ����ϰ� return
		else {
			System.out.println("�������� �ʴ� ȸ���Դϴ�");
			return ; 
		}
		
	}
	
	public static void banking() {
		System.out.print("ȸ���� �ֹι�ȣ�� �Է��ϼ��� : ");
		
		Scanner sc = new Scanner(System.in);
		int ssn = sc.nextInt();
		
		if(BankService.GetInstance().getCustomer(ssn) == null) {
			System.out.println("�����ϴ� ȸ���� �����ϴ�.");
			return;
		}
		
		if(BankService.GetInstance().getCustomer(ssn).getAccount() == null) {
			System.out.println("���尳������ �ϼ���.");
			return;
		}
		
		while(true) {
			System.out.println("1.�Ա�    2.���    3.�ܾ�Ȯ��    4.������");
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
				System.out.println("�ȳ��� ������");
				return;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				break;
			}
		}
	}
	
	public static void deposit(int ssn) {
		System.out.print("�Ա��� �ݾ��� �Է��ϼ��� : ");
		
		Scanner sc = new Scanner(System.in);
		int amt = sc.nextInt();
		
		BankService.GetInstance().getCustomer(ssn).getAccount().deposit(amt);
		System.out.println(BankService.GetInstance().getCustomer(ssn).getAccount());
	}
	
	public static void withdraw(int ssn) {
		System.out.print("����� �ݾ��� �Է��ϼ��� : ");
		
		Scanner sc = new Scanner(System.in);
		int amt = sc.nextInt();
		BankService.GetInstance().getCustomer(ssn).getAccount().withdraw(amt);
		System.out.println(BankService.GetInstance().getCustomer(ssn).getAccount());
		// ���� �����ϰ� ���� �ۼ�
	}
	
	public static void showBalance(int ssn) {
		System.out.println(BankService.GetInstance().getCustomer(ssn).getAccount());
		//���� �ܾ��� ����Ѵ�.     Service ��ü �������� --> Ư������������ --> ���� ���� --> ���� �ܰ�.
	}
	
}

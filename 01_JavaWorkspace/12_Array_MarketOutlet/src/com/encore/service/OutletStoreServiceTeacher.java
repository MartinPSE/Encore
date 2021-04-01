package com.encore.service;

import com.encore.vo.Customer;
import com.encore.vo.Product;

/*
 *  ��ǰ�� �����ϴ� ��, 
 *  ������ ������ ��ǰ������ �ٷ�� ����� ��Ƴ��� <���� class>
 *   --> VO�� �����ϴ� �� �����ͺ��̽��� �����ϴ� ����
 *  
 */

public class OutletStoreServiceTeacher {
 // �޼ҵ� ����� -> ���� type, �̸�, ���ڰ�
	// �޼ҵ� ������ --> logic �ۼ� 
	
	// 1. Ư�� ���� ������ ��ǰ������ �����ϴ� ���
	public Product[] getProduct(Customer vo) {
		return vo.getProducts();
	
	}

		
	// 2. Ư�� ���� ������ ��ǰ�� maker�鸸 �����ϴ� ���
	public String [] getAllProductMaker(Customer customer) {
		String [ ] temp = new String[customer.getProducts().length];
		Product [ ] pros = customer.getProducts();
		int cnt = 0 ;
		for ( Product p : pros ) temp[cnt++] = p.getMaker();
		return temp;}
		
	// 3. Outlet�� �ִ� ��� ���� �����ϴ� ���
	public Customer[] getAllCustomer (Customer [] customers) {
		Customer [ ] temp = new Customer[customers.length];
		int cnt = 0 ;
		for ( Customer c : customers) temp[cnt++] = c ;
		return temp;
	}
	// 4. ��� ���߿� Ư�� ���� �˻�(ã�Ƴ���) ���
	public Customer getCustomer(Customer [] customers, int ssn) {
		Customer customer = null;
		for ( Customer c : customers) {
			if(c.getSsn() == ssn) {
				customer = c;
			}
		}
		return customer;
		
	}
	
	// 5. Ư�� ���� ������ ���� �� �ְ��� �ش��ϴ� ������ ������ �����ϴ� ���
	
	public int maxPriceProduct(Customer customer) {
		int maxPrice = 0 ;
		Product [ ] pros = customer.getProducts();
		for ( Product p : pros) {
			if(p.getPrice() > maxPrice) maxPrice = p.getPrice(); 
		}
		
		return maxPrice;
	}
	// 6. ��� ���� ������ ���� �� Ư������ �̻�Ǵ� ��ǰ�� �����ϴ� ���
	public Product[ ] getMorePriceProducts( Customer[] customers, int price) {
		int len = 0 ;
		int cnt = 0;
		for ( Customer c : customers) {
			len += c.getProducts().length;
		}
		Product [ ] temp = new Product[len];
		for ( Customer c : customers )
			for ( Product p : c.getProducts()) {
				if (p.getPrice() > price) {
					temp[cnt++] = p;
				}
			} return temp;
		
	}

		
	
	// 7. ������ ���׿� ����ִ� ���鸸 �����ϴ� ���. 
	
	public Customer[] sameTownCustomer (Customer[] customers, String town) {
		Customer [] temp = new Customer[customers.length];
		int cnt = 0;
		for (Customer c : temp) {
			if (c.getAddress().equals(town)) {
				temp[cnt++] = c;
			}
		} return temp;
		
		
	}
	
	
	
}
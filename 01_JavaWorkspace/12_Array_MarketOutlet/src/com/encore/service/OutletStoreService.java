package com.encore.service;

import com.encore.vo.Customer;
import com.encore.vo.Product;

/*
 *  ��ǰ�� �����ϴ� ��, 
 *  ������ ������ ��ǰ������ �ٷ�� ����� ��Ƴ��� <���� class>
 *   --> VO�� �����ϴ� �� �����ͺ��̽��� �����ϴ� ����
 *  
 */

public class OutletStoreService {
 // �޼ҵ� ����� -> ���� type, �̸�, ���ڰ�
	// �޼ҵ� ������ --> logic �ۼ� 
	
	// 1. Ư�� ���� ������ ��ǰ������ �����ϴ� ���
	public String[] getAllProductBuy(Customer customer) {
		String [] products = new String[customer.getProducts().length];
		int idx = 0;
		for ( Product product1 : customer.getProducts()) {
			products[idx++] = product1.getDetail();
		
		} return products;
			
	}

		
	// 2. Ư�� ���� ������ ��ǰ�� maker�鸸 �����ϴ� ���
	public String [] getAllProductMaker(Customer customer) {
		if (customer.getProducts() != null) {
			String [] maker = new String[customer.getProducts().length];
			int idx = 0;
			for ( Product product : customer.getProducts()) {
				maker[idx++] = product.getMaker();
			}
			return maker;}
	 return null;}
	// 3. Outlet�� �ִ� ��� ���� �����ϴ� ���
	public Customer[] getAllCustomer (Customer [] customers) {
		return customers;
	}
	// 4. ��� ���߿� Ư�� ���� �˻�(ã�Ƴ���) ���
	
	public Customer getACustomer(Customer[] customers, int ssn) {
		for ( Customer customer : customers) {
			if(customer.getSsn() == ssn ) {
				return customer;
			}
			} return null;
	}
	// 5. Ư�� ���� ������ ���� �� �ְ��� �ش��ϴ� ������ ������ �����ϴ� ���
	
	public int maxPriceProduct(Customer customer) {
		int max = 0 ;
		for ( Product product: customer.getProducts()) {
			if(product.getPrice() > max) {
				max = product.getPrice();
			}
		}return max;
	}
	// 6. ��� ���� ������ ���� �� Ư������ �̻�Ǵ� ��ǰ�� �����ϴ� ���
	public Product [] getMoreAvgProduct(Customer customer) {
		Product [] products = new Product[customer.getProducts().length];
		
		int sum = 0;
		int idx = 0;
		for ( Product product : customer.getProducts()) {
			sum += product.getPrice();
		}
		
		int avg = sum / customer.getProducts().length;
		for ( Product product : customer.getProducts()) {
			if (product.getPrice() > avg ) {
				products[idx++] = product;
			}
		} return products;
		
	}
	
	// 7. ������ ���׿� ����ִ� ���鸸 �����ϴ� ���. 
	
	public Customer[] sameTownCustomer (Customer[] customers, String town) {
		for ( Customer customer : customers ) {
			if (town == customer.getAddress()) {
				return customers;
			}
		} return null;
		
	}
	
	
	
}
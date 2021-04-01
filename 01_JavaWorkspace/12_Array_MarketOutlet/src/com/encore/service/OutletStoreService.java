package com.encore.service;

import com.encore.vo.Customer;
import com.encore.vo.Product;

/*
 *  상품을 구입하는 고객, 
 *  상점에 입점된 상품정보를 다루는 기능을 모아놓은 <서비스 class>
 *   --> VO에 의존하는 즉 데이터베이스에 의존하는 느낌
 *  
 */

public class OutletStoreService {
 // 메소드 선언부 -> 리턴 type, 이름, 인자값
	// 메소드 구현부 --> logic 작성 
	
	// 1. 특정 고객이 구입한 상품정보를 리턴하는 기능
	public String[] getAllProductBuy(Customer customer) {
		String [] products = new String[customer.getProducts().length];
		int idx = 0;
		for ( Product product1 : customer.getProducts()) {
			products[idx++] = product1.getDetail();
		
		} return products;
			
	}

		
	// 2. 특정 고객이 구입한 상품의 maker들만 리턴하는 기능
	public String [] getAllProductMaker(Customer customer) {
		if (customer.getProducts() != null) {
			String [] maker = new String[customer.getProducts().length];
			int idx = 0;
			for ( Product product : customer.getProducts()) {
				maker[idx++] = product.getMaker();
			}
			return maker;}
	 return null;}
	// 3. Outlet에 있는 모든 고객을 리턴하는 기능
	public Customer[] getAllCustomer (Customer [] customers) {
		return customers;
	}
	// 4. 모든 고객중에 특정 고객을 검색(찾아내는) 기능
	
	public Customer getACustomer(Customer[] customers, int ssn) {
		for ( Customer customer : customers) {
			if(customer.getSsn() == ssn ) {
				return customer;
			}
			} return null;
	}
	// 5. 특정 고객이 구입한 물건 중 최고가에 해당하는 물건의 가격을 리턴하는 기능
	
	public int maxPriceProduct(Customer customer) {
		int max = 0 ;
		for ( Product product: customer.getProducts()) {
			if(product.getPrice() > max) {
				max = product.getPrice();
			}
		}return max;
	}
	// 6. 모든 고객이 구입한 물건 중 특정가격 이상되는 제품을 리턴하는 기능
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
	
	// 7. 동일한 동네에 살고있는 고객들만 리턴하는 기능. 
	
	public Customer[] sameTownCustomer (Customer[] customers, String town) {
		for ( Customer customer : customers ) {
			if (town == customer.getAddress()) {
				return customers;
			}
		} return null;
		
	}
	
	
	
}
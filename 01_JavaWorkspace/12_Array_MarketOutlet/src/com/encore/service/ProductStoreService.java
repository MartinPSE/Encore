package com.encore.service;

import com.encore.vo.Product;


/*
 * ProductStore에 있는 다양한 상품들을 다루는 기능만을 모아놓은 클래스.
 * --> 이런 기능만으로 작성된 클래스를 서비스(Manage) 클래스라 한다.
 * 
 * 
 * 이 클래스에서 다루는 기능들
 *  1) 모든 상품들의 maker를 출력하는 기능
 *  2) 상품들의 총 구입액을 리턴하는 기능
 *  3) 특정 금액 이상이 되는 상품을 리턴하는 기능
 *  4) 특정회사 제품들을 리턴하는 기능 
 *  5) 구입한 상품의 평균가를 리턴하는 기능
 *  		--> 기능의 Identifier 지정하는 방법도 함께 ( Method의 이름을 정하는 )
 *  
 */

public class ProductStoreService {
	
	public void printAllProductMaker(Product[] products) {
		for (Product p : products ) {
			System.out.println(p.getMaker());
		}
	}
	
	public int getTotalProductprice(Product [] products) {
		int sum = 0;
		for (Product p: products) {
			sum += p.getPrice() * p.getQuantity();
				
		} return sum; 
	}
	
	public Product[ ] getMorePrice(Product [] products, int price) {
		Product [] temp = new Product [products.length];
		int idx = 0;
		for(Product p : products) {
			if (p.getPrice() >= price) 	temp[idx++] = p;
//				idx++;
			
		}
		return temp;
	}
		
		


	public Product [] getCertainCompany(Product [ ] products, String company) {
		Product[ ] temp = new Product[products.length];
		int idx =0 ;
		for (Product p : products) {
			if (p.getCompany().equals(company)) temp[idx++] = p;
				
		} return temp;
	}
	
	
	public int[] getAvgPrice(Product[] products) {
		// 총가격을 구한다. --> 위에서 정의한 총가격을 구하는 메소드를 호출
		// --> 재사용 ! 
		int[] avg = new int[products.length];
		int idx = 0 ;
		for (Product p : products) {
			avg[idx++] = p.getPrice() / p.getQuantity();
			
			
		}
		return avg;
		// 총가격 을 갯수로 나누자
	}
}
	


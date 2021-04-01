package com.encore.service;

import com.encore.vo.Product;


/*
 * ProductStore�� �ִ� �پ��� ��ǰ���� �ٷ�� ��ɸ��� ��Ƴ��� Ŭ����.
 * --> �̷� ��ɸ����� �ۼ��� Ŭ������ ����(Manage) Ŭ������ �Ѵ�.
 * 
 * 
 * �� Ŭ�������� �ٷ�� ��ɵ�
 *  1) ��� ��ǰ���� maker�� ����ϴ� ���
 *  2) ��ǰ���� �� ���Ծ��� �����ϴ� ���
 *  3) Ư�� �ݾ� �̻��� �Ǵ� ��ǰ�� �����ϴ� ���
 *  4) Ư��ȸ�� ��ǰ���� �����ϴ� ��� 
 *  5) ������ ��ǰ�� ��հ��� �����ϴ� ���
 *  		--> ����� Identifier �����ϴ� ����� �Բ� ( Method�� �̸��� ���ϴ� )
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
		// �Ѱ����� ���Ѵ�. --> ������ ������ �Ѱ����� ���ϴ� �޼ҵ带 ȣ��
		// --> ���� ! 
		int[] avg = new int[products.length];
		int idx = 0 ;
		for (Product p : products) {
			avg[idx++] = p.getPrice() / p.getQuantity();
			
			
		}
		return avg;
		// �Ѱ��� �� ������ ������
	}
}
	


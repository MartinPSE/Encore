package com.encore.test;
import com.encore.vo.Product;

/*
 * 
 */

public class ProductArrayTest1 {

	public static void main(String[] args) {
		// 1. Product Type�� �迭�� 3�� ����
		// 2. product�� 3�� ����
		// 1,2 �� �ѹ��� 
		
		
		Product[] products = { new Product("Nike", 10000, 50,"USA"),
										new Product("Adidas", 15000, 100,"USA"),
										new Product("Masion Marigela", 500000,20,"ITALY"),
										new Product("Gucci", 1500000, 15,"FRANCE")};

		// 3. for���� �̿��ؼ� product ������ ��� 
		for (Product p : products ) {
			System.out.println(p.getDetail());
		}
		
	}
	

}

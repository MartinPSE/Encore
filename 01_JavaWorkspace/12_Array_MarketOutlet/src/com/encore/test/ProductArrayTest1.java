package com.encore.test;
import com.encore.vo.Product;

/*
 * 
 */

public class ProductArrayTest1 {

	public static void main(String[] args) {
		// 1. Product Type의 배열을 3개 생성
		// 2. product를 3개 생성
		// 1,2 를 한번에 
		
		
		Product[] products = { new Product("Nike", 10000, 50,"USA"),
										new Product("Adidas", 15000, 100,"USA"),
										new Product("Masion Marigela", 500000,20,"ITALY"),
										new Product("Gucci", 1500000, 15,"FRANCE")};

		// 3. for문을 이용해서 product 정보를 출력 
		for (Product p : products ) {
			System.out.println(p.getDetail());
		}
		
	}
	

}

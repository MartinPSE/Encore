package com.encore.test;
import com.encore.vo.Product;
// 기능들을 추가해 보자

public class ProductArrayTest2 {

	public static void main(String[] args) {
		// 1. Product Type의 배열을 3개 생성
		// 2. product를 3개 생성
		// 1,2 를 한번에 
		
		
		Product[] products = { new Product("Nike", 10000, 50, "USA"),
										new Product("Adidas", 15000, 100, "USA"),
										new Product("Masion Marigela", 500000,20,"ITALY"),
										new Product("Gucci", 1500000, 15,"FRANCE")};
		
		// 1. 상품들의 메이커를 출력합니다.
		System.out.println("====== 상품들의 메이커를 출력해보자 ======");
		for (Product p : products ) {
			System.out.println(p.getMaker());
		}
		// 2. 특정가격 이상의 제품만 출력
		System.out.println("======= 10 만원 이상하는 제품들 ====== ");
		for (Product p2:products) {
			if (p2.getPrice() >= 100000) {
				System.out.println(p2.getDetail());
			}
			
		}
		System.out.println(" === 총 구입 가격을 출력합니다 === ");
		int total = 0;
		for(Product p : products) {
			total += p.getPrice() * p.getQuantity();
		} System.out.println(total);
		
	}
	

}

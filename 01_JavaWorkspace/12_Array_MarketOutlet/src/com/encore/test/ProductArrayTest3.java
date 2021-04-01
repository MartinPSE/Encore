package com.encore.test;
import com.encore.service.ProductStoreService;
import com.encore.vo.Product;
// 기능들을 추가해 보자

public class ProductArrayTest3 {

	public static void main(String[] args) {
		// Service 객체 생성.
		
		ProductStoreService service = new ProductStoreService();
		
		
		Product[] products = { new Product("Nike", 7000, 50, "USA"),
										new Product("Adidas", 15000, 100, "USA"),
										new Product("Masion Marigela", 500000,20,"ITALY"),
										new Product("Gucci", 1500000, 15,"FRANCE")};
		
		System.out.println("===== 1. 모든 상품의 메이커를 출력합니다. ===== ");
		service.printAllProductMaker(products);
		System.out.println("===== 2. 모든 상품의 총 구입액을 받습니다. ===== ");
		System.out.println(service.getTotalProductprice(products) +"원");
		System.out.println("===== 3. 일정 금액 이상의 상품을 보여줍니다.===== ");
		Product[] returnPros = service.getMorePrice(products, 10000);
				for ( Product p : returnPros) {
					if (p==null) continue;
					System.out.println(p.getDetail());;
				}
				System.out.println("===== 4. 회사가 같은 회사 상품을 보여줍니다=====");
				Product [] returnPros2 = service.getCertainCompany(products, "USA");
				for ( Product p : returnPros2) {
					if(p==null) continue;
					System.out.println(p.getDetail());}
				System.out.println("===== 5. 제품들의 평균가 입니다. =====");
				
				int[] returnPros3 = service.getAvgPrice(products);
				for ( int p : returnPros3) {
					if(p==0) continue;
					System.out.println(p);}
				
				}
				
		
	

}

package com.encore.test;
import com.encore.service.OutletStoreService;
import com.encore.vo.Customer;

// OutletStoreService 와 Hasing 되는 < Test Class >
import com.encore.vo.Product;

public class ProductArrayTest4 {

	public static void main(String[] args) {
		// Service 객체 생성.
		
		OutletStoreService service = new OutletStoreService();
		
		
		Product[] pros1 = { new Product("댕기머리샴푸", 23000, 2, "LG"),
										new Product("삼다수생수", 2000, 7, "HP"),
										new Product("컵라면", 1200, 10,"SAMSUNG"),
										new Product("캣타워", 340000, 1,"LG")};
	
		Product[] pros2 = { 	
				new Product("죽염치약", 5600, 2, "CJ"),
				new Product("새우깡", 2000,2,"농심"),
				new Product("신라면", 2300, 10,"농심")};
		
		
		Customer [] customers = new Customer[2];
		
		customers[0] = new Customer(111, "이나영", "방배동");
		customers[1] = new Customer(222, "원빈", "방배동");
		
		customers[0].buyProducts(pros1);
		customers[1].buyProducts(pros2);

		
		///// 아래서부터는 Service의 기능을 호출할 것입니다.//////
		Customer selectCustomer = customers[0];
		
		System.out.println("=== 고객님의 상품정보 입니다 ===");
		String [] products0 = service.getAllProductBuy(selectCustomer);
		if ( products0 != null )  {
			for ( String product : products0 ) {
				System.out.println(product);
			}
		}
		
		System.out.println("=== 고객님이 구입하신 상품들의 maker 입니다 ===");
		String [] products = service.getAllProductMaker(selectCustomer);
		System.out.println(selectCustomer.getName() + " 님의 상품들");
		if ( products != null ) {
			for ( String product : products ) {
				System.out.println(product + " ");
			}
		}
		System.out.println("===== 고객님들의 대한 정보 =====");
		Customer[] clients = service.getAllCustomer(customers);
		for (Customer c : clients) {
			System.out.println(c.getDetails());
		}
		
		System.out.println("==== 찾으시는 고객님에 대한 정보 ====");
		System.out.println(service.getACustomer(customers, 111).getName());
		
		
		System.out.println("=== 최고가의 해당하는 물건입니다 ===");
		System.out.println(service.maxPriceProduct(selectCustomer));
		
		System.out.println("=== 평균금액 이상의 물건들입니다 ===");
		for ( Product product : service.getMoreAvgProduct(selectCustomer))
		{
			if (product == null ) continue;
			System.out.println(product.getMaker());
		}
		
		System.out.println("=== 같은 동네에 사는 사람들 입니다. ===");
		Customer[] customers2 = service.sameTownCustomer(customers, "방배동");
		for (Customer customer : customers2) {
			System.out.println(customer.getName());
		}
		
 }
}

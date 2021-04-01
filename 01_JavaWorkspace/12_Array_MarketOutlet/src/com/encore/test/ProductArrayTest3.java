package com.encore.test;
import com.encore.service.ProductStoreService;
import com.encore.vo.Product;
// ��ɵ��� �߰��� ����

public class ProductArrayTest3 {

	public static void main(String[] args) {
		// Service ��ü ����.
		
		ProductStoreService service = new ProductStoreService();
		
		
		Product[] products = { new Product("Nike", 7000, 50, "USA"),
										new Product("Adidas", 15000, 100, "USA"),
										new Product("Masion Marigela", 500000,20,"ITALY"),
										new Product("Gucci", 1500000, 15,"FRANCE")};
		
		System.out.println("===== 1. ��� ��ǰ�� ����Ŀ�� ����մϴ�. ===== ");
		service.printAllProductMaker(products);
		System.out.println("===== 2. ��� ��ǰ�� �� ���Ծ��� �޽��ϴ�. ===== ");
		System.out.println(service.getTotalProductprice(products) +"��");
		System.out.println("===== 3. ���� �ݾ� �̻��� ��ǰ�� �����ݴϴ�.===== ");
		Product[] returnPros = service.getMorePrice(products, 10000);
				for ( Product p : returnPros) {
					if (p==null) continue;
					System.out.println(p.getDetail());;
				}
				System.out.println("===== 4. ȸ�簡 ���� ȸ�� ��ǰ�� �����ݴϴ�=====");
				Product [] returnPros2 = service.getCertainCompany(products, "USA");
				for ( Product p : returnPros2) {
					if(p==null) continue;
					System.out.println(p.getDetail());}
				System.out.println("===== 5. ��ǰ���� ��հ� �Դϴ�. =====");
				
				int[] returnPros3 = service.getAvgPrice(products);
				for ( int p : returnPros3) {
					if(p==0) continue;
					System.out.println(p);}
				
				}
				
		
	

}

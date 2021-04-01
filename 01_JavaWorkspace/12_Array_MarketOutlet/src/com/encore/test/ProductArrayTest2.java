package com.encore.test;
import com.encore.vo.Product;
// ��ɵ��� �߰��� ����

public class ProductArrayTest2 {

	public static void main(String[] args) {
		// 1. Product Type�� �迭�� 3�� ����
		// 2. product�� 3�� ����
		// 1,2 �� �ѹ��� 
		
		
		Product[] products = { new Product("Nike", 10000, 50, "USA"),
										new Product("Adidas", 15000, 100, "USA"),
										new Product("Masion Marigela", 500000,20,"ITALY"),
										new Product("Gucci", 1500000, 15,"FRANCE")};
		
		// 1. ��ǰ���� ����Ŀ�� ����մϴ�.
		System.out.println("====== ��ǰ���� ����Ŀ�� ����غ��� ======");
		for (Product p : products ) {
			System.out.println(p.getMaker());
		}
		// 2. Ư������ �̻��� ��ǰ�� ���
		System.out.println("======= 10 ���� �̻��ϴ� ��ǰ�� ====== ");
		for (Product p2:products) {
			if (p2.getPrice() >= 100000) {
				System.out.println(p2.getDetail());
			}
			
		}
		System.out.println(" === �� ���� ������ ����մϴ� === ");
		int total = 0;
		for(Product p : products) {
			total += p.getPrice() * p.getQuantity();
		} System.out.println(total);
		
	}
	

}

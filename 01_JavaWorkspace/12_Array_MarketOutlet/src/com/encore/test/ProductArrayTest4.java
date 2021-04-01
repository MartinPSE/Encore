package com.encore.test;
import com.encore.service.OutletStoreService;
import com.encore.vo.Customer;

// OutletStoreService �� Hasing �Ǵ� < Test Class >
import com.encore.vo.Product;

public class ProductArrayTest4 {

	public static void main(String[] args) {
		// Service ��ü ����.
		
		OutletStoreService service = new OutletStoreService();
		
		
		Product[] pros1 = { new Product("���Ӹ���Ǫ", 23000, 2, "LG"),
										new Product("��ټ�����", 2000, 7, "HP"),
										new Product("�Ŷ��", 1200, 10,"SAMSUNG"),
										new Product("ĹŸ��", 340000, 1,"LG")};
	
		Product[] pros2 = { 	
				new Product("�׿�ġ��", 5600, 2, "CJ"),
				new Product("�����", 2000,2,"���"),
				new Product("�Ŷ��", 2300, 10,"���")};
		
		
		Customer [] customers = new Customer[2];
		
		customers[0] = new Customer(111, "�̳���", "��赿");
		customers[1] = new Customer(222, "����", "��赿");
		
		customers[0].buyProducts(pros1);
		customers[1].buyProducts(pros2);

		
		///// �Ʒ������ʹ� Service�� ����� ȣ���� ���Դϴ�.//////
		Customer selectCustomer = customers[0];
		
		System.out.println("=== ������ ��ǰ���� �Դϴ� ===");
		String [] products0 = service.getAllProductBuy(selectCustomer);
		if ( products0 != null )  {
			for ( String product : products0 ) {
				System.out.println(product);
			}
		}
		
		System.out.println("=== ������ �����Ͻ� ��ǰ���� maker �Դϴ� ===");
		String [] products = service.getAllProductMaker(selectCustomer);
		System.out.println(selectCustomer.getName() + " ���� ��ǰ��");
		if ( products != null ) {
			for ( String product : products ) {
				System.out.println(product + " ");
			}
		}
		System.out.println("===== ���Ե��� ���� ���� =====");
		Customer[] clients = service.getAllCustomer(customers);
		for (Customer c : clients) {
			System.out.println(c.getDetails());
		}
		
		System.out.println("==== ã���ô� ���Կ� ���� ���� ====");
		System.out.println(service.getACustomer(customers, 111).getName());
		
		
		System.out.println("=== �ְ��� �ش��ϴ� �����Դϴ� ===");
		System.out.println(service.maxPriceProduct(selectCustomer));
		
		System.out.println("=== ��ձݾ� �̻��� ���ǵ��Դϴ� ===");
		for ( Product product : service.getMoreAvgProduct(selectCustomer))
		{
			if (product == null ) continue;
			System.out.println(product.getMaker());
		}
		
		System.out.println("=== ���� ���׿� ��� ����� �Դϴ�. ===");
		Customer[] customers2 = service.sameTownCustomer(customers, "��赿");
		for (Customer customer : customers2) {
			System.out.println(customer.getName());
		}
		
 }
}

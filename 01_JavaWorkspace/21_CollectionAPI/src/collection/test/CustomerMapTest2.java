package collection.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import collection.vo.Customer;

public class CustomerMapTest2 {

	public static void main(String[] args) {
		HashMap<String, Customer> map = new HashMap<String, Customer>();
		
		map.put("111", new Customer("KANG", "��ȣ��", 48));
		map.put("222", new Customer("SEO", "������", 44));

		map.put("333", new Customer("LEE", "�̼���", 42));

		map.put("444", new Customer("KIM", "����ö", 36));

		
		// 1. KEY ���� 222�� ����� ������ ���
		Set<String> key = map.keySet();
		for (String k : key) {
			if(k.equals("222")) {
				System.out.println(map.get(k));
			}
		}
			
		// 2. ID�� LEE�� ����� ã�Ƽ� �� ����� �̸��� ���
		/* ----- Teahcer's answer -----
		 * Set<String> set = map.keySet();
		 * Iterator <String> it = set.iterator();
		 * while(it.hasNext()) {
		 * 		Customer c = map.get(it.next());
		 * if(c.getId().equals("LEE") sysout(c.getName());
		 * 
		 * 		
		 * }
		 */
		Collection<Customer> customers = map.values();
		for (Customer c : customers) {
			if (c.getId().equals("LEE")) {
				System.out.println(c.getName());
			}
		}
		
		// 3. MAP�� ����� ����Ÿ�� ��� KEY������ ���
		System.out.println(key);
		
		// 4. MAP�� ����� ����� ������ ���հ� ��� ������ ���
		/*
		 * ===== Teacher's answer =====
		 * Set <String> keys = map.keySet();
		 * int totalAge=0;
		 * for(String s : keys) {
		 * 	totalAge += map.get(s).getAge();
		 * }
		 * 
		 * sysout(totalAge);
		 * sysout(totalAge/map.size());
		 * 
		 */
		
		int total = 0;
		int avg = 0;
		for ( Customer c: customers) {
			total += c.getAge();
			avg = total / map.size();
		} 
		System.out.println("������ ������ : " + total +"\n������ ����� : " +avg);

	}

}

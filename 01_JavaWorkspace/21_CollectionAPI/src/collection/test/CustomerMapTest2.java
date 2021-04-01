package collection.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import collection.vo.Customer;

public class CustomerMapTest2 {

	public static void main(String[] args) {
		HashMap<String, Customer> map = new HashMap<String, Customer>();
		
		map.put("111", new Customer("KANG", "강호동", 48));
		map.put("222", new Customer("SEO", "서장훈", 44));

		map.put("333", new Customer("LEE", "이수근", 42));

		map.put("444", new Customer("KIM", "김희철", 36));

		
		// 1. KEY 값이 222인 사람의 정보를 출력
		Set<String> key = map.keySet();
		for (String k : key) {
			if(k.equals("222")) {
				System.out.println(map.get(k));
			}
		}
			
		// 2. ID가 LEE인 사람을 찾아서 그 사람의 이름을 출력
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
		
		// 3. MAP에 저장된 데이타의 모든 KEY값들을 출력
		System.out.println(key);
		
		// 4. MAP에 저장된 사람들 나이의 총합과 평균 연령을 출력
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
		System.out.println("나이의 총합은 : " + total +"\n나이의 평균은 : " +avg);

	}

}

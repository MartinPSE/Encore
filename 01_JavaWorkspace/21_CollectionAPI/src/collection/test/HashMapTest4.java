package collection.test;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map�� �ڽ� Ŭ���� ... HashMap
 * 	key-value�� ������ �����ؼ� �����͸� �����ϴ� Ư¡�� ������.
 * 	key�� �ߺ���� XXXXXX,  value�� �ߺ� ��� OOOOOO
 * 	������ ����.
 * 
 */

public class HashMapTest4 {


	public static void main(String[] args) {
		// MAP <Datetype, Datetype> --> �ٵ� �⺻���� ����!! 
		Map<String, Integer> map = new HashMap<String , Integer>();
		
		map.put("��ȣ��", 95);
		map.put("�̼���", 90);
		map.put("������", 85);
		map.put("����ö", 80);

		// 1. Ű�� �޾ƿ´�
		System.out.println("============== keySet() =============");
		Set<String> key = map.keySet();
		System.out.println(key);
		// 2. Ű���� ���鼭
		// 3. Ű�� �̰�
		// 4. Ű���� �ش��ϴ� ���� �̰�
		// 5. ���������� ��� ������ �հ� ��հ��� ����Ѵ�.
		
		int total = 0;
		Iterator<String> it = key.iterator();
		while (it.hasNext()) {
			String name = it.next();
			int score = map.get(name);
			total += score;
			
		}
		System.out.println("�� ������ : " + total +" ��� ������ :" +total/map.size());
		
			
		System.out.println("=========== entrySet() ================");
		System.out.println("========== values() ================");
		Collection<Integer> coll  = map.values();
		System.out.println(coll);
		Iterator<Integer> it2 = coll.iterator();
		int sum = 0;
		while(it2.hasNext())
		{
			int jumsu = it2.next();
			sum += jumsu;
		}
		System.out.println("�� ������ : "  + sum + " ��� ������ : " + sum/map.size());
		
		System.out.println("�ְ����� " + Collections.max(coll)+ "�Դϴ�.");
		System.out.println("�ְ����� " + Collections.min(coll)+ "�Դϴ�.");

	}
		

}

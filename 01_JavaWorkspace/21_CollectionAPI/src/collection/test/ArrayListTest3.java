package collection.test;

import java.util.ArrayList;
import java.util.List;

/*
 *  List (java.util --> ����ؾ��Ѵ� )
 *  "����"�� �����鼭(���������� index�� �����ȴ�) ��ü�� �����ϴ� ���
 *  	* �ߺ� ��밡��. --> �ߺ� OOOOOOOOOO
 * 
 */

public class ArrayListTest3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		// Order( input�� ���� �״��) | Sorting ( ����, ���� ���� ... etc) 
		list.add("��ȣ��");
		list.add("�̼���");
		list.add("��ȣ��");
		list.add("������");
		list.add("����ö");
		
		System.out.println(list);
		// 3��° ��ü�� ����
		String name = list.remove(2);
		// ������ �����͸� ���
		System.out.println(name + "����ļ� �����߾�� ..");
		// ù��° �����͸� �������� ����
		list.add(0, "������");
		System.out.println(list.get(0)+ "���� "+"���ο� ����� �����̽��ϴ�!");
		
		// list�� ����� ����� �߿��� �̸��� �������� �޾ƿ´�.
		int cnt = 0;
		for(String name1 : list) {
			if(name1.equals("������")) System.out.println(list.get(cnt));
			cnt ++;
		}


	}

}

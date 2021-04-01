package collection.sort.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Comparator�� sort �Լ� �ȿ��� ���� ����
// �տ� Person �״�� ���


public class ComparatorTest2 {

	public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<Person>();
		Person p1 = new Person("��ȣ��",48);
		Person p2 = new Person("�̼���",42);
		Person p3 = new Person("����ö",36);

		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		//Arrays.sort(�迭) | Collections.sort(ArrayList, Comparator��ü)
		// ���Ⱑ �� ���ذ� �ȵ˴ϴ�.
		Collections.sort(list, new Comparator<Person>() {
			
			@Override
			public int compare(Person p1, Person p2) { // ���� ���!!
				return p2.getAge()-p1.getAge(); // p1-p2�� �������� , p2-p1�� �������� 
												// Bubble ������ �����Ǿ��ִ°ž� 
			}
			
			
			
		});
		

			for(Person p : list) System.out.println(p);
	}

}

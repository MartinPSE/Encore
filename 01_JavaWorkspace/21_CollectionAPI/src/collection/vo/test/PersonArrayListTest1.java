package collection.vo.test;

import java.util.ArrayList;

import collection.vo.Person;

/*
 *  List �ȿ� �������� ����� �߰��ϴ� ������ �ۼ�
 * 		�߰��� ����� ������ �ڵ鸵�ϴ� ����� �������� �ۼ�
 */

public class PersonArrayListTest1 {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		// �������� Array ��� but ������ ArrayList�� �ڵ鸵
		
		list.add(new Person("������","�ٻ�2��",28));
		list.add(new Person("������","�ٻ�1��",30));
		list.add(new Person("������","�ٻ�3��",32));
		list.add(new Person("ĥ����","�ٻ�4��",34));
		list.add(new Person("������","�ٻ�5��",36));
		
		System.out.println(list);

		// 1. ����Ʈ�� ����ִ� ����� ������� ���
		int size = list.size();
		System.out.println("list�� �����" +size+"�� �ֽ��ϴ�.");
		
		// 2. ����Ʈ�� ����� ������� ��� ������ ���
		int sum = 0;
		for (Person p : list) {
			sum += p.getAge();
		}
		int avg = sum / size;
		System.out.println("list�� ������� ��� ������ "+avg+"(��) �Դϴ�.");
		
		
		// 3. ����� ����� �߿��� �ٻ� 3���� ��� ��� ���
		Person temp = null;
		for ( Person p : list)
		{ 
			if (p.getAddr().equals("�ٻ�3��")) {
				temp = p;
			}
		} 
		System.out.println("�ٻ� 3���� ��� ����� "+temp+"�Դϴ�");	
		
		
		

	}

}

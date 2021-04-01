package collection.test;

import java.util.HashSet;
import java.util.Set;

/*
 *  Set�� �ڽ� Ŭ���� ... HashSet
 *  	1. �ߺ� ��� ���� --> �ߺ� XXXXXXXXX
 *  	2. ������ ������ �ʴ´�.  --> ���� XXXXXXXXXXX
 *  
 *  		* Hash SET --> �˻��� ������
 *  		* Tree SET --> ������ ������ 
 * 
 * 
 */
public class HashSetTest2 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		// HashSET<String> set = new HashSET<>();
		
		set.add("��ȣ��");
		set.add("�̼���");
		set.add("��ȣ��"); // �ߺ�
		set.add("������");
		set.add("����ö");

		System.out.println(set.size());
		// Collection API�� ��ü������ toString �� Overriding�� �Ǿ����ִ�.
		System.out.println(set);
		
		// contains(object) --> object �� set�ȿ� �ִ����� ����. (boolean) 
		boolean flag = set.contains("�̻��"); 
		System.out.println("���� ��ü�� ���ԵǾ� �ֳ���? " + flag);
		
		// isempty --> set �� ������ֳ���?
		boolean flag2 = set.isEmpty();
		System.out.println("SET�� ����ֳ���? : " + flag2);
		
		// �������� ����
		set.remove("������");
		
		// ��� set����Ÿ�� ���
		System.out.println(set);
		
		// ��� �����͸� ����
		set.removeAll(set);
		
		// ��� set�����͸� ���
		System.out.println(set);
		
		// ����ֳ���?
		boolean last = set.isEmpty();
		System.out.println("SET�� ������ֳ��� ? "+last);
		
	}

}

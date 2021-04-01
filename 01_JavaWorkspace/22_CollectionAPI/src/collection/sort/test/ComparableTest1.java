package collection.sort.test;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 
 *  Arrays.sort(�迭 [] ) --- > �迭������ ���
		sort()�� comparable�� ���ؼ� ���ĵ� ���̴�.
	
	Arrays.sort(ArrayList)  --> �۵����� �ʴ´�!!
	
	Comparable�� ����ؼ� ArrayList �ȿ� ����ִ� ��ü���� Ư���� ���� ���ؼ� ����.
	1. ������ӹ޾Ƽ� �Ѵ�!! 
	
	Comparator�� sort �Լ� �ȿ��� ���� ����
	
 *  
 */

class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	public Person () {
		super();
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
//
//	@Override
//	public int compareTo(Person p) { // �̸������� ����
//		
//		return -name.compareTo(p.getName()); // �⺻�� ��������.
//	}
	@Override
	public int compareTo(Person p) { // �̸������� ����
		
		return new Integer(age).compareTo(p.getAge()); // �⺻�� ��������.
	}
	
}

public class ComparableTest1 {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		Person p1 = new Person("��ȣ��",48);
		Person p2 = new Person("�̼���",42);
		Person p3 = new Person("����ö",36);

		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		Collections.sort(list);
		System.out.println(list);
	}

}

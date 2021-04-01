package collection.sort.test;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 
 *  Arrays.sort(배열 [] ) --- > 배열에서만 사용
		sort()는 comparable에 의해서 정렬된 것이다.
	
	Arrays.sort(ArrayList)  --> 작동하지 않는다!!
	
	Comparable을 사용해서 ArrayList 안에 들어있는 객체들을 특정한 값에 의해서 정렬.
	1. 직접상속받아서 한다!! 
	
	Comparator를 sort 함수 안에서 직접 구현
	
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
//	public int compareTo(Person p) { // 이름순으로 정렬
//		
//		return -name.compareTo(p.getName()); // 기본은 오름차순.
//	}
	@Override
	public int compareTo(Person p) { // 이름순으로 정렬
		
		return new Integer(age).compareTo(p.getAge()); // 기본은 오름차순.
	}
	
}

public class ComparableTest1 {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		Person p1 = new Person("강호동",48);
		Person p2 = new Person("이수근",42);
		Person p3 = new Person("김희철",36);

		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		Collections.sort(list);
		System.out.println(list);
	}

}

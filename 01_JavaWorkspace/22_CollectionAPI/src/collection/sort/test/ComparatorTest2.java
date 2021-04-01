package collection.sort.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Comparator를 sort 함수 안에서 직접 구현
// 앞에 Person 그대로 사용


public class ComparatorTest2 {

	public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<Person>();
		Person p1 = new Person("강호동",48);
		Person p2 = new Person("이수근",42);
		Person p3 = new Person("김희철",36);

		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		//Arrays.sort(배열) | Collections.sort(ArrayList, Comparator객체)
		// 여기가 잘 이해가 안됩니다.
		Collections.sort(list, new Comparator<Person>() {
			
			@Override
			public int compare(Person p1, Person p2) { // 비교할 대상!!
				return p2.getAge()-p1.getAge(); // p1-p2는 오름차순 , p2-p1은 내림차순 
												// Bubble 정렬이 내포되어있는거야 
			}
			
			
			
		});
		

			for(Person p : list) System.out.println(p);
	}

}

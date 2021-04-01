package collection.vo.test;

import java.util.ArrayList;

import collection.vo.Person;

/*
 *  List 안에 여러명의 사람을 추가하는 로직을 작성
 * 		추가된 사람의 정보를 핸들링하는 방법도 로직으로 작성
 */

public class PersonArrayListTest1 {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		// 예전에는 Array 사용 but 지금은 ArrayList로 핸들링
		
		list.add(new Person("오형석","다산2동",28));
		list.add(new Person("오형석","다산1동",30));
		list.add(new Person("육형석","다산3동",32));
		list.add(new Person("칠형석","다산4동",34));
		list.add(new Person("팔형석","다산5동",36));
		
		System.out.println(list);

		// 1. 리스트에 들어있는 사람이 몇명인지 출력
		int size = list.size();
		System.out.println("list에 사람은" +size+"명 있습니다.");
		
		// 2. 리스트에 저장된 사람들의 평균 연령을 출력
		int sum = 0;
		for (Person p : list) {
			sum += p.getAge();
		}
		int avg = sum / size;
		System.out.println("list에 사람들의 평균 연령은 "+avg+"(세) 입니다.");
		
		
		// 3. 저장된 사람들 중에서 다산 3동에 사는 사람 출력
		Person temp = null;
		for ( Person p : list)
		{ 
			if (p.getAddr().equals("다산3동")) {
				temp = p;
			}
		} 
		System.out.println("다산 3동에 사는 사람은 "+temp+"입니다");	
		
		
		

	}

}

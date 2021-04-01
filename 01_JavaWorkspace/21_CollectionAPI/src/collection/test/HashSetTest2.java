package collection.test;

import java.util.HashSet;
import java.util.Set;

/*
 *  Set의 자식 클래스 ... HashSet
 *  	1. 중복 허용 안함 --> 중복 XXXXXXXXX
 *  	2. 순서를 가지지 않는다.  --> 순서 XXXXXXXXXXX
 *  
 *  		* Hash SET --> 검색을 빠르게
 *  		* Tree SET --> 정렬을 빠르게 
 * 
 * 
 */
public class HashSetTest2 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		// HashSET<String> set = new HashSET<>();
		
		set.add("강호동");
		set.add("이수근");
		set.add("강호동"); // 중복
		set.add("서장훈");
		set.add("김희철");

		System.out.println(set.size());
		// Collection API는 자체적으로 toString 이 Overriding이 되어져있다.
		System.out.println(set);
		
		// contains(object) --> object 가 set안에 있는지의 여부. (boolean) 
		boolean flag = set.contains("이상민"); 
		System.out.println("위에 객체가 포함되어 있나요? " + flag);
		
		// isempty --> set 이 비어져있나요?
		boolean flag2 = set.isEmpty();
		System.out.println("SET이 비어있나요? : " + flag2);
		
		// 서장훈을 삭제
		set.remove("서장훈");
		
		// 모든 set데이타를 출력
		System.out.println(set);
		
		// 모든 데이터를 삭제
		set.removeAll(set);
		
		// 모든 set데이터를 출력
		System.out.println(set);
		
		// 비어있나요?
		boolean last = set.isEmpty();
		System.out.println("SET이 비어져있나요 ? "+last);
		
	}

}

package collection.test;

import java.util.ArrayList;
import java.util.List;

/*
 *  List (java.util --> 사용해야한다 )
 *  "순서"를 가지면서(내부적으로 index로 관리된다) 객체를 저장하는 방식
 *  	* 중복 허용가능. --> 중복 OOOOOOOOOO
 * 
 */

public class ArrayListTest3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		// Order( input된 순서 그대로) | Sorting ( 오름, 내림 차순 ... etc) 
		list.add("강호동");
		list.add("이수근");
		list.add("강호동");
		list.add("서장훈");
		list.add("김희철");
		
		System.out.println(list);
		// 3번째 객체를 삭제
		String name = list.remove(2);
		// 삭제된 데이터를 출력
		System.out.println(name + "사고쳐서 하차했어요 ..");
		// 첫번째 데이터를 아이유로 수정
		list.add(0, "아이유");
		System.out.println(list.get(0)+ "님이 "+"새로운 멤버로 들어오셨습니다!");
		
		// list에 저장된 멤버들 중에서 이름이 서장훈을 받아온다.
		int cnt = 0;
		for(String name1 : list) {
			if(name1.equals("서장훈")) System.out.println(list.get(cnt));
			cnt ++;
		}


	}

}

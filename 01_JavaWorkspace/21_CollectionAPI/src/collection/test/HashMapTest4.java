package collection.test;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map의 자식 클래스 ... HashMap
 * 	key-value를 쌍으로 연결해서 데이터를 저장하는 특징을 가진다.
 * 	key는 중복허용 XXXXXX,  value는 중복 허용 OOOOOO
 * 	순서는 없음.
 * 
 */

public class HashMapTest4 {


	public static void main(String[] args) {
		// MAP <Datetype, Datetype> --> 근데 기본형은 못들어가!! 
		Map<String, Integer> map = new HashMap<String , Integer>();
		
		map.put("강호동", 95);
		map.put("이수근", 90);
		map.put("서장훈", 85);
		map.put("김희철", 80);

		// 1. 키만 받아온다
		System.out.println("============== keySet() =============");
		Set<String> key = map.keySet();
		System.out.println(key);
		// 2. 키들을 돌면서
		// 3. 키값 뽑고
		// 4. 키값에 해당하는 점수 뽑고
		// 5. 최종적으로 모든 성적의 합과 평균값을 출력한다.
		
		int total = 0;
		Iterator<String> it = key.iterator();
		while (it.hasNext()) {
			String name = it.next();
			int score = map.get(name);
			total += score;
			
		}
		System.out.println("총 점수는 : " + total +" 평균 점수는 :" +total/map.size());
		
			
		System.out.println("=========== entrySet() ================");
		System.out.println("========== values() ================");
		Collection<Integer> coll  = map.values();
		System.out.println(coll);
		Iterator<Integer> it2 = coll.iterator();
		int sum = 0;
		while(it2.hasNext())
		{
			int jumsu = it2.next();
			sum += jumsu;
		}
		System.out.println("총 점수는 : "  + sum + " 평균 점수는 : " + sum/map.size());
		
		System.out.println("최고성적은 " + Collections.max(coll)+ "입니다.");
		System.out.println("최고성적은 " + Collections.min(coll)+ "입니다.");

	}
		

}

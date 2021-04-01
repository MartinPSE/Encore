package fly.test;

import fly.child.Airplane;
import fly.child.Bird;
import fly.child.Superman;
import fly.parent.Flyer;

public class FlyerTest1 {


	public static void main(String[] args) {
		
		// 인터페이스는 객체생성의 대상이 아니고 --> 객체를 생성하기 위한 '타입'으로서만 존재한다.
		
//		Flyer flyer = new Flyer(); // 추상 Method가 1개라도 있으면 can't instantiate.
		Flyer airplane = new Airplane();
		Flyer bird = new Bird();
		Flyer superman = new Superman();
		
		Flyer[] Flyers = {airplane, bird, superman};
		
		for (Flyer f : Flyers) {
			if (f instanceof Airplane) System.out.println(((Airplane) f).Hello());
			
			if (f instanceof Bird) System.out.println(((Bird) f).layEggs());
			
			if (f instanceof Superman) System.out.println(((Superman) f).Hero());
			
			f.fly();
			f.land();
			f.take_off();
			System.out.println("====================");
		}
		
			
		
		
		
		

	}

}

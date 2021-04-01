package fly.test;

import fly.child.Airplane;
import fly.child.Bird;
import fly.child.Superman;
import fly.parent.Flyer;

public class FlyerTest1 {


	public static void main(String[] args) {
		
		// �������̽��� ��ü������ ����� �ƴϰ� --> ��ü�� �����ϱ� ���� 'Ÿ��'���μ��� �����Ѵ�.
		
//		Flyer flyer = new Flyer(); // �߻� Method�� 1���� ������ can't instantiate.
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

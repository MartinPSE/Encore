package fly.child;
/*
 *  interface를 부모로 둔 자식 클래스는
 *  반드시 부모 인터페이스가 가지고 있는 모든 추상메소드를 
 *  다 구현해야한다.
 * 
 */

import fly.parent.Flyer;

public class Superman  implements Flyer{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void take_off() {
		// TODO Auto-generated method stub
		
	}
	
	public String Hero() {
		return "빰빠바바밤";
	}
		
	}



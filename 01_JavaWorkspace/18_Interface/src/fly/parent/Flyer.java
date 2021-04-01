package fly.parent;

// 날으는 것과 관련된 추상기능을 모아놓은 인터페이스

/*
 *  << interface 의 구성 요소 >>
 *  	1. static final 상수.
 *  	2. public abstract 메소드.
 *  
 * 
 */

public interface Flyer {
	// 필드가 없다... 상수는 존재
	public static final int SIZE = 300;
	
	public abstract void fly(); // abstract method ... 선언부 있고 {구현부} 가 없어!! 
	void land (); // Interface 안에는 무조건 메소드 리턴타입 앞에 public abstract 생략된다.
	
	
	void take_off();
 	

}

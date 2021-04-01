package test;

public class OperatorTest1 {
	public static void main(String[] args) {
		int i = 5; // 반드시 초기화하고 사용해야한다. --> 지역변수는 기본값이 존재하지않아.
		int j = 3;
		
		
		Operator o1 = new Operator(); // -
		Operator o2 = new Operator();
		
		o1 = o2;
		System.out.println(o1);
		System.out.println(o2);
		System.out.println("두개의 객체가 서로 같은 객체입니까? " + (o1 == o2));
		
		// % , == , != 
		System.out.println("연산자 % :: " + i%j);
		System.out.println(i==j );
		System.out.println(i!=j);
		
		// ++ (1씩 증가), -- (1씩 감소)
		int k = 10;
		System.out.println(k++);
		System.out.println(k);
		System.out.println(++k);
		
		// 논리 연산자
		System.out.println(o1.test1() | o1.test2()); // true or false 
		System.out.println(o1.test1() & o1.test2()); // true and false 
		
		// Short Circuit --> 예외, 문제 상황을 건너뛴다.
		System.out.println(o1.test1() || o1.test2()); // true or false  --> 앞에꺼가 참이면 끝내버림
		System.out.println(o1.test1() && o1.test2()); // true and false  --> 

	}

}

// class 를 여러개 붙여서 사용할 떄는, 제목에만 public 사용! 

class Operator {
	public boolean test1() {
		System.out.println("test1() Calling ...");
		
		return true;
		
	}
	public boolean test2() {
		System.out.println("test2() Calling ...");
		return false;
		
	}
}



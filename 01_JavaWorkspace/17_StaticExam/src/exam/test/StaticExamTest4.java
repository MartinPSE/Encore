package exam.test;

/*
 * Modifier --> Access modifier | Usage Modifier 
 * Usage Modifier :: static, final, abstract, 
 * --> static + final 주로 함께 많이 쓰인다.
 * 
 * 	< final >
 * 	"내가 마지막이야"를 의미하는 키워드.
 * 	final + 변수 --> "내가 마지막 변수야" ---> 상수지정
 * 	final + 클래스 --> "내가 마지막 class야" ---> 상속을 못하게 하려고!!
 * 	final + method  --> "내가 마지막 Method야" --->  오버라이딩 금지!!!
 * 
 */


class A {
	public final static int BASE_SALARY = 300; // 상수 변수명 대문자로 써주자
	public final String test() { // method 앞에 final 오버라이딩 불가
		return "Overriding 금지";
	}
	
}

final class B { // 상속 불가
	
	
}

//class C extends B {
//	
//}

class D extends A {
	
	public void U() {
		System.out.println(super.test());

	}
	

	
}

public class StaticExamTest4 {


	public static void main(String[] args) {
		D dd = new D();
		dd.U();

	}

}

/*
 * 
 * ==== static한 키워드 성질 ====
 * 1. 객체생성 과정 없이 "메모리"에 올라간다.
 * 2. 객체생성 과정 훨씬 이전에 --> Class file loader 과정에서 
 * 		--> JVM(STACK | HEAP(New를 통해 만들어진 객체만 올라간다) | ... Class Area (static한 성질들의 멤버들)<< 여기 올라간다)
 * 3. static한 성질의 필드는 생성된 객체들에서 서로 공유한다!!
 * 4. static은 static 끼리만 통한다
 * 5. static 블락 안에서는 'this'사용 불가능 하다 ( 서로 정반대의 개념 )
 * 6. static과 final은 성질상 종종 함께 사용 된다.
 * 7. static initialization block
 * 
 * 
 */


package exam.test;

class Member{
	// 필드 레벨에 static 변수를 선언 (local level로는 사용 불가능)
	static String name = "오형석"; // static
	static int age = 28; // static
	
	
	int count = 1; // 필드
	
	public static void getMember(){ // static block
		System.out.println("우/유/빛/깔 " + name); // static variable.
//		System.out.println("우/유/빛/깔 " + count); // static은 static 끼리!
	}
	
	public void getMember2() { // non-static block
		System.out.println("우/유/빛/깔 " + name); // 상관없이 사용가능
		System.out.println("우/유/빛/깔 " + count);
	}
}


public class StaticExamTest1 {

	public static void main(String[] args) {
		// static한 성질의 기능은 바로 접근해서 사용가능 --> class이름.classMethod;
		
		Member.getMember();
		
		// 이 과정이 굳이 필요없다.
		Member m = new Member();
		m.getMember();
		
		m.getMember2();
		

	}

}

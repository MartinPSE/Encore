package greet;

// 
/*
 *  MyGreet 클래스는
 *  인삿말을 콘솔창으로 출력하는 기능을 가지고 있는 클래스
 *  Compile -> 실행(Main Method가 존재해야해)
 */
public class MyGreet {
	public String message = "안녕하세요^^"; // 필드 선언 
	
	public void sayHello(String name) { // Method worker  (정의) 
		System.out.println(message+", " + name + "입니다");
	}

}



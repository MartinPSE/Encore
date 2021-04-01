package exception.runtime.test;

/*
 * 
 *  예외를 처리하는 방법 2번째 ---> throws를 사용해보자
 *  
 */
class Throws { // step 3. compile!!
	public void go() throws ArithmeticException{ // step 6. Worker!!
		int i = 10;
		int j = 0;
		
		System.out.println("2. 0을 분모로 하면 안됩니다."); // step 7. 출력
		if(i/j == 0) { // 여기서 이제 Error!
			System.out.println("Arithmetic Exception...Boom");
		}
		
	}
}




public class RuntimeExceptionTest4 {

	public static void main(String[] args) { // step 1.
		Throws t = new Throws(); // step 2. Throws compile!
		System.out.println("1. go () calling "); // step4. 실행
		
		try {
			t.go(); // step5. Throws class go method 호출!! calling!!
		}catch (Exception e){
			System.out.println("Error");
			
		}
		
		

	}

}

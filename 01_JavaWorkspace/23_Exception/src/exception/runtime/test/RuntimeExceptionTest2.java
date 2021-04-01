package exception.runtime.test;

public class RuntimeExceptionTest2 {

	public static void main(String[] args) {
		// 객체 생성하지 않고 참조변수로 접근할 때 발생하는 예외
		 
		System.out.println("========= NullPointerException =======");
		String str = "Encrore";
		String str1 = "Encrore1";
		str = null;
		try {
		System.out.println(str.length()); // NullPointerException --> Error -->
		System.out.println(str.toString()); // 작동조차 안한다.
		} catch ( ArrayIndexOutOfBoundsException e ) {
			System.out.println("Error Catch!");
		} catch ( NullPointerException e1) {
			System.out.println("Error Catch!");
		} finally { // 위와 상관없이(예외가 발생하건 말건, 예외를 잡건 말건) 무조건 이 부분은 수행된다..}
			System.out.println("메롱메롱");
			// 이 부분에 들어갈 코드를 나중에 설명드리겠습니다!! 
		}
		
		System.out.println("끝.");

	}

}

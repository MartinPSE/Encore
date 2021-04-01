package exception.runtime.test;

/*
 * 
 *  ���ܸ� ó���ϴ� ��� 2��° ---> throws�� ����غ���
 *  
 */
class Throws { // step 3. compile!!
	public void go() throws ArithmeticException{ // step 6. Worker!!
		int i = 10;
		int j = 0;
		
		System.out.println("2. 0�� �и�� �ϸ� �ȵ˴ϴ�."); // step 7. ���
		if(i/j == 0) { // ���⼭ ���� Error!
			System.out.println("Arithmetic Exception...Boom");
		}
		
	}
}




public class RuntimeExceptionTest4 {

	public static void main(String[] args) { // step 1.
		Throws t = new Throws(); // step 2. Throws compile!
		System.out.println("1. go () calling "); // step4. ����
		
		try {
			t.go(); // step5. Throws class go method ȣ��!! calling!!
		}catch (Exception e){
			System.out.println("Error");
			
		}
		
		

	}

}

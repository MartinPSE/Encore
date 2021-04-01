package exception.runtime.test;

public class RuntimeExceptionTest1 {

	public static void main(String[] args) {
		String [] str = {
				"Hello Java",
				"No, I mean it",
				"Nice to meet you"
		};
		int i = 0;
		while ( i < 4) {
			try {
			System.out.println(str[i]);
			} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error Catch!1212!");
			}catch(Exception e) {
				System.out.println("Error Catch3434!!");
			}
			
				i++;
		}

	}

}

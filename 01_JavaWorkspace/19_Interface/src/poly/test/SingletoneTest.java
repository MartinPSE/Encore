package poly.test;

class EncoreCompany{
	private String companyName;
	
	// 1. static private으로 객체 생성
	static private EncoreCompany encore = new EncoreCompany();
	
	//2. 다른 곳에서는 객체생성 못한다.
	
	private EncoreCompany() {
		companyName = "Encore";
		System.out.println("Company Name..." + companyName);
					
	}
	
	//3. 만들어 놓은 객체를 다른 곳에서 가져다 쓸 수 있도록 기능을 하나 만들어 놓는다..
	//  	public 으로..! 
	public static EncoreCompany getCompany() {
		return encore;
	}
	
}

public class SingletoneTest {

	public static void main(String[] args) {
//		EncoreCompany a = new EncoreCompany();
// 		객체를 생성해야 --> 객체내의 Method 를 사용 할 수 있잖아! ---> static으로 만들어 줘야한다.
		
		EncoreCompany encore1 = EncoreCompany.getCompany(); 
		EncoreCompany encore2 = EncoreCompany.getCompany(); 
		EncoreCompany encore3 = EncoreCompany.getCompany(); 

		// 무조건 같은 객체다.. --> 하나의 클래스는 // 하나의 객체 !!
		System.out.println(encore1);
		System.out.println(encore2);
		System.out.println(encore3);

	}

}

package poly.test;

class EncoreCompany{
	private String companyName;
	
	// 1. static private���� ��ü ����
	static private EncoreCompany encore = new EncoreCompany();
	
	//2. �ٸ� �������� ��ü���� ���Ѵ�.
	
	private EncoreCompany() {
		companyName = "Encore";
		System.out.println("Company Name..." + companyName);
					
	}
	
	//3. ����� ���� ��ü�� �ٸ� ������ ������ �� �� �ֵ��� ����� �ϳ� ����� ���´�..
	//  	public ����..! 
	public static EncoreCompany getCompany() {
		return encore;
	}
	
}

public class SingletoneTest {

	public static void main(String[] args) {
//		EncoreCompany a = new EncoreCompany();
// 		��ü�� �����ؾ� --> ��ü���� Method �� ��� �� �� ���ݾ�! ---> static���� ����� ����Ѵ�.
		
		EncoreCompany encore1 = EncoreCompany.getCompany(); 
		EncoreCompany encore2 = EncoreCompany.getCompany(); 
		EncoreCompany encore3 = EncoreCompany.getCompany(); 

		// ������ ���� ��ü��.. --> �ϳ��� Ŭ������ // �ϳ��� ��ü !!
		System.out.println(encore1);
		System.out.println(encore2);
		System.out.println(encore3);

	}

}

package access.parent;

/*
 *  Access Modifier 의 지정범위를 알아보는 로직을 작성.
 * 
 */

public class Parent {
	
	public String publicTest="publicTest";
	protected String protectedTest ="protectedTest";
	String defaultTest = "defaultTest";
	private String privateTest = "privateTest";
	
//	하나의 클래스에는 반드시 하나 이상의 생성자가 존재한다.
//	이때 내가 만약 명시적 생성자를 넣어주면 그때는 기본 생성자가 자동적으로 제공되지 않는다.
//  그래서 만약에 기본 생성자가 반드시 필요한 경우라면 꼭 '명시적'으로 기본생성자를 코드로 작성해야한다.
	
//	public Parent(){}
	 
	public void access() {
		System.out.println("Access Modi....Test....");
	}
	
}

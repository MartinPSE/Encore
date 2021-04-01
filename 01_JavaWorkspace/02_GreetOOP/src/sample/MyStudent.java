package sample;

/*
 *  1) Field
 *     이름, 나이, 주소에 해당하는 값이 들어갈 수 있도록
 *     필드 3개
 *     
 *   2) Method
 *   	3개의 필드 정보들이 콘솔창에 출력될 수 있도록 기능을 정의 
 */

public class MyStudent {
	public String name;
	public String address;
	public int age;
	
	public void printInfo() {
		System.out.println(name+ ", " +age+", "+address);
		
				
	}
	
}

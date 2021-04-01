package sample;

/*
 *  필드에 값을 입력하는 기능을 추가.
 *  
 *  
 */

public class MyStudent2 {
	public String name;
	public String address;
	public int age;
	
	public void setField(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;		
	}
	
	public void printInfo() {
		System.out.println(name+ ", " +age+", "+address);
		
				
	}
	
}

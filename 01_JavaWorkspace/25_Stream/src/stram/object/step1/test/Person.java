
package stram.object.step1.test;

import java.io.Serializable;

/*
 * Person 클래스 타입의 객체를 만들자!
 * 	ObjectInputStream, ObjectOutputStream을 통해서 정보(Class의 field)가
 * '스트림'을 통해서 입, 출력 된다.
 * 
 *  <class>타입의 객체가 'stream'을 통과하려면 반드시 Serializable이라는 인터페이스를 상속받아서 정의받아야만 한다.
 
 	즉, Serializable 인터페이스를 구현한 클래스의 필드는 객체스트림을 통과할 수 있다. 
 	( Method랑 생성자는 Stream을 통과하지 못한다. )
 *  
 * 
 */

public class Person implements Serializable{
	private String name;
	private int age;
	private String password;
	private String address;
	
	public Person(String name, int age, String password, String address) {
		super();
		this.name = name;
		this.age = age;
		this.password = password;
		this.address = address;
	}
	
	public Person() {}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getPassword() {
		return password;
	}
	public String getAddress() {
		return address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", password=" + password + ", address=" + address + "]";
	}
	

}

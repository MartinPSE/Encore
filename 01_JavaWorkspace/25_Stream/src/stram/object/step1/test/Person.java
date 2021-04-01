
package stram.object.step1.test;

import java.io.Serializable;

/*
 * Person Ŭ���� Ÿ���� ��ü�� ������!
 * 	ObjectInputStream, ObjectOutputStream�� ���ؼ� ����(Class�� field)��
 * '��Ʈ��'�� ���ؼ� ��, ��� �ȴ�.
 * 
 *  <class>Ÿ���� ��ü�� 'stream'�� ����Ϸ��� �ݵ�� Serializable�̶�� �������̽��� ��ӹ޾Ƽ� ���ǹ޾ƾ߸� �Ѵ�.
 
 	��, Serializable �������̽��� ������ Ŭ������ �ʵ�� ��ü��Ʈ���� ����� �� �ִ�. 
 	( Method�� �����ڴ� Stream�� ������� ���Ѵ�. )
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

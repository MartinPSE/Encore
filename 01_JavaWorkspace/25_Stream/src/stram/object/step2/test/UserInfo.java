package stram.object.step2.test;

import java.io.Serializable;

public class UserInfo implements Serializable{
	
	public static final String DEFAULT_NAME = "ȫ�浿";
	public static final int DEFAULT_AGE = 19;

	private String name;
	private int age;
	/*
	 *  Password�� �����Ű�� ������ ����
	 *  �׷���, �������� ���� �����Ű�� �ʰ� �⺻������ �����Ų��
	 		<transient ��� keyword�� ���.>
	 *  
	 *  
	 */
	transient String password;
	
	public UserInfo(String name, int age, String password) {
		super();
		this.name = name;
		this.age = age;
		this.password = password;
	}
	
	public UserInfo() {
		this(DEFAULT_NAME, DEFAULT_AGE, "1234");
	}

	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", age=" + age + ", password=" + password + "]";
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getPassword() {
		return password;
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
	
	
	
	
	

}

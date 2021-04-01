package com.encore.child;

import com.encore.parent.Employee;
import com.encore.util.MyDate;

/*
 * 
 *  �θ� Ŭ���� Employee�� ���� ������ �����ް� 
 *   "�ڱ� �ڽŸ��� ����� �߰��ϴ� �ڽ� class" 
 *  
 *   ������ ȣ�� --> ��ü ���� �� �� 
 */
public class Manager extends Employee {

// �ڽĸ��� ����� �߰�
	private String dept;
	
	/*
	 *  �ڽĻ����� ---> ��ü ���� �˰���
	 *  �ڽ� ������ { ù ���ο��� ������ �θ�⺻ ������ ȣ���� �Ͼ�� }
	 * 
	 */
	
	public Manager(String name, MyDate birthDay, double salary, String dept) {// �ڽ��� �����Ƿ��Ҷ� 
		// �θ�⺻������ȣ�� !! ** ������ **   super();
		super(name, birthDay, salary);
		this.dept = dept;
		
	}
	public String printDept(){
		return dept;
	}
	/*
	 *   Method Overriding
	 *   << ��Ӱ��迡���� �Ͼ�� . >>
	 *    1step : �θ� ���� ����� �����޴´�.
	 *     2step : �װ� �ڽſ� �°� ���ľ���.
	 *     
	 *     Overriding Rule ( Method Overriding )
	 *     0. ��Ӱ����� �� Ŭ���� ���̿��� �Ͼ��.
	 *     1. �޼ҵ� ����δ� ��� ��ġ !! 
	 *     		--> return Type argument �̸�.
	 *     2. �����δ� �ݵ�� �޶�� �Ѵ�.
	 *     		--> �ϴ����� �޶����� --> ��, ���ο� Method�� ���������.
	 *     							< "�޼ҵ� ������" >
	 *     
	 *   
	 */
	@Override
	public String toString() {
		return super.toString()+ ","+ dept;
	}
	

	

}

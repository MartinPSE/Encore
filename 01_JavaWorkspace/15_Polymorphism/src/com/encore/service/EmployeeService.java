package com.encore.service;

import com.encore.child.Engineer;
import com.encore.parent.Employee;

/*
 * 
 *  ��Ӱ��迡 �ִ� �پ��� subclass���� �ڵ鸵�ϴ� ��ɸ����� �̷���� ���� Ŭ����
 *  
 */

public class EmployeeService {
	
	/*
	 *  1step
	 *  
	 *  public void manageManager(Manager m) {}
	 *  public void manageEnginner(Enginner eg) {}
	 *  public void manageSeceretary(Seceretary s{}
	 *  
	 *  2step -- overloading
	 *  "Method �̸��� ���� 
	 *  	ó���ϴ� �����͸� �޸��ϴ� ���"
	 *  << Rule >>
	 *  0. �ϳ��� Class ������ ����Ǵ� ���.
	 *  1. Method �̸��� �ݵ�� ���ƾ� �Ѵ�.
	 *  2. Method ���ڰ��� �ݵ�� �޶�� �Ѵ�.
	 *  3. Method Return Ÿ���� �������.
	 *  
	 *  
	 *  public void manageEmployee(Manager m){}
	 *  public void manageEmployee(Engineer eg){}
	 *  public void manageEmployee(Seceretary s){}
	 *  
	 *  
	 *  3step 
	 *  public void manageEmployee(Employee e){}
	 */
	public void manageEmployee(Employee e) {
		if (e.getName().equals("James")) {
			System.out.println(e);
		}
		
		if ( e instanceof Engineer) {
			System.out.println(" ���� :: " + (e.getSalary() * 12 + ((Engineer) e).getBonus()));
		}
		
	}
	
	public void printAllEmployee(Employee[] emps) {
		for ( Employee e : emps){
			System.out.println(e);
			
		}
	}
	
	
	

}

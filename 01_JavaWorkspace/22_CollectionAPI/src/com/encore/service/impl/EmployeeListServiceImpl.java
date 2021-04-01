package com.encore.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.encore.service.EmployeeListService;
import com.encore.vo.Employee;
import com.encore.vo.Engineer;
import com.encore.vo.Manager;

/*
 *  

 *  
 * 
 */

public class EmployeeListServiceImpl implements EmployeeListService{
	
	//�߰�
		private ArrayList<Employee> list;
		
		
		
		private static EmployeeListServiceImpl service = new EmployeeListServiceImpl();
		
		private EmployeeListServiceImpl() {
			list = new ArrayList<Employee>();
		}
		
		public static EmployeeListServiceImpl getInstance() {
			return service;
		}
		
		
		
		

		@Override
		public void addEmployee(Employee e) {
			boolean find = false; // flag �� �ϳ� ����.
			for ( Employee e1 : list) {
				if(e1.getEmpId().equals(e.getEmpId())) {
					find = true;
					System.out.println(e.getName()+"���� �̹� ȸ���̽ʴϴ�");
					return;
				
				}
			}
			if (find == false) { // �߰��Ϸ��� ����� ����Ʈ�� �������� �ʴٸ�
				list.add(e);
				System.out.println(e.getName()+"�� ȸ������ �Ǽ̽��ϴ�.");
			}
		}
			
			
		@Override
		public void deleteEmployee(String empId) {
			boolean find = false;
			for ( Employee e : list) {
				if(e.getEmpId().equals(empId)) {
					find = true;
					System.out.println(e.getName()+"���� ȸ����Ͽ��� �����մϴ�..");
					list.remove(e);
					break;
				}
			}
			if (find == false) {
				System.out.println("ȸ�������� ���� �������ּ���!");
			}
		}
			
		

		@Override
		public void updateEmployee(Employee e) {
			boolean find = false;
			for (Employee e1 : list){
				if(e1.getEmpId().equals(e.getEmpId())) {
					find = true;
					System.out.println(e1.getName()+"���� ������ ������Ʈ�մϴ�.");
					e1.setName(e.getName());
					e1.setAddr(e.getAddr());
//					e1.setEmpId(e.getEmpId()); // pk���� ������ ����� �Ǹ� �ȵȴ�.
					e1.setSalary(e.getSalary());
					if (e1 instanceof Manager) {
						((Manager) e1).changeDept(((Manager) e).getDept());
					}
					
					if (e1 instanceof Engineer) {
						((Engineer) e1).changeBonus(((Engineer) e).getBonus());
						((Engineer) e1).changeTech(((Engineer) e).getTech());

					}
				}
			} // for
			if(find == false) {
				System.out.println("ȸ�������� ���� �������ּ���!");
			}
			
		}

		
		@Override
		public ArrayList<Employee> findEmployees(String addr) {
			ArrayList<Employee> temp = new ArrayList<Employee>();
			for (Employee emp : list) {
				if (emp.getAddr().equals(addr)) {
					temp.add(emp);
				}
				else System.out.println("�˼��մϴ�. �����ϴ� ȸ���� �����ϴ�.");
			}
			
			
			
			return null;
		}

		@Override
		public void findEmployees() {
				for(Employee e: list) System.out.println(e);
		}
	

}

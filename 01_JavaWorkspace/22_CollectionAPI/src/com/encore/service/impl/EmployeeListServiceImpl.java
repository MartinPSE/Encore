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
	
	//추가
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
			boolean find = false; // flag 값 하나 선언.
			for ( Employee e1 : list) {
				if(e1.getEmpId().equals(e.getEmpId())) {
					find = true;
					System.out.println(e.getName()+"님은 이미 회원이십니다");
					return;
				
				}
			}
			if (find == false) { // 추가하려는 사람이 리스트에 존재하지 않다면
				list.add(e);
				System.out.println(e.getName()+"님 회원가입 되셨습니다.");
			}
		}
			
			
		@Override
		public void deleteEmployee(String empId) {
			boolean find = false;
			for ( Employee e : list) {
				if(e.getEmpId().equals(empId)) {
					find = true;
					System.out.println(e.getName()+"님을 회원목록에서 삭제합니다..");
					list.remove(e);
					break;
				}
			}
			if (find == false) {
				System.out.println("회원가입을 먼저 진행해주세요!");
			}
		}
			
		

		@Override
		public void updateEmployee(Employee e) {
			boolean find = false;
			for (Employee e1 : list){
				if(e1.getEmpId().equals(e.getEmpId())) {
					find = true;
					System.out.println(e1.getName()+"님의 정보를 업데이트합니다.");
					e1.setName(e.getName());
					e1.setAddr(e.getAddr());
//					e1.setEmpId(e.getEmpId()); // pk값은 수정의 대상이 되면 안된다.
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
				System.out.println("회원가입을 먼저 진행해주세요!");
			}
			
		}

		
		@Override
		public ArrayList<Employee> findEmployees(String addr) {
			ArrayList<Employee> temp = new ArrayList<Employee>();
			for (Employee emp : list) {
				if (emp.getAddr().equals(addr)) {
					temp.add(emp);
				}
				else System.out.println("죄송합니다. 존재하는 회원이 없습니다.");
			}
			
			
			
			return null;
		}

		@Override
		public void findEmployees() {
				for(Employee e: list) System.out.println(e);
		}
	

}

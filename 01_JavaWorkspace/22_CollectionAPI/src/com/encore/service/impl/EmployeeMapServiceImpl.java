package com.encore.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.encore.service.EmployeeMapService;
import com.encore.vo.Employee;
import com.encore.vo.Engineer;
import com.encore.vo.Manager;

/*
 *  
 *  1. 인터페이스를 상속받아서 정의해야한다.
 *  2. singletorn
 *  
 * 
 */


public class EmployeeMapServiceImpl implements EmployeeMapService{

		private Map<String, Employee> map;



		private static EmployeeMapServiceImpl service = new EmployeeMapServiceImpl();

		private EmployeeMapServiceImpl() {
			map = new HashMap<String, Employee>();
		}

		public static EmployeeMapServiceImpl getInstance() {
			return service;
		}





		@Override
		public void addEmployee(Employee e) {
			if (map.containsKey(e.getEmpId())) {
				System.out.println(e.getName()+"회원님은 이미 존재합니다.");
				return;
			}
			else {
				map.put(e.getEmpId(),e);
				System.out.println(e.getName()+"회원가입 되셨습니다.");

			}
	
	
		}	
	
	
@Override
	/*
	 * Employee emp = map.remove(empId)
	 * if (emp == null)
	 * sysout("삭제할 대상이 없습니다!)
	 * return;
	 * else sysout("삭제 되셨습니다")
	 */
	public void deleteEmployee(String empId) {
		boolean flag = false;
		for (int i =0 ; i < map.size(); i++) {
			if (map.containsKey(empId)){
				flag = true;
				Employee emp = map.remove(empId);
				System.out.println(emp+"회원님의 정보가 삭제 되셨습니다.");
			break;
		
		}
	}
	if (flag == false ) {
		System.out.println("회원가입을 먼저 진행해주세요!");
		}
		
		
	}
		
	/*
	 * if(map.hascontiankeys(e.getEmpId)){
	 * 	map.put(e.getempId,e)}
	 * else sysout("회원 가입 먼저 해주세요");
	 * 
	 */
	
	@Override
	public void updateEmployee(Employee e) {
		Employee emp = map.replace(e.getEmpId(), e);
		System.out.println(e.getName()+"님의 정보가 업데이트 되셨습니다!");
	if(emp == null) {
		System.out.println("회원가입을 먼저 진행해주세요!");
		}
		
		
	}
	
	
	@Override
	public ArrayList<Employee> findEmployees(String addr) {
		
		ArrayList<Employee> temp = new ArrayList<Employee>();
		
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Employee emp = map.get(key);
			if (emp.getAddr().equals(addr)) temp.add(emp);
		}
		
		return temp;
		
	
		
	}
	
	@Override
	public ArrayList<Employee> findEmployees() {
	ArrayList<Employee> temp = new ArrayList<Employee>();
		
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Employee emp = map.get(key);
			temp.add(emp);
		}
		
		return temp;
		
			
	}


}



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
 *  1. �������̽��� ��ӹ޾Ƽ� �����ؾ��Ѵ�.
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
				System.out.println(e.getName()+"ȸ������ �̹� �����մϴ�.");
				return;
			}
			else {
				map.put(e.getEmpId(),e);
				System.out.println(e.getName()+"ȸ������ �Ǽ̽��ϴ�.");

			}
	
	
		}	
	
	
@Override
	/*
	 * Employee emp = map.remove(empId)
	 * if (emp == null)
	 * sysout("������ ����� �����ϴ�!)
	 * return;
	 * else sysout("���� �Ǽ̽��ϴ�")
	 */
	public void deleteEmployee(String empId) {
		boolean flag = false;
		for (int i =0 ; i < map.size(); i++) {
			if (map.containsKey(empId)){
				flag = true;
				Employee emp = map.remove(empId);
				System.out.println(emp+"ȸ������ ������ ���� �Ǽ̽��ϴ�.");
			break;
		
		}
	}
	if (flag == false ) {
		System.out.println("ȸ�������� ���� �������ּ���!");
		}
		
		
	}
		
	/*
	 * if(map.hascontiankeys(e.getEmpId)){
	 * 	map.put(e.getempId,e)}
	 * else sysout("ȸ�� ���� ���� ���ּ���");
	 * 
	 */
	
	@Override
	public void updateEmployee(Employee e) {
		Employee emp = map.replace(e.getEmpId(), e);
		System.out.println(e.getName()+"���� ������ ������Ʈ �Ǽ̽��ϴ�!");
	if(emp == null) {
		System.out.println("ȸ�������� ���� �������ּ���!");
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



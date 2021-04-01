package com.encore.service;

import java.util.ArrayList;

import com.encore.vo.Engineer;
import com.encore.vo.Manager;

public class EmployeeService {
	
	ArrayList <Manager> managers;
	int midx;
	
	ArrayList <Engineer> engineers;
	int egidx;
	
	public EmployeeService (int size ) {
		managers = new ArrayList<Manager>(size);
		engineers = new ArrayList<Engineer>(size);
	}
	
	
	
	public void addManager(Manager manager) {
		managers.add(manager);
		
	}
	
	public void addEngineer(Engineer engineer) {
		engineers.add(engineer);

	}
	
	public void deleteManager(String name) {
		for ( Manager manager : managers) {
			if (manager.getName().equals(name)) {
				managers.remove(manager);
			}
				if (managers.isEmpty()) {
					try
					{
						System.out.println("더 이상 manager가 존재하지 않습니다.");
					}catch (Exception e) {
						System.out.println("manager is empty, sorry");
					}
					
				}
			}
		}
	 
		
	
	
	public void deleteEngineer(String name) {
		for (Engineer engineer : engineers) {
			if (engineer.getName().equals(name)) {
				engineers.remove(engineer);
			}
		}
		
			
	}
	
	public void updateManager(double salary, String name, int deptno, String dept) {
		for ( Manager manager : managers) {
			if (manager != null) {
				manager.setName(name);
				manager.setSalary(salary);
				manager.setDept(dept);
				manager.setDeptno(deptno);
			}
			
		} 
	}
	
	public void updateEngineer(Engineer newengineer) {
		for ( Engineer engineer : engineers) {
			engineer.setName(newengineer.getName());
			engineer.setBonus(newengineer.getBonus());
			engineer.setSalary(newengineer.getSalary());
			engineer.setTech(newengineer.getTech());
		} 
	}
	
	public Manager findManager(String name) {
		Manager find = null;
		for ( Manager manager : managers) {
			if (manager == null) {
				System.out.println("We can't find that name");
				continue;
			}
			if(manager.getName().equals(name)) find=manager; 
				
			} 
		return find;
	}
	
	public ArrayList<Manager> findManager(int deptno) {
		ArrayList<Manager> temp = new ArrayList<Manager>();
	
		for (Manager manager : managers) {
			if (manager == null) continue;
			if (manager.getDeptno() == deptno) 
			{
				temp.add(manager);
				}
		}
		
		return temp;
		}
	
	public Engineer findEngineer(String name) {
		Engineer temp = null;
		for (Engineer engineer : engineers) {
			if (engineer.getName().equals(name)) {
				temp = engineer;
			} 
		
	}
		return temp;}

	public void printManagers() {
		for (Manager manager : managers)
			if (manager != null) System.out.println(manager.getDetails());
	}
	
	public void printEngineers() {
		for (Engineer engineer : engineers)
			if (engineer != null) System.out.println(engineer.getDetails());
	}
	
	

	
	

}

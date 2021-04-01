package poly.service;

import poly.vo.Employee;
import poly.vo.Engineer;
import poly.vo.Manager;

/*
 * 
 * SingleTone Pattern
 * " �ϳ��� Ŭ�����κ��� �ϳ��� ��ü�� �����ϵ��� �ϴ� ���� "
 * 		1. Ŭ���� �ȿ��� �ϴ� ��ü �ϳ��� ����
 * 			private static ��ü�� ����. 
 * 		2. �ٸ� ������ (�ٸ� Ŭ����)�� ��ü ������ ���� ���ϵ��� ���Ƶд�.
 * 			private ������() {}
 * 		3. ����� ���� �ϳ��� ��ü�� ��𼭵��� ������ �� �� �ֵ��� public�� Method�� �����д�.
 *		-------------------------------------------------------------------
 */

public class EmployeeService {
	// static�� static���� ���Ѵ�.
	
	
	static private EmployeeService service = new EmployeeService(); //1
	
	private EmployeeService() {} //2
	
	public static EmployeeService getInstance() { //3
		return service;
	}
	
	
	
	
	public void getEmployee(Employee employee) {
		System.out.println(employee);
	}
	
	public void getAllEmployeeInfo(Employee[] employee) {
		for ( Employee e : employee) {
			System.out.println(e);
		}
		
	}
	
	public Employee findByEmpId(Employee[] employee, String empid) {
		Employee temp = new Employee();
		for(int i= 0;  i < employee.length; i ++) {
			if (employee[i].getEmpId().equals(empid)) {
				temp=employee[i];
				break;
			}
			
		}
		
		return temp;
	}
	
	public Employee[] findByAddress(Employee[] employee, String addr) {
		Employee[] temp = new Employee[employee.length];
		int idx =0 ;
		for (Employee e : employee)
			if(e.getAddr().equals(addr)) {
				temp[idx++] = e;
			} return temp;
	}
	
	public int getAnnualSalary(Employee employee) {
		int annual = 0;
		
		
		if (employee instanceof Engineer) {
			annual = employee.getSalary() * 12 + ((Engineer) employee).getBonus();
			return annual;
		} else {
		annual = employee.getSalary()*12;
		return annual;}
		
	} 
	public int getTotalCost(Employee[] employee) {
		int total = 0;
		for ( Employee e: employee ) {
			if (e instanceof Engineer) {
				total += e.getSalary() * 12 + ((Engineer) e ).getBonus();
			}
			else {
			total += e.getSalary() * 12 ;
			}
			
		} return total;
	}
	/*
	changeEmployee (String str) : void
	 * 	: Manager �μ�����
	 * 	: Engineer �������	
	*/
	public void changeEmployee (String str) {
		Employee temp = new Employee();
		if (temp instanceof Engineer) {
			((Engineer) temp).changeTech(str);
			System.out.println(temp);
		}
		if (temp instanceof Manager) {
			((Manager) temp).changeDept(str);
			System.out.println(temp);
		}
	}
	
}

package poly.service;

import poly.vo.Employee;
import poly.vo.Engineer;
import poly.vo.Manager;

/*
 * 
 * SingleTone Pattern
 * " 하나의 클래스로부터 하나의 객체만 생성하도록 하는 패턴 "
 * 		1. 클래스 안에서 일단 객체 하나는 생성
 * 			private static 객체를 생성. 
 * 		2. 다른 곳에서 (다른 클래스)는 객체 생성을 하지 못하도록 막아둔다.
 * 			private 생성자() {}
 * 		3. 만들어 놓은 하나의 객체를 어디서든지 가져다 쓸 수 있도록 public한 Method를 만들어둔다.
 *		-------------------------------------------------------------------
 */

public class EmployeeService {
	// static은 static끼리 통한다.
	
	
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
	 * 	: Manager 부서변경
	 * 	: Engineer 기술변경	
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

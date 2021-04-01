package poly.service;

import poly.vo.Employee;

public interface EmployeeService {
	
	// 총 6개의 Template Method.
	
	void getEmployee(Employee employee); // 앞에 자동적으로 public abstract가 생략되어있다.
	void getAllEmployeeInfo(Employee[] employee);
	Employee findByEmpId(Employee[] employee, String empid);
	Employee[] findByAddress(Employee[] employee, String addr);
	int getAnnualSalary(Employee employee);
	int getTotalCost(Employee[] employee);
	
	

}

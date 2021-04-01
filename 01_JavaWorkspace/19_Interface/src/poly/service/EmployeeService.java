package poly.service;

import poly.vo.Employee;

public interface EmployeeService {
	
	// �� 6���� Template Method.
	
	void getEmployee(Employee employee); // �տ� �ڵ������� public abstract�� �����Ǿ��ִ�.
	void getAllEmployeeInfo(Employee[] employee);
	Employee findByEmpId(Employee[] employee, String empid);
	Employee[] findByAddress(Employee[] employee, String addr);
	int getAnnualSalary(Employee employee);
	int getTotalCost(Employee[] employee);
	
	

}

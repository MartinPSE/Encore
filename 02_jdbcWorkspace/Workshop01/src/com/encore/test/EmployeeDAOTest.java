package com.encore.test;


import java.util.ArrayList;

import com.encore.dao.impl.EmployeeDAOImpl;
import com.encore.vo.Employee.Employee;

public class EmployeeDAOTest {

	public static void main(String[] args) throws ClassNotFoundException, Exception {
		EmployeeDAOImpl dao = EmployeeDAOImpl.getInstance();
		//		dao.insertEmp(new Employee(2323,"오형석",3500000,"다산동"));
		//		dao.removeEmp(111);
		//		dao.updateEmp(new Employee(2323,"오형석",2424,"다산1동"));
		//		dao.insertEmp(new Employee(3434,"육형석",30000,"다산2동"));
				ArrayList<Employee> list = dao.selectAll();
				for (Employee e : list) System.out.println(e);
		
		
		
		
		

	}

}

package com.encore.test;

import com.encore.child.Engineer;
import com.encore.child.Manager;
import com.encore.child.Secretary;
import com.encore.parent.Employee;
import com.encore.service.EmployeeService;
import com.encore.util.MyDate;

public class PolymorphismTest_sample {

	public static void main(String[] args) {
		
		// 1. 부모타입으로 자식생성
		
		Employee e1 = new Manager("Robert",  new MyDate(1981,4,2),33000, "IT");
		Employee e2 = new Engineer("Gosling",  new MyDate(1978,1,2),33000, "JAVA",200);
		Employee e3 = new Secretary("Peter",  new MyDate(1988,1,2),34000, "Robert");
		Employee e4 = new Manager("강호동",  new MyDate(1981,4,2),33000, "연예부");
		
		// 2. 부모타입의 배열에 초기화
		Employee [] emps = {e1,e2,e3,e4};
		
		EmployeeService service = new EmployeeService();
		
		service.manageEmployee(e4);
		service.manageEmployee(e2);
		
		service.printAllEmployee(emps);

		

	}

}

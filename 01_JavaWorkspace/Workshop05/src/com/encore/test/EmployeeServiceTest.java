package com.encore.test;

import java.util.Scanner;

import com.encore.service.EmployeeService;
import com.encore.vo.Engineer;
import com.encore.vo.Manager;
import com.encore.vo.MyDate;

public class EmployeeServiceTest {

	public static void main(String[] args) {
		
		EmployeeService service = new EmployeeService(2);
		
		System.out.println("===== 1. Add Manager =====");
		service.addManager(new Manager("오형석", new MyDate(1994,03,24), 30000, "Encore",100));
		service.addManager(new Manager("오형석2", new MyDate(1994,03,24), 30000, "Encore",100));

		service.printManagers();
		
		System.out.println("===== 2. Add Engineer =====");
		service.addEngineer(new Engineer("Encore", new MyDate(2021,03,04), 35000, "JAVA",150));
		service.addEngineer(new Engineer("Encore2", new MyDate(2021,03,04), 35000, "JAVA",150));
		service.printEngineers();
		
		System.out.println("===== Before Delete Manager list");
		service.printManagers();
		System.out.println("===== 3. Delete Manager =====");
		service.deleteManager("오형석");
		System.out.println("===== After Delete Manager list");
		service.printManagers();
		
		
		
		
		
		System.out.println("===== Before Delete Engineer list");
		service.printEngineers();
		System.out.println("===== 4. Delete Engineer =====");
		service.deleteEngineer("Encore");
		System.out.println("===== After Delete Engineer list");
		service.printEngineers();
		
		
		
		System.out.println("===== 5. Update Manager =====");
		service.printManagers();
		service.updateManager(15000, "오형석2", 200, "Encore");
		service.printManagers();

		
		System.out.println("===== 6. Update Engineer =====");
		service.printEngineers();
		service.updateEngineer(new Engineer("Encore", new MyDate(2021,03,05), 25000,"JAVA",500));		
		service.printEngineers();

		System.out.println("===== 7. Find manager by name =====");
		System.out.println("Input the name please >>");
		Scanner sc = new Scanner(System.in);
		String name1 = sc.next();
		if (service.findManager(name1) != null) // () 인풋값.
		System.out.println(service.findManager(name1).getDetails());
		else {
			System.out.println("We can't find the name");
		}
		
		System.out.println("===== 8. Find manager by Deptno =====");
		System.out.println("Input the group number >>");
		int detpno = sc.nextInt();
		for (Manager m : service.findManager(detpno)) {
			if (m == null ) {
				System.out.println("We can't find");
				continue;
			}
			else System.out.println(m.getDetails());
		}
		
		System.out.println("===== 9. Find engineer by name =====");
		System.out.println(" Input the engineer name ");
		String name2 = sc.next();
		if (service.findEngineer(name2) != null) // () 인풋값.
			System.out.println(service.findEngineer(name2).getDetails());
			else {
				System.out.println("We can't find the name");
			}

	}

}

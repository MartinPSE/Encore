	package com.encore.test;
	
	import com.encore.service.impl.EmployeeListServiceImpl;
	import com.encore.vo.Engineer;
	import com.encore.vo.Manager;
	
	public class EmployeeListServiceTest1 {
	
		public static void main(String[] args) {
			//1. Service 생성된 객체를 하나 받아온다..
		EmployeeListServiceImpl service = EmployeeListServiceImpl.getInstance();
		
		//2. method를 각각 호출..
		System.out.println("======================== 1. add ================================== ");
		Manager m1 = new Manager("111", "강호동","방배동",500, "개발부");
		Manager m2 = new Manager("222", "서장훈","서초동",700, "운동부");
		Manager m3 = new Manager("333", "이수근","여의도",400, "오락부");
		
		Engineer eg1 = new Engineer("444","김희철","송파동", 350000, "Java", 200);
		Engineer eg2 =new Engineer("555","이상민","목동", 350000, "Java", 200);
		
		service.addEmployee(m1);
		service.addEmployee(m2);		
		service.addEmployee(m3);
		service.addEmployee(eg1);
		service.addEmployee(eg2);
		service.addEmployee(m3);
		
		service.findEmployees();
		
		System.out.println("======================== 2. delete ================================== ");
		service.deleteEmployee("222");	
		
		System.out.println("======================== 3. update ==================================");
		Engineer eg3 = new Engineer ("555","이상민","목동",400000,"Python",200);
		service.updateEmployee(eg3);
		
	
			
		}
	
	}

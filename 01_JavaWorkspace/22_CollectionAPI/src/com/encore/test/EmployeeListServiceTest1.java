	package com.encore.test;
	
	import com.encore.service.impl.EmployeeListServiceImpl;
	import com.encore.vo.Engineer;
	import com.encore.vo.Manager;
	
	public class EmployeeListServiceTest1 {
	
		public static void main(String[] args) {
			//1. Service ������ ��ü�� �ϳ� �޾ƿ´�..
		EmployeeListServiceImpl service = EmployeeListServiceImpl.getInstance();
		
		//2. method�� ���� ȣ��..
		System.out.println("======================== 1. add ================================== ");
		Manager m1 = new Manager("111", "��ȣ��","��赿",500, "���ߺ�");
		Manager m2 = new Manager("222", "������","���ʵ�",700, "���");
		Manager m3 = new Manager("333", "�̼���","���ǵ�",400, "������");
		
		Engineer eg1 = new Engineer("444","����ö","���ĵ�", 350000, "Java", 200);
		Engineer eg2 =new Engineer("555","�̻��","��", 350000, "Java", 200);
		
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
		Engineer eg3 = new Engineer ("555","�̻��","��",400000,"Python",200);
		service.updateEmployee(eg3);
		
	
			
		}
	
	}

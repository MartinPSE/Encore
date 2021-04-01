package test;

public class OperatorTest1 {
	public static void main(String[] args) {
		int i = 5; // �ݵ�� �ʱ�ȭ�ϰ� ����ؾ��Ѵ�. --> ���������� �⺻���� ���������ʾ�.
		int j = 3;
		
		
		Operator o1 = new Operator(); // -
		Operator o2 = new Operator();
		
		o1 = o2;
		System.out.println(o1);
		System.out.println(o2);
		System.out.println("�ΰ��� ��ü�� ���� ���� ��ü�Դϱ�? " + (o1 == o2));
		
		// % , == , != 
		System.out.println("������ % :: " + i%j);
		System.out.println(i==j );
		System.out.println(i!=j);
		
		// ++ (1�� ����), -- (1�� ����)
		int k = 10;
		System.out.println(k++);
		System.out.println(k);
		System.out.println(++k);
		
		// �� ������
		System.out.println(o1.test1() | o1.test2()); // true or false 
		System.out.println(o1.test1() & o1.test2()); // true and false 
		
		// Short Circuit --> ����, ���� ��Ȳ�� �ǳʶڴ�.
		System.out.println(o1.test1() || o1.test2()); // true or false  --> �տ����� ���̸� ��������
		System.out.println(o1.test1() && o1.test2()); // true and false  --> 

	}

}

// class �� ������ �ٿ��� ����� ����, ���񿡸� public ���! 

class Operator {
	public boolean test1() {
		System.out.println("test1() Calling ...");
		
		return true;
		
	}
	public boolean test2() {
		System.out.println("test2() Calling ...");
		return false;
		
	}
}



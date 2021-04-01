/*
 * 
 * ==== static�� Ű���� ���� ====
 * 1. ��ü���� ���� ���� "�޸�"�� �ö󰣴�.
 * 2. ��ü���� ���� �ξ� ������ --> Class file loader �������� 
 * 		--> JVM(STACK | HEAP(New�� ���� ������� ��ü�� �ö󰣴�) | ... Class Area (static�� �������� �����)<< ���� �ö󰣴�)
 * 3. static�� ������ �ʵ�� ������ ��ü�鿡�� ���� �����Ѵ�!!
 * 4. static�� static ������ ���Ѵ�
 * 5. static ��� �ȿ����� 'this'��� �Ұ��� �ϴ� ( ���� ���ݴ��� ���� )
 * 6. static�� final�� ������ ���� �Բ� ��� �ȴ�.
 * 7. static initialization block
 * 
 * 
 */


package exam.test;

class Member{
	// �ʵ� ������ static ������ ���� (local level�δ� ��� �Ұ���)
	static String name = "������"; // static
	static int age = 28; // static
	
	
	int count = 1; // �ʵ�
	
	public static void getMember(){ // static block
		System.out.println("��/��/��/�� " + name); // static variable.
//		System.out.println("��/��/��/�� " + count); // static�� static ����!
	}
	
	public void getMember2() { // non-static block
		System.out.println("��/��/��/�� " + name); // ������� ��밡��
		System.out.println("��/��/��/�� " + count);
	}
}


public class StaticExamTest1 {

	public static void main(String[] args) {
		// static�� ������ ����� �ٷ� �����ؼ� ��밡�� --> class�̸�.classMethod;
		
		Member.getMember();
		
		// �� ������ ���� �ʿ����.
		Member m = new Member();
		m.getMember();
		
		m.getMember2();
		

	}

}

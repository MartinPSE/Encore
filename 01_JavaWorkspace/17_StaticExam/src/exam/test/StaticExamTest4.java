package exam.test;

/*
 * Modifier --> Access modifier | Usage Modifier 
 * Usage Modifier :: static, final, abstract, 
 * --> static + final �ַ� �Բ� ���� ���δ�.
 * 
 * 	< final >
 * 	"���� �������̾�"�� �ǹ��ϴ� Ű����.
 * 	final + ���� --> "���� ������ ������" ---> �������
 * 	final + Ŭ���� --> "���� ������ class��" ---> ����� ���ϰ� �Ϸ���!!
 * 	final + method  --> "���� ������ Method��" --->  �������̵� ����!!!
 * 
 */


class A {
	public final static int BASE_SALARY = 300; // ��� ������ �빮�ڷ� ������
	public final String test() { // method �տ� final �������̵� �Ұ�
		return "Overriding ����";
	}
	
}

final class B { // ��� �Ұ�
	
	
}

//class C extends B {
//	
//}

class D extends A {
	
	public void U() {
		System.out.println(super.test());

	}
	

	
}

public class StaticExamTest4 {


	public static void main(String[] args) {
		D dd = new D();
		dd.U();

	}

}

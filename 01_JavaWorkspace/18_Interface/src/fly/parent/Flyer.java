package fly.parent;

// ������ �Ͱ� ���õ� �߻����� ��Ƴ��� �������̽�

/*
 *  << interface �� ���� ��� >>
 *  	1. static final ���.
 *  	2. public abstract �޼ҵ�.
 *  
 * 
 */

public interface Flyer {
	// �ʵ尡 ����... ����� ����
	public static final int SIZE = 300;
	
	public abstract void fly(); // abstract method ... ����� �ְ� {������} �� ����!! 
	void land (); // Interface �ȿ��� ������ �޼ҵ� ����Ÿ�� �տ� public abstract �����ȴ�.
	
	
	void take_off();
 	

}

package thread.step4.test;

import javax.swing.JOptionPane;

/*
 * 
 *  ���� �����常 �����Ǵ� ������ ����
 *  �����۾� ( �������� �۾��� �Ұ����ϴ� )
 *  
 *  
 *  �ζǹ�ȣ�� �Է¹޴� �۾� 
 *      	+
 *  ī������ �ϴ� �۾� 
 *  ----> 10�ʾȿ� ���������� �ζǹ�ȣ�� �Է�!!
 *  
 */




public class InputThreadTest1 {

	public static void main(String[] args) {
		// 1. ������ �Է� ... �۾� ... GUI
		String input = JOptionPane.showInputDialog("���� �ζ� ��ȣ �������ڸ� ���ڸ� �Է��ϼ���!");
		System.out.println("�Է��� ���ڴ� " + input + " �Դϴ�");
		
		// 2. ������ ī���� �۾�
		for ( int i = 10 ; i >=1 ; i--) {
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e ) {
				
			}
			System.out.println(i);
		}

	}

}
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
 *   
 *  ==========================
 *  
 *  �۾������带 �ϳ� �߰��Ѵ�.
 *  CountingThread�� ���Ӱ� �ϳ� ���� --> �ζǹ�ȣ �Է°� Counting �۾��� ���������� ó���ǵ��� ������ �ϼ�
 *  
 *  
 */

//class CountingThread extends Thread {
//	
//	public void run() {
//				for ( int i = 10 ; i >=1 ; i--) {
//					try {
//						Thread.sleep(1000);
//					}catch (InterruptedException e ) {
//						
//					}
//					System.out.println(i);
//				}
//	}
//}

class CountingThread implements Runnable {
	public void run() { 
		for ( int i = 10; i >= 1; i -- ) {
			try {
				Thread.sleep(1000);
				
			}catch (InterruptedException e) {
				
			}
			System.out.println(i);
		}
	}
}





public class InputThreadTest2 {

	public static void main(String[] args) {
		// 1. ������ �Է� ... �۾� ... GUI
		CountingThread counting = new CountingThread();
		Thread t = new Thread(counting);
		t.start();
		
		String input = JOptionPane.showInputDialog("���� �ζ� ��ȣ �������ڸ� ���ڸ� �Է��ϼ���!");
		System.out.println("�Է��� ���ڴ� " + input + " �Դϴ�");
		
		
		
				}
		

	}



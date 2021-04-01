package thread.step3.test;

import java.awt.Toolkit;

/*
 * 	Thread
 		1) main ������ ... ���� ������... 0
 		2) �۾������� ... X 
 * 
 * 
 * 
 *  �ش� �ڵ忡���� ������ Thread Ŭ������ �ۼ����� �ʴ´�.
 *  Main thread(���� thread)�� ����!
 *  ---> Single Thread ��! 
 		--> �۾��� �������� �ƴ϶�, ���������θ� �̷����Եȴ�.
 * 
 * 	Beep(����� �߻�)! + ������� �ܼ�â���� ���.
 * 
 * 
 * 
 * 
 * 
 * 
 *  ========================================
 *  ������� �︮�� �۾� & ������� ����ϴ� �۾��� �����ؼ� 
 *  ó���ϵ��� ������ �ۼ� 
 *  -->> 
 *  How to solve ?
 *  ������� ����ϴ� �۾��� ������� ������ �Ѵ�.
 *  BeepPrintThread�� �ϳ� �ۼ�
 *  BeepPrintThread2���� ���ÿ� �ۼ�.
 * 
 * 
 */
public class BeepPrintTest1 {

	public static void main(String[] args) {
		Toolkit tool = Toolkit.getDefaultToolkit();
		
		// ����� 5�� �︮��!
		for (int i=0; i < 5; i++) {
			tool.beep();
			System.out.println("��~");
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				
			}
		}
	
		
	}
}

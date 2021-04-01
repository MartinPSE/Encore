package thread.step6.test;

import java.awt.Toolkit;

/*
 *  Thread 
 	: MegaBox���� �¼��� �����ϴ� ���� �����Ѵ�.
 	: reserve() 
 	
 	
 * 
 */

public class MegaBoxUser implements Runnable{
	private boolean seat = false; // �¼����Ű� ������ change!

	@Override
	public void run() {
		// ����θ� ���� �� �� ���, throws�� �ٽ� ���Ѵ�.
		// ������ ȣ���� �߱� ������!
		try {
			reserve();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	// �������� ������ run method ���ͼ� ��������.
	
	public synchronized void reserve() throws InterruptedException{
		// �¼��� �����ϴ±��
		String tName = Thread.currentThread().getName();
		System.out.println(tName+"��, ��ȭ�����Ϸ� ���̽��ϴ�.");
		if(seat==false) { // ���� �¼��� �� ���´�
			Thread.sleep(1000); // ���� try, catch �� �� �ִµ� ���������ϱ� ��������.
			
			System.out.println(tName+"���� ���Ű� �Ϸ�Ǿ����ϴ�.");
			seat = true; // Totally important!
			
		} else {
			Toolkit tool = Toolkit.getDefaultToolkit();
			tool.beep();
			System.out.println("�˼��մϴ�. "+tName+"���� �ش� �¼��� �̹� ���Ű� �Ǿ����ϴ�." );
		}
		
		
	}
	
	
	

}

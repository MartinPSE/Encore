package thread.step1.test;


/*
 * Thread Ŭ������ ��ӹ޾Ƽ� Thread�� �����.
 * Thread�� 2���� �����Ѵ�.
 * 
 	GoThread | ComeThread
 * 
 */


class GoThread implements Runnable {


	@Override
	public void run() {
		int i = 0;
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { // Thread ���� ������ �� ������ �߻�
			 // CPU�� ���� �����ϱ� ���ؼ�
				e.printStackTrace();
			}
			
			// ���� �������� Thread�� �̸��� �����ϴ� ���
			String tname = Thread.currentThread().getName();
			System.out.println("CurrentThread Name :: "+ tname+"," + i );
			i++;
			if(i==20) break;
		}
		
	}
	
	
	
}


class ComeThread implements Runnable  {

	

	@Override
	public void run() {
		int i = 0;
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { // Thread ���� ������ �� ������ �߻�
			 // CPU�� ���� �����ϱ� ���ؼ�
				e.printStackTrace();
			}
			String tname = Thread.currentThread().getName();
			System.out.println("CurrentThread Name :: "+ tname +","+ i );
			i++;
			if(i==20) break;
		}
		
	}
	
	
	
}


public class GoComeThread {

	public static void main(String[] args) {
		//GoComeThread ��� ���μ��� �ȿ��� 2���� �����带 ���۽��Ѻ����� ����.
		GoThread go = new GoThread();  // ��ä �����ϰ�
		ComeThread come = new ComeThread();
		
		// Thread�� ���۽�Ű�� ���! 
		Thread t1 = new Thread(go,"goThread"); // run �ؾ���!
		Thread t2 = new Thread(come,"comeThread");
		t1.start(); // �ٷ� start�� ���ϱ⶧����
		t2.start();
		

	}

}

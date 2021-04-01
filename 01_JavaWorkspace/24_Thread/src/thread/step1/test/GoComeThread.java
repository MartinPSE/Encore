package thread.step1.test;


/*
 * Thread 클래스를 상속받아서 Thread를 만든다.
 * Thread는 2개를 생성한다.
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
			} catch (InterruptedException e) { // Thread 에선 무조건 이 에러가 발생
			 // CPU를 먼저 점령하기 위해서
				e.printStackTrace();
			}
			
			// 현재 실행중인 Thread의 이름을 리턴하는 기능
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
			} catch (InterruptedException e) { // Thread 에선 무조건 이 에러가 발생
			 // CPU를 먼저 점령하기 위해서
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
		//GoComeThread 라는 프로세스 안에서 2개의 쓰레드를 동작시켜보도록 하자.
		GoThread go = new GoThread();  // 객채 생성하고
		ComeThread come = new ComeThread();
		
		// Thread를 동작시키는 방법! 
		Thread t1 = new Thread(go,"goThread"); // run 해야해!
		Thread t2 = new Thread(come,"comeThread");
		t1.start(); // 바로 start는 못하기때문에
		t2.start();
		

	}

}

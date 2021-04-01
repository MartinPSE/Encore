package thread.step6.test;

import java.awt.Toolkit;

/*
 *  Thread 
 	: MegaBox에서 좌석을 예매하는 일을 전담한다.
 	: reserve() 
 	
 	
 * 
 */

public class MegaBoxUser implements Runnable{
	private boolean seat = false; // 좌석예매가 끝나면 change!

	@Override
	public void run() {
		// 선언부를 수정 할 수 없어서, throws를 다시 못한다.
		// 내부적 호출을 했기 때문에!
		try {
			reserve();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	// 실질적인 내용은 run method 나와서 구현하자.
	
	public synchronized void reserve() throws InterruptedException{
		// 좌석을 예매하는기능
		String tName = Thread.currentThread().getName();
		System.out.println(tName+"님, 영화예매하러 오셨습니다.");
		if(seat==false) { // 현재 좌석이 빈 상태다
			Thread.sleep(1000); // 여기 try, catch 쓸 수 있는데 더러워지니깐 던져주자.
			
			System.out.println(tName+"고객님 예매가 완료되었습니다.");
			seat = true; // Totally important!
			
		} else {
			Toolkit tool = Toolkit.getDefaultToolkit();
			tool.beep();
			System.out.println("죄송합니다. "+tName+"고객님 해당 좌석은 이미 예매가 되었습니다." );
		}
		
		
	}
	
	
	

}

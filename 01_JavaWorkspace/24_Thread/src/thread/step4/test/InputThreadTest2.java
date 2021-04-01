package thread.step4.test;

import javax.swing.JOptionPane;

/*
 * 
 *  메인 쓰레드만 가동되는 로직을 생성
 *  동시작업 ( 병렬적인 작업이 불가능하다 )
 *  
 *  
 *  로또번호를 입력받는 작업 
 *      	+
 *  카운팅을 하는 작업 
 *   
 *  ==========================
 *  
 *  작업쓰레드를 하나 추가한다.
 *  CountingThread를 새롭게 하나 정의 --> 로또번호 입력과 Counting 작업이 병력적으로 처리되도록 로직을 완성
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
		// 1. 데이터 입력 ... 작업 ... GUI
		CountingThread counting = new CountingThread();
		Thread t = new Thread(counting);
		t.start();
		
		String input = JOptionPane.showInputDialog("최종 로또 번호 마지막자리 숫자를 입력하세요!");
		System.out.println("입력한 숫자는 " + input + " 입니다");
		
		
		
				}
		

	}



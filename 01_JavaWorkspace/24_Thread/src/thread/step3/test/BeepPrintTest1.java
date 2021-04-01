package thread.step3.test;

import java.awt.Toolkit;

/*
 * 	Thread
 		1) main 쓰레드 ... 데몬 쓰레드... 0
 		2) 작업쓰레드 ... X 
 * 
 * 
 * 
 *  해당 코드에서는 별도의 Thread 클래스를 작성하지 않는다.
 *  Main thread(데몬 thread)만 실행!
 *  ---> Single Thread 모델! 
 		--> 작업이 연속적이 아니라, 순차적으로만 이뤄지게된다.
 * 
 * 	Beep(경고음 발생)! + 경고음을 콘솔창으로 출력.
 * 
 * 
 * 
 * 
 * 
 * 
 *  ========================================
 *  경고음을 울리는 작업 & 경고음을 출력하는 작업을 병행해서 
 *  처리하도록 로직을 작성 
 *  -->> 
 *  How to solve ?
 *  경고음을 출력하는 작업을 쓰레드로 만들어야 한다.
 *  BeepPrintThread를 하나 작성
 *  BeepPrintThread2에서 동시에 작성.
 * 
 * 
 */
public class BeepPrintTest1 {

	public static void main(String[] args) {
		Toolkit tool = Toolkit.getDefaultToolkit();
		
		// 경고음 5번 울리기!
		for (int i=0; i < 5; i++) {
			tool.beep();
			System.out.println("띵~");
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				
			}
		}
	
		
	}
}

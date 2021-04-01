package thread.step4.test;

import javax.swing.JOptionPane;

/*
 *  Counting : CountThread
 *  숫자입력작업 : LottoInputThread
 *  ::
 *  두개의 Thread --> Process안에서 서로 Resource를 공유하면서 도는 상황을 로직으로 작성!
 *  카운팅 되는 상황을 서로 공유하도록 로직을 작성.
 *  ::
 *  1. 카운트가 다 끝나도록 숫자입력이 안되면 - 해당 프로그램을 종료 // 
 * 	2. 카운트 진행도중에 숫자가 입력이 된다면 - 카운팅을 종료 한다. 
 * 		--> 위 2가지 요구사항이 충족되도록 로직을 완성.
 * 
 *  :: 
 *  < Solution >
 *  같은 Process를 공유해야해!! 즉 Hasing을 해야해!!
 *  
 */

class CountThread extends Thread{
	InputThreadTest3 process;
	
	public CountThread(InputThreadTest3 process) {
		super();
		this.process = process;
		
	}

	public void run() {
		for (int i = 10 ; i >= 1; i--) {
			if(process.inputCheck) break;
			try {
				Thread.sleep(1000);
			}
		catch(InterruptedException e) {
			
		}
			System.out.println(i);
	}
		if (!process.inputCheck) {
			System.out.println("입력시간 초과!");
			System.exit(0);
		}
	
	}
}


class LottoInputThread extends Thread {
	
	
	InputThreadTest3 process;
	
	
	public LottoInputThread(InputThreadTest3 process) {
		super();
		this.process = process;
		
	}
	
	
	public void run() {
		String input = JOptionPane.showInputDialog("최종 로또 번호 마지막자리 숫자를 입력하세요!");
		System.out.println("입력한 숫자는 " + input + " 입니다");
		
		process.inputCheck = true;	
	}
}

public class InputThreadTest3 {
	
	boolean inputCheck = false;

	public static void main(String[] args) {
		
		InputThreadTest3 item = new InputThreadTest3();
		
		CountThread ct = new CountThread(item);
		LottoInputThread lotto = new LottoInputThread(item);
		
		ct.start();
		lotto.start();
		
		
		
		
		}
	}



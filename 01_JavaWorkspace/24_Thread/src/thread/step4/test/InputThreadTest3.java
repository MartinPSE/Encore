package thread.step4.test;

import javax.swing.JOptionPane;

/*
 *  Counting : CountThread
 *  �����Է��۾� : LottoInputThread
 *  ::
 *  �ΰ��� Thread --> Process�ȿ��� ���� Resource�� �����ϸ鼭 ���� ��Ȳ�� �������� �ۼ�!
 *  ī���� �Ǵ� ��Ȳ�� ���� �����ϵ��� ������ �ۼ�.
 *  ::
 *  1. ī��Ʈ�� �� �������� �����Է��� �ȵǸ� - �ش� ���α׷��� ���� // 
 * 	2. ī��Ʈ ���൵�߿� ���ڰ� �Է��� �ȴٸ� - ī������ ���� �Ѵ�. 
 * 		--> �� 2���� �䱸������ �����ǵ��� ������ �ϼ�.
 * 
 *  :: 
 *  < Solution >
 *  ���� Process�� �����ؾ���!! �� Hasing�� �ؾ���!!
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
			System.out.println("�Է½ð� �ʰ�!");
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
		String input = JOptionPane.showInputDialog("���� �ζ� ��ȣ �������ڸ� ���ڸ� �Է��ϼ���!");
		System.out.println("�Է��� ���ڴ� " + input + " �Դϴ�");
		
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



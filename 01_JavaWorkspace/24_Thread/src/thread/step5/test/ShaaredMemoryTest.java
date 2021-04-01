package thread.step5.test;

class Calculator{
	private int memory;

	public void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(10);
		}
		catch(InterruptedException e) {
			
		}
		System.out.println(Thread.currentThread().getName()+"  :   " + this.memory);
	}
	
	public int getMemory() {
		return memory;
	}
	
	

	
}


class userA extends Thread {
	private Calculator calculator; // setter로 주입
	
	public void setCalculator(Calculator calculator) {
		setName("CalculatorUserA");
		this.calculator = calculator;
	}

	public void run () {
		System.out.println("작동중..thread1");
		calculator.setMemory(100);
		
		
	}
}


class userB extends Thread {
	
	private Calculator calculator; // setter로 주입
	
	public void setCalculator(Calculator calculator) {
		setName("CalculatorUserB");
		this.calculator = calculator;
	}
	
	public void run () {
		System.out.println("작동중 thread2..");
		calculator.setMemory(50);

		
	}
}





public class ShaaredMemoryTest {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		
		
		userA thread1 = new userA();
		thread1.setCalculator(cal);
		thread1.start();
		
		userB thread2 = new userB();
		thread2.setCalculator(cal);
		thread2.start();
		
				

	}

}

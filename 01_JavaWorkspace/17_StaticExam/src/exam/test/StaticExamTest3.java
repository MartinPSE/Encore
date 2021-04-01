package exam.test;

// static initialization block
// 초기화.

public class StaticExamTest3 {
	static int i = 0;

	public static void main(String[] args) {
		System.out.println("1. main method static block...."+ i);

	}
	
	static { // static 초기화 블락 --> main 보다 먼저 돌아간다.
		i = 300;
		System.out.println("2. static initialization block...." + i);
		
	}

}

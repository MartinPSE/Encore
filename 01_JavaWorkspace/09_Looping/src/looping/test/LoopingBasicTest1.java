package looping.test;
/*
 *  반복문 중에서 가장 많이 사용되는 for문이 어떻게 동작하는지 정확하게 이해한다.
 *  
 *  for( 초기식 ; 조건문 ; 증감 )
 */



public class LoopingBasicTest1 {

	public static void main(String[] args) {
		for ( int i = 0 ; i < 10 ; i ++ ) {
			System.out.println(i);
		}
		
		int  i =0 ;
		while ( i < 10 ) {
			System.out.println(i);
			i ++;
		}
		
		int j = 10 ;
		do {
			System.out.println("멍청아" + j );
			j ++;
		}
		while (j < 10 );
		
}
}

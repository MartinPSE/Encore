package looping.test;
/*
 * 
 * 
 *  for ���� �̿��ؼ� 1~ 100 ������ ������ ���ϴ� ������ �ۼ�
 *  ������ �ϳ� �� �߰��Ѵ�.
 *    - ������ 500�� �Ѿ�� �ݺ��� �ߴ��ϰ� 
 *    - �׶��� ���� �� i ���� ��� 
 *    
 */


public class LoopingBreakTest2 {
	

	public static void main(String[] args) {
		int sum = 0;
		for ( int i = 0 ; i <=100 ; i ++ ) {
			sum += i ;
			if ( sum > 500 ) 
			break;
		} System.out.println(sum); 
	}

}

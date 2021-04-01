package array.test;

public class ArrayMaxAndMinTest3 {

	public static void main(String[] args) {

		int [] scores = {79, 88, 91, 44, 99, 55, 96 };
		
		int max = scores[0] , min = scores[0] ; // 배열의 첫번째 값으로 기본값을 초기화 한다.
		
//		for (int i = 1 ; i < scores.length ; i ++ ) {
//			if( scores[i] < min) {
//				min = scores[i];
//			}
//			if (scores[i] > max ) {
//				max = scores[i];
//			}
//		} 
//		
		// Advanced For, forEach 구문 --> 코딩테스트에선 사용하지 말 것.
		for (int score : scores) {
			if ( score < min) min = score ;
			if (score > max) max = score ;
			}
		
		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);	
		

	}

}

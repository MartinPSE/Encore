package array.test;

public class ArrayMaxAndMinTest3 {

	public static void main(String[] args) {

		int [] scores = {79, 88, 91, 44, 99, 55, 96 };
		
		int max = scores[0] , min = scores[0] ; // �迭�� ù��° ������ �⺻���� �ʱ�ȭ �Ѵ�.
		
//		for (int i = 1 ; i < scores.length ; i ++ ) {
//			if( scores[i] < min) {
//				min = scores[i];
//			}
//			if (scores[i] > max ) {
//				max = scores[i];
//			}
//		} 
//		
		// Advanced For, forEach ���� --> �ڵ��׽�Ʈ���� ������� �� ��.
		for (int score : scores) {
			if ( score < min) min = score ;
			if (score > max) max = score ;
			}
		
		System.out.println("�ּҰ� : " + min);
		System.out.println("�ִ밪 : " + max);	
		

	}

}

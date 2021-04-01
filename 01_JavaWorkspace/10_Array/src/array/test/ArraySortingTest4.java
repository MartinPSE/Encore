package array.test;

import java.util.Random;

/*
 * 
 *  Sorting --> ����
 *  
 *  �迭�� ���� �ڷᱸ���� �־�� [  , , , , , , ] 
 *  ���Ŀ� ���� �䱸������ ����ϰ� �Ͼ��. 
 *  �����̶�?
 *  ������ {3,6,1,2,8,9 } --> ���� �� {1,2,3,6,8,9}
 *  ���� | ���� 
 *  		������ ���� �Էµ� ������ ���Ѵ�. 
 *  
 *  :: Bubble Sorting - - - ���� ����
 *  		������ �����ϱ� ���� �˰��� �߿��� ���� ��ǥ���� �˰���
 *  
 *  ���
 *  ������ �� ���� ���ؼ� ū ���� �ڷ� ������ ���
 *  5, 3 ---> 
 *  			1 ) temp ��� �ӽú����� �ϳ� �����. �� �ȿ� 5�� ��� ����
 *  			2 ) 3�� 5�� �ڸ��� ���� ���´�.
 *       		3 ) 3�� �ڸ����� temp�ȿ� �ִ� 5�� �ٽ� �����ͼ� ���� ���´�.
 *       			--> �̷��� 2���� �ڸ��� temp ������ �̿��ؼ� �ٲٴ� ����� swap �̶� �Ѵ�. 
 *  
 */

public class ArraySortingTest4 {

	public static void main(String[] args) {
		Random r = new Random();
//		int a = r.nextInt();
		
		int [ ] arr = new int [10];
		for ( int i = 0; i < arr.length; i ++) 	arr[i] = r.nextInt(10); // 0~9 ������ ������ ���� ��.
		
		System.out.println(" ======= �迭�� �ʱ�ȭ �Ϸ� ====== ");
		for (int i: arr) System.out.print(i + " ");
		
		int temp = 0;
		for (int i = 0 ; i<arr.length -1 ; i++) {
			for ( int j = 0; j < arr.length - 1 ; j++) {
				if( arr[j] > arr[j+1]) {
					temp = arr[j];      // swap
					arr[j] = arr[j+1];  // swap
					arr[j+1] =temp;  // swap 
			}
		}
	}
		System.out.println("\n ===== �������� ======");
	for (int u:arr)
		
	System.out.print(u+ " ");}

}

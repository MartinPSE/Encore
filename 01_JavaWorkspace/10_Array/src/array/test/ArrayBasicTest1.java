package array.test;
/*
 * 
 *  �迭 --> ����, ����, �ʱ�ȭ ������ �ۼ�
 *  
 *  for ���� ����ؼ� �迭 �ȿ� ����ִ� ������ �ܼ�â���� ���.
 */


public class ArrayBasicTest1 {

	public static void main(String[] args) {
		int [] arr = new int[3];
		arr[0] = 0;
		arr[1] = 22;
		arr[2] = 33;
		for (int e: arr){
			System.out.println(e);
		}
		for (int i = 0 ; i < arr.length ; i ++) System.out.println(arr[i]);
	}

}

package array.test;
/*
 * 
 *  배열 --> 선언, 생성, 초기화 과정을 작성
 *  
 *  for 문을 사용해서 배열 안에 들어있는 값들을 콘솔창으로 출력.
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

package array.test;

import java.util.Arrays;
import java.util.Random;

public class ArraySortingTest5 {

	public static void main(String[] args) {
		Random r = new Random();
//		int a = r.nextInt();
		
		int [ ] arr = new int [10];
		for ( int i = 0; i < arr.length; i ++) 	arr[i] = r.nextInt(10); // 0~9 사이의 임의의 정수 값.
		
		System.out.println(" ======= 배열의 초기화 완료 ====== ");
		for (int i: arr) System.out.print(i + " ");
		
		// ~ Test4에서 이중 for문을 사용해서 Bubble Sorting 하는 로직을 내부적으로 구현이 된 함수를 바로 사용
		// ---> Arrays에 있는 sort library 사용. 
		Arrays.sort(arr);
		
	
		System.out.println("\n ===== 버블정렬 ======");
		for (int u:arr) System.out.print(u+ " ");}

}

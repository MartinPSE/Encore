import java.util.Arrays;
import java.util.Scanner;

public class FlattenBoxTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = 10; // test케이스 10개 
		int boxLen = 100;  // 가로길이 
		for(int tcn = 1; tcn<=tc; tcn++) {
			int dump = sc.nextInt(); // dump 횟수  
			
			
			int[ ] boxes = new int[boxLen];
			for(int i=0; i<boxes.length; i++) {
				boxes[i] = sc.nextInt();  // 각 상자의 길이를 받자. 
			} // 배열 초기화 
			
			int heighDiff=flatten(boxes,dump );
			System.out.printf("#%d %d%n",tcn, heighDiff);
		}

	}
	
	

	static int flatten(int[] boxes, int dump) {
		int max = 0;
		int min = 999;
		int result = 0;
		
		Arrays.sort(boxes);
		for ( int j = 0 ; j < dump ; j ++) {
			Arrays.sort(boxes);
			boxes[0]++;
			boxes[boxes.length-1]--;
		}
		
		for ( int k = 0; k < boxes.length ; k++) {
			if (boxes[k] < min ) {
				min = boxes[k];
			}
			if (boxes[k] > max) {
				max = boxes[k];
			}
		}
		
		result = max- min;
			
			return result;}
			
			
				
}













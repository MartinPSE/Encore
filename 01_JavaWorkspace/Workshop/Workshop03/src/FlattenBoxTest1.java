import java.util.Arrays;
import java.util.Scanner;

public class FlattenBoxTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = 10; // test���̽� 10�� 
		int boxLen = 100;  // ���α��� 
		for(int tcn = 1; tcn<=tc; tcn++) {
			int dump = sc.nextInt(); // dump Ƚ��  
			
			
			int[ ] boxes = new int[boxLen];
			for(int i=0; i<boxes.length; i++) {
				boxes[i] = sc.nextInt();  // �� ������ ���̸� ����. 
			} // �迭 �ʱ�ȭ 
			
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













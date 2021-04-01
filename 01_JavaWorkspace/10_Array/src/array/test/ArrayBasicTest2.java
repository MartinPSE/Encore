package array.test;
/*

 *  �迭�� ���� + ���� + �ʱ�ȭ ---> �ѹ濡 �غ���
 *   
 *   
 *   1. �迭�� ReSizing �� �� ����.
 *   		ó�� ����� �����ϰ� �Ǹ� --> ���ο� �迭�� �ϳ� �����ȴ�. 
 *   
 *   2. �迭�� ��ü�� 
 *   		new Ű���带 ���ؼ� ���� --> Heap�� �ö󰣴�. 
 *   		������ Class Type�� �������� �ʴ´�.
 *   		length ��� �ʵ带 �ݵ�� �������. 
 *   		( �迭���� �������� ������ Return ���ִ� �ʵ� ) 
 *   3. arraycopy() -> size�� �ٸ� �迭�� �̿��Ҷ� ������ api
 *   
 * 
 * */



public class ArrayBasicTest2 {

	public static void main(String[] args) {
		int [] arr = {11, 22, 33} ;
		for ( int e : arr ) {
			System.out.println(e);
		}
					
		arr = new int[5];
		arr[3] = 44;
		arr[4] = 55;
		
		for ( int e : arr) {
			
			System.out.print(e + " ");
		}
		
		System.out.println("\n arraycopy() \n");
		int [] target = {1,2,3,4,5,6};
		int [] source = {10,9,8,7,6,5,4,3,2,1};
		
		System.arraycopy(source, 3 , target , 0, 4);
		for ( int e : target) {
			System.out.print(e+ " ");
		}
		
		
		
	}
	
}

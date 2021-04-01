package array.test;
/*

 *  배열의 선언 + 생성 + 초기화 ---> 한방에 해보자
 *   
 *   
 *   1. 배열은 ReSizing 할 수 없다.
 *   		처음 사이즈를 변경하게 되면 --> 새로운 배열이 하나 생성된다. 
 *   
 *   2. 배열은 객체다 
 *   		new 키워드를 통해서 생성 --> Heap에 올라간다. 
 *   		하지만 Class Type이 존재하지 않는다.
 *   		length 라는 필드를 반드시 기억하자. 
 *   		( 배열안의 데이터의 갯수를 Return 해주는 필드 ) 
 *   3. arraycopy() -> size가 다른 배열을 이용할때 유용한 api
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

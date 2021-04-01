package com.encore.datatype;

/*
 * 1. 필드 
 *    int 사이즈,  char 컬러, float 가격, String 제조회사, String 재질 
 *    스크래치 여부를 알수 있는 필드를 추가
 * 
 * 2. 메소드(Python에서 함수와 같은 개념)
 * 		2개 정의
 * 			- 값을 Test 클래스에서 받아서 필드에 입력하는 기능
 * 			- 필드에 입력된, 저장된 값을 콘솔에 출력
 * 
 *** 변수(Variable)은 사용되는 위치에 따라서 Field 와 Local V로 구분된다.
 *     필드 --> 클래스 선언 바로 밑, 메소드 블락 바깥
 *     Local V(지역변수) --> Method 내부에서만 선언  
 */
public class WhiteBoard {
	public int size;
	public char color;
	public float price;
	public String company;
	public String material;
	public boolean scratch;
	
	public void setInfo(int size, char color, float price, String company, String material, boolean scratch) {
		// 필드와 로컬변수의 이름이 같을때, 구분하기 위해서 필드앞에 this를 붙인다.
		// this는 해당클래스 '자기자신' 해석.
		this.size = size;
		this.color =color;
		this.price = price;
		this.company = company;
		this.material = material;
		this.scratch = scratch; 
	
	}
	public void printInfo() {
		System.out.println(size + "\t" + color + "\t" + price +"\t" + company + "\t" + material + "\t" + scratch ) ;
		
	}
	

}

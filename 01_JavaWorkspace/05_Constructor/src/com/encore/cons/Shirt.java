package com.encore.cons;
/*
 *  1. 생성자 ( Constructor)
 *  객체가 생성될때마다 구동(호출) 되는 것. 
 *  2. 기본 생성자
 *  ::
 *  인자가 없고
 *  {} 안에서 아무런 동작도 하지 않는 생성자. 
 *  
 */
public class Shirt {
	// 1. 필드 선언 
	public String brandname;
	public double price;
	public boolean	 longSleeved;
	
	public Shirt () {
		// 필드 초기화 

		
	}

	
	
	public String getDetails( ) {
		return brandname + ", "+ price +", " + longSleeved;
		
	}
}

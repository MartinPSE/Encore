package com.encore.datatype.test;

import com.encore.datatype.*;

public class WhiteBoardTest1 {

	public static void main(String[] args) {
		
		/*
		 * WhiteBoard 객체를 wb라는 이름으로 하나 생성
		 * 필드에 값을 입력
		 * 입력된 값을 출력 
		 */
		WhiteBoard wb = new WhiteBoard();
		wb.setInfo(100, 'B', 15000, "Nike", "Nylon",false);
		wb.printInfo();
		}
}



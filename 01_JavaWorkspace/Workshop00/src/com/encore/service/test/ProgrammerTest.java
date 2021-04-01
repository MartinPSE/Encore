package com.encore.service.test;


import com.encore.service.Programmer;
import com.encore.util.MyDate;
import com.encore.service.NoteBook;

public class ProgrammerTest {

	public static void main(String[] args) {
		// 1. Programmer 객체를 생성
		// 2. Programmer가 NoteBook을 가짐
		// 3. 개발자 정보와 노트북 정보를 출력
		// 4. 더 필요한 기능이 있다면 각자 알아서 추가
		
		Programmer pro = new Programmer("Martin" , new MyDate(1994,3,24),"Encore" ,"JAVA");
		pro.setNotebook(new NoteBook(111,"RENOVO", 120));
		
		NoteBook myNoteBook = pro.getNoteBook();
		System.out.println("Martin이 구매한 노트북의 정보 \n" );
		System.out.println(myNoteBook.getNoteBookInfo());
		
		System.out.println("\n Martin의 정보입니다.");
		System.out.println(pro.getProgrammerInfo());
		
		
		

	}

}

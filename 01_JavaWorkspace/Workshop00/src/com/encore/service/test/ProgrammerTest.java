package com.encore.service.test;


import com.encore.service.Programmer;
import com.encore.util.MyDate;
import com.encore.service.NoteBook;

public class ProgrammerTest {

	public static void main(String[] args) {
		// 1. Programmer ��ü�� ����
		// 2. Programmer�� NoteBook�� ����
		// 3. ������ ������ ��Ʈ�� ������ ���
		// 4. �� �ʿ��� ����� �ִٸ� ���� �˾Ƽ� �߰�
		
		Programmer pro = new Programmer("Martin" , new MyDate(1994,3,24),"Encore" ,"JAVA");
		pro.setNotebook(new NoteBook(111,"RENOVO", 120));
		
		NoteBook myNoteBook = pro.getNoteBook();
		System.out.println("Martin�� ������ ��Ʈ���� ���� \n" );
		System.out.println(myNoteBook.getNoteBookInfo());
		
		System.out.println("\n Martin�� �����Դϴ�.");
		System.out.println(pro.getProgrammerInfo());
		
		
		

	}

}

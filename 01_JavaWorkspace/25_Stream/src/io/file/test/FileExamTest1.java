package io.file.test;


import java.io.File;

/*
 *  ���� = ���丮���� + �����̸�
	
	�ش� Ŭ���������� ������ '�پ��� ���'���� ����.
	getParentFile() : Return Type : File, getParent() : Return Type String 
	  	 ||||
    mkdir(), mkdirs() �Լ��� ����� �ڼ��� �˾ƺ��� ������ �ۼ�.
	
	
 
 */


public class FileExamTest1 {

	public static void main(String[] args) {
		
		File dir = new File("c:\\filetest");
		File dir2 = new File("c:\\filetest1\\step1\\code");
		File dir3 = new File("c:\\filetest1\\exam\\data.dat");
		
		System.out.println("������ �����Ǿ�����??");
		// directory ��ΰ� 1������, mkdirs() ���� �� �־�.
		
		System.out.println(dir.mkdirs());
		
		System.out.println(dir2.mkdirs());
		
		dir3.getParentFile().mkdirs();
		// getParentFile --> Directory���� ���鶧 ���, �̾Ƴ��ų�


	}

}

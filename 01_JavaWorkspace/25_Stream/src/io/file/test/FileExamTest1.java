package io.file.test;


import java.io.File;

/*
 *  파일 = 디렉토리정보 + 파일이름
	
	해당 클래스에서는 파일을 '다양한 방법'으로 생성.
	getParentFile() : Return Type : File, getParent() : Return Type String 
	  	 ||||
    mkdir(), mkdirs() 함수의 기능을 자세히 알아보는 로직을 작성.
	
	
 
 */


public class FileExamTest1 {

	public static void main(String[] args) {
		
		File dir = new File("c:\\filetest");
		File dir2 = new File("c:\\filetest1\\step1\\code");
		File dir3 = new File("c:\\filetest1\\exam\\data.dat");
		
		System.out.println("파일이 생성되었나요??");
		// directory 경로가 1개여도, mkdirs() 만들 수 있어.
		
		System.out.println(dir.mkdirs());
		
		System.out.println(dir2.mkdirs());
		
		dir3.getParentFile().mkdirs();
		// getParentFile --> Directory만을 만들때 사용, 뽑아내거나


	}

}

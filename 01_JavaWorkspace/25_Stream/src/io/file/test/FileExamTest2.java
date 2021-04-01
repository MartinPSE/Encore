package io.file.test;

import java.io.File;
import java.io.IOException;

import javax.imageio.stream.FileImageOutputStream;

public class FileExamTest2 {

	public static void main(String[] args) throws IOException { // separator OS에 맞는 구분자 알아서 생성
		String dirName = "c:"+File.separator+"dir2"+File.separator+"mydir";
		// c:\\dir2\\mydir
		File file1 = new File(dirName);
		file1.mkdirs();
		
		File file2= new File(dirName,"fileTest.dat");
	
		if (file2.createNewFile()) System.out.println("filetest Creationg OK!!");
		
			System.out.println("1. file2의 파일이름을 출력 :: "+file2.getName() );
			// getpath, getAbsolutePath --> 파일명도 디렉토리로 인식한다.
			System.out.println("2. file2의 파일경로을 출력 :: "+file2.getParentFile() );
			System.out.println("3. file2의 getParent() 결과 출력 :: "+file2.getParent());
			System.out.println("3. file2의 getParentFile() 결과 출력 :: "+file2.getParentFile());
			
		
		
		// 해당 프로그램이 종료될때 디렉토리 안에있는 파일이 삭제되는 기능을 찾아서 적용!
			file2.deleteOnExit();
	}

}

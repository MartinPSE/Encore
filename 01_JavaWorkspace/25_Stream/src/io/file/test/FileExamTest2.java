package io.file.test;

import java.io.File;
import java.io.IOException;

import javax.imageio.stream.FileImageOutputStream;

public class FileExamTest2 {

	public static void main(String[] args) throws IOException { // separator OS�� �´� ������ �˾Ƽ� ����
		String dirName = "c:"+File.separator+"dir2"+File.separator+"mydir";
		// c:\\dir2\\mydir
		File file1 = new File(dirName);
		file1.mkdirs();
		
		File file2= new File(dirName,"fileTest.dat");
	
		if (file2.createNewFile()) System.out.println("filetest Creationg OK!!");
		
			System.out.println("1. file2�� �����̸��� ��� :: "+file2.getName() );
			// getpath, getAbsolutePath --> ���ϸ� ���丮�� �ν��Ѵ�.
			System.out.println("2. file2�� ���ϰ���� ��� :: "+file2.getParentFile() );
			System.out.println("3. file2�� getParent() ��� ��� :: "+file2.getParent());
			System.out.println("3. file2�� getParentFile() ��� ��� :: "+file2.getParentFile());
			
		
		
		// �ش� ���α׷��� ����ɶ� ���丮 �ȿ��ִ� ������ �����Ǵ� ����� ã�Ƽ� ����!
			file2.deleteOnExit();
	}

}

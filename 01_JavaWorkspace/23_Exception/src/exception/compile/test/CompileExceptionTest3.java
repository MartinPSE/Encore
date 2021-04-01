package exception.compile.test;

import java.io.FileNotFoundException;

// 1. try~ catch 2. throws !


import java.io.FileReader;

class FileReading4 {
	public void readFile (String filename) throws FileNotFoundException { // 실행파일로 던지고!!
		
		
			FileReader fr = new FileReader(filename);
			System.out.println("1......new FileReader().. filename");
		
		System.out.println("2....FileReader Creating...");
	}
}


public class CompileExceptionTest3 {

	public static void main(String[] args)  { // 다시 또 JVM 으로 던지자!!
		FileReading4 f = new FileReading4();
		String path = "C:\\encore_ohs\\util\\poem.txt";
		
		
			try {
				f.readFile(path);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		System.out.println("3.. 파일을 잘 읽어들였습니다.");
		

	}

}

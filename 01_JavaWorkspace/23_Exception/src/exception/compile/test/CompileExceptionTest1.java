package exception.compile.test;

import java.io.FileReader;

class FileReading {
	public void readFile (String filename) {
		
		try{
			FileReader fr = new FileReader(filename);
			System.out.println("1......new FileReader().. filename");
		} catch (Exception e) {
			// System.out.println("Nice Catch!!"); ---> ****(1) ****
			// 1. catch 문을 비워두거나
			// 2. Exception 의 getMessage, printStackTrace
			//			e.printStackTrace(); ---> 요샌 잘 안쓴다. // 개발시에는 쓰자!! 배포할때만 없애고!
			//			System.out.println(e.getMessage()); //---> **** (2) ****
		}
		System.out.println("2....FileReader Creating...");
	}
}


public class CompileExceptionTest1 {

	public static void main(String[] args) {
		FileReading f = new FileReading();
		String path = "C:\\encore_ohs\\util\\poem.txt";
		f.readFile(path);
		System.out.println("3.. 파일을 잘 읽어들였습니다.");
		

	}

}

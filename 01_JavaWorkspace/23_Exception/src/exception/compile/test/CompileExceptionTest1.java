package exception.compile.test;

import java.io.FileReader;

class FileReading {
	public void readFile (String filename) {
		
		try{
			FileReader fr = new FileReader(filename);
			System.out.println("1......new FileReader().. filename");
		} catch (Exception e) {
			// System.out.println("Nice Catch!!"); ---> ****(1) ****
			// 1. catch ���� ����ΰų�
			// 2. Exception �� getMessage, printStackTrace
			//			e.printStackTrace(); ---> ��� �� �Ⱦ���. // ���߽ÿ��� ����!! �����Ҷ��� ���ְ�!
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
		System.out.println("3.. ������ �� �о�鿴���ϴ�.");
		

	}

}

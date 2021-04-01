package stream.data.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



public class DataOutputStreamTest4 {

	public static void main(String[] args) throws IOException {
											
		
		DataInputStream dis = new DataInputStream(new FileInputStream("src\\scores.dat"));
		
		int data = 0;
		
		try { 
			while((data = dis.readInt()) != -1) { // BinaryData¿¡ ³¡Àº -1
				System.out.println(data);
				
			}
			
		} catch (EOFException e) {
			
		}
		
		finally {
			dis.close();
		}
		

	}

}

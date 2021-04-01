package chatting.step2.client;

/*
 *  Ű����� Data�� �о���� �� ---> ������ ������.
 *  
 *  �ٽ� ������ ���� �޼����� �о Client �ڽ��� �ܼ�â�� �޼����� ���.
 *  
 *  ::
 *  	(Client������ ��û ) |  ( Server���� �� ������ �а� )
 *  �Է� - 	2 						+ 2
 *  ��� - 	1 						+ X
 *  
 * 
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class ChatClient2 {
	// �ʵ弱��
	Socket s;
	BufferedReader br, br1;
	PrintWriter pw;
	
	
	// Stream!
	public void net () {
		
		try {
			s = new Socket("127.0.0.1",3024);
			System.out.println("Socket Creating....");
			// Client ��ü
			br = new BufferedReader(new InputStreamReader(System.in));
			pw = new PrintWriter(s.getOutputStream(), true);
			// Server �� ������ �Է¹ޱ�!
			br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			System.out.println("Stream Creating....");
			while(true) {
				String line = br.readLine(); // Ű����� �Է� ���� Data --> 
				pw.println(line); // -> Server �� ������.
				
				////// Blocking ////// ������������� ��ٸ���!
				
				String serverMessage = br1.readLine();
				System.out.println("������ ���� �޼��� : " + serverMessage);
				
				
			}
			
			
			
			
		}catch (Exception e) {
			System.out.println("�������� ������ ���������ϴ�.");
			
			
		}finally {
			try {
				br.close();
				pw.close();
				br1.close();
			}catch( IOException e) {
				
			}
			
		}
		
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		ChatClient2 clientserver = new ChatClient2();
		clientserver.net();

	}

}

package chatting.step3.client;

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


public class ChatClient3 {
	// �ʵ弱��
	Socket s;
	BufferedReader br;
	PrintWriter pw;
	
	
	// Stream!
	public void net () {
		
		try {
			s = new Socket("127.0.0.1",60000);
			System.out.println("Socket Creating....");
			// Client ��ü
			br = new BufferedReader(new InputStreamReader(System.in));
			pw = new PrintWriter(s.getOutputStream(), true);
			// Server �� ������ �Է¹ޱ�!
			// br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
			/////////////////////////////////////////////////////////////////////////
			
			// ������ ���� �޼����� �о���̴� �۾��� �����ϴ� �����带 ����.
			
			clientThread ct = new clientThread(s);
			ct.start();
			
			System.out.println("Stream Creating....");
			while(true) {
				String line = br.readLine(); // Ű����� �Է� ���� Data --> 
				pw.println(line); // -> Server �� ������.
				
//				////// Blocking ////// ������������� ��ٸ���!
//				
//				String serverMessage = br1.readLine();
//				System.out.println("������ ���� �޼��� : " + serverMessage);
//				
			}

		}catch (Exception e) {
			System.out.println("�������� ������ ���������ϴ�.");
		}finally {
			try {
				br.close();
				pw.close();
			}catch( IOException e) {
				
			}
			
		}

	}
	
	public static void main(String[] args) {
		
		ChatClient3 clientserver = new ChatClient3();
		clientserver.net();

	}

}



class clientThread extends Thread {
	Socket s;
	BufferedReader br1;
	
	clientThread (Socket s) {
		this.s = s;
		
	}
	
	public void run ( ) {
		try {
			br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
			while (true) {
				String str = br1.readLine();
				System.out.println("���� �޼��� : " + str);
			}
			
		}catch ( Exception e) {
			
		}
	}
	
}

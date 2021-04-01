package chatting.step2.server;


import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/*
 * Ŭ���̾�Ʈ�� ���� �޼��� �޾Ƽ�
 * �ٽ� �� �޼����� Ŭ���̾�Ʈ���� ������.
 *  
 *  ::
 *  
 *  �Է� - - - br(s)  
 *  ��� - - - pw(s)  
 *  
 */

import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer2 {
	// �ʵ弱��
	ServerSocket server;
	Socket s;
	BufferedReader br;
	PrintWriter pw;
	
	// Stream!
	public void net () {
		
		try {
			server = new ServerSocket(3024);
			System.out.println("<< Server Ready >>");
			Toolkit tool = Toolkit.getDefaultToolkit();
			tool.beep();
			
			s = server.accept(); // Client Socket ��ȯ.
			System.out.println(s.getInetAddress()+"(��)�� �����ϼ̽��ϴ�");
			
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(s.getOutputStream(), true);
			System.out.println("<< Stream Creating >>");
			
			String line = "";
			while ( (line = br.readLine()) != null ) pw.println(line);
			
			
		}
		
		
		catch(Exception e) {
			System.out.println("Client���� ������ ���������ϴ�.");
			
		}finally {
			try {
				br.close();
				pw.close();
			}catch ( IOException e) {
				
			}
		}
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		ChatServer2 chatserver = new ChatServer2();
		chatserver.net();

	}

}

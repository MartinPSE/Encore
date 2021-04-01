package chatting.step3.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/*
 *  �������� Client�� ������ �޾Ƽ�
 *   ���ڱ���� �޼����� �ְ����� �� �ִ� Server�� ������ �ۼ�.
 *   
 *   ::
 *   
 *   Chatserver - - - - - Process
 *   	<Field>
 *   	 1. ServerSocket
 *   	 2. ArrayList<Thread> 
 *   	 3. Socket
 *   	<Method> 
 *       1. broadcast() --> Message �Ѹ���!!   
 *   	
 *   
 *   ChatThread = = = = = Thread
    	<Field>
    	 1. Socket
    	 2. BufferedReader
    	 3. PrintWriter
 *   
 * 
 */


public class ChatServer3 {
	// Process �� �ʵ� ����
	ServerSocket server;
	Socket s;
	ArrayList<ChatThread> list; // Process ������ ���� �������°� ���� ����.
	
	// �⺻������ ������ְ�
	public ChatServer3() {
		list = new ArrayList<ChatThread>(); // *�ʼ�* �⺻!
		
	}
	public void broadcast(String message) {
		for (ChatThread t : list) {
			t.sendMessage(message); // process �������� �۵����ϰ�.
			
		}
		
	}
	
	public void net() {
		try{
			
			server = new ServerSocket(60000);
			System.out.println("<< Server Creating >> ");
			
			// client�� �ö����� �۵��ؾ� �Ѵ�.
			while (true) { // ��� �׳� �۵��ϴ� ��. (��, server)
				s = server.accept(); 
				// socket �� Thread�� ����������!!
				ChatThread ct = new ChatThread(s, this); // Thread�� Process�� ��������!!
				
				// list�� �ű� client�� �߰��� �����
				list.add(ct);
				
				// �۾��� ���������� ����Ǵ� Focus!!
				ct.start(); 	
			}
			
		}catch(Exception e) {
			
		}finally {
			
		}
		
	}
		

	public static void main(String[] args) {
		ChatServer3 chatserver = new ChatServer3();
		chatserver.net();

	}

}

// Thread Mechanism �ٽ� �ѹ� Remind!! 
// 	Server�� ����� Client�� �޼����� �ְ��޴� �ϸ� �����ϴ� ������ ---> '�۾�������'

class ChatThread extends Thread{
	
	Socket s;
	BufferedReader br;
	PrintWriter pw;
	ChatServer3 chatServer3; // Thread���� Process�� Method�� ������ �׳� �뤊�� �����´�.
	
	
	ChatThread (Socket s, ChatServer3 chatServer3) {
		this.s = s;
		this.chatServer3 = chatServer3;
		
		System.out.println(s.getInetAddress()+"(��)�� �����ϼ̽��ϴ�.");
		chatServer3.broadcast(s.getInetAddress()+"(��)�� ä�ù濡 �����̽��ϴ�.");
		
	
		
	}
	
	// Message �о��!
	
	public void sendMessage(String str) {
		pw.println(str);
	}
	

	public void run() {
		// ������ �����尡 �۾��ϴ� ����!
		try {
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(s.getOutputStream(),true);
			
			while ( true ) {
				String line = br.readLine();
				
				// ArrayList�� �ִ� ��� Thread�� �ѷ�����.
				chatServer3.broadcast(line);
				
			}
			
		}catch (IOException e) {
			// ������ �������� logic�� �̰����� �̵�
			System.out.println(s.getInetAddress()+"(��)�� ������ ���������ϴ�.");
			chatServer3.broadcast(s.getInetAddress() +"(��)�� ä�ù��� �����̽��ϴ�");
			
			// Process�� ���ŵǾ�����. 
			chatServer3.list.remove(this);
			
		}
		
	}
	
}
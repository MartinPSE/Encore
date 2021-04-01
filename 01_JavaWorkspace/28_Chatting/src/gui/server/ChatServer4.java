package gui.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/*
 *  여러명의 Client의 접속을 받아서
 *   문자기반의 메세지를 주고받을 수 있는 Server측 로직을 작성.
 *   
 *   ::
 *   
 *   Chatserver - - - - - Process
 *   	<Field>
 *   	 1. ServerSocket
 *   	 2. ArrayList<Thread> 
 *   	 3. Socket
 *   	<Method> 
 *       1. broadcast() --> Message 뿌리기!!   
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


public class ChatServer4 {
	// Process 의 필드 지정
	ServerSocket server;
	Socket s;
	ArrayList<ChatThread> list; // Process 생성시 같이 만들어놓는게 제일 좋아.
	
	// 기본생성자 만들어주고
	public ChatServer4() {
		list = new ArrayList<ChatThread>(); // *필수* 기본!
		
	}
	public void broadcast(String message) {
		for (ChatThread t : list) {
			t.sendMessage(message); // process 까지가서 작동안하게.
			
		}
		
	}
	
	
	public void net() {
		try{
			
			server = new ServerSocket(60000);
			System.out.println("<< Server Creating >> ");
			
			// client가 올때까지 작동해야 한다.
			while (true) { // 계속 그냥 작동하는 중. (즉, server)
				s = server.accept(); 
				// socket 을 Thread가 가져가야해!!
				ChatThread ct = new ChatThread(s, this); // Thread가 Process를 가져야해!!
				
				// list에 신규 client를 추가해 줘야해
				list.add(ct);
				
				// 작업이 병렬적으로 진행되는 Focus!!
				ct.start(); 	
			}
			
		}catch(Exception e) {
			
		}finally {
			
		}
		
	}
		

	public static void main(String[] args) {
		ChatServer4 chatserver = new ChatServer4();
		chatserver.net();

	}

}

// Thread Mechanism 다시 한번 Remind!! 
// 	Server와 연결된 Client와 메세지를 주고받는 일만 전담하는 쓰레드 ---> '작업쓰레드'

class ChatThread extends Thread{
	
	Socket s;
	BufferedReader br;
	PrintWriter pw;
	ChatServer4 chatServer4; // Thread에서 Process에 Method를 쓰려면 그냥 통쨰로 가져온다.
	
	
	ChatThread (Socket s, ChatServer4 chatServer4) {
		this.s = s;
		this.chatServer4 = chatServer4;
		
		System.out.println(s.getInetAddress()+"(님)이 접속하셨습니다.");
		chatServer4.broadcast(s.getInetAddress()+"(님)이 채팅방에 들어오셨습니다.");		
	
		
	}
	
	// Message 읽어보자!
	
	public void sendMessage(String str) {
		pw.println(str);
	}
	

	public void run() {
		// 실제로 쓰레드가 작업하는 내용!
		try {
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(s.getOutputStream(),true);
			
			while ( true ) {
				String line = br.readLine();
				
				// ArrayList에 있는 모든 Thread에 뿌려야해.
				chatServer4.broadcast(line);
				
			}
			
		}catch (IOException e) {
			// 연결이 끊어지면 logic이 이곳으로 이동
			System.out.println(s.getInetAddress()+"(님)이 연결이 끊어졌습니다.");
			chatServer4.broadcast(s.getInetAddress() +"(님)이 채팅방을 나가셨습니다");
			
			// Process가 제거되어진다.
			chatServer4.list.remove(this);
			
		}
		
	}
	
}

package chatting.step1.server;

import java.awt.BufferCapabilities;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/*
 *  Socket 통신에서 서버측 로직을 담고 있는 프로세스
 *  Client의 접속을 받아들이기 위해서
 *  	1. ServcerSocket을 생성
 *  	2. accept()를 통해서 서버로 접속해오는 Client를 받아서 ClientSocket을 리턴한다.
 *  
 *  Client가 보낸 메세지를 읽어서 --> Server 자신의 코솔창에 출력.
 		* 입력스트림 - - - - 소켓으로부터 받아서 만든다.
 *  
 * 
 */

public class ChatServer {
	ServerSocket server;
	Socket s;
	BufferedReader br;
	
	
	public void net() {
		try {
			server = new ServerSocket(5500);
			System.out.println("<<Server Ready>>");
			
			s = server.accept(); // client를 받아들이는 method
			System.out.println("Client's Socket, Returned : "+s);
			
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			System.out.println("Stream Creating, Using Socket");
			
			String line = null;
			while((line = br.readLine()) != null) {
				System.out.println("Client가 보낸 메세지 : "+line);
			}

			
			
		} catch (IOException e) {
			System.out.println("서버와의 연결이 끊어졌습니다.");
		}
		
	}
	
	

	public static void main(String[] args) {
		ChatServer chatserver = new ChatServer();
		chatserver.net();
		
		

	}

}

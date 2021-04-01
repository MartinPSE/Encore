package chatting.step2.client;

/*
 *  키보드로 Data를 읽어들인 후 ---> 서버로 보낸다.
 *  
 *  다시 서버가 보낸 메세지를 읽어서 Client 자신의 콘솔창에 메세지를 출력.
 *  
 *  ::
 *  	(Client내에서 요청 ) |  ( Server에서 온 응답을 읽고 )
 *  입력 - 	2 						+ 2
 *  출력 - 	1 						+ X
 *  
 * 
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class ChatClient2 {
	// 필드선언
	Socket s;
	BufferedReader br, br1;
	PrintWriter pw;
	
	
	// Stream!
	public void net () {
		
		try {
			s = new Socket("127.0.0.1",3024);
			System.out.println("Socket Creating....");
			// Client 자체
			br = new BufferedReader(new InputStreamReader(System.in));
			pw = new PrintWriter(s.getOutputStream(), true);
			// Server 가 보낸거 입력받기!
			br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			System.out.println("Stream Creating....");
			while(true) {
				String line = br.readLine(); // 키보드로 입력 받은 Data --> 
				pw.println(line); // -> Server 로 보낸다.
				
				////// Blocking ////// 응답받을때까지 기다리고!
				
				String serverMessage = br1.readLine();
				System.out.println("서버가 보낸 메세지 : " + serverMessage);
				
				
			}
			
			
			
			
		}catch (Exception e) {
			System.out.println("서버와의 연결이 끊어졌습니다.");
			
			
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

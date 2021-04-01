package chatting.step1.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 
 *  Socket 통신에서 Client측 로직을 담고 있는 프로세스
 *  
 *  Socket을 생성해서 요청을 하고자하는 Server 측으로 연결을 시도!
 	이때, Server측이 가지고 있는 port와 동일한 port를 이용해야 연결이 될 수 있다.
 	
 	::
 	* Stream 코드
 	키보드로 읽어들인 Data를 --> Server로 보내보자!
 	
 * 
 */

public class ChatClient {
	
	Socket s;
	BufferedReader br; // 자체적으로 생성.
	PrintWriter pw; // 소켓으로 Return 받아서 생성.
	
	public void net() {
		try {
			s = new Socket("127.0.0.1", 5500);
			System.out.println("Socket Creating ...");
			
			br = new BufferedReader(new InputStreamReader(System.in)); // 자체적으로 입력은 client 서버에서.
			pw = new PrintWriter(s.getOutputStream(), true); // Socket으로 Return 받아서 --> 서버로 보내자
			System.out.println("Stream Creating...");
			
			String line = "";
			while((line = br.readLine())!= null) {
				pw.println(line);
			}
			
			
		} catch (UnknownHostException e) {
		} catch (IOException e) {
		}
	}

	public static void main(String[] args) {
		ChatClient chatclient = new ChatClient();
		chatclient.net();

	}

}

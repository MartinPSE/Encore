package chatting.step1.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 
 *  Socket ��ſ��� Client�� ������ ��� �ִ� ���μ���
 *  
 *  Socket�� �����ؼ� ��û�� �ϰ����ϴ� Server ������ ������ �õ�!
 	�̶�, Server���� ������ �ִ� port�� ������ port�� �̿��ؾ� ������ �� �� �ִ�.
 	
 	::
 	* Stream �ڵ�
 	Ű����� �о���� Data�� --> Server�� ��������!
 	
 * 
 */

public class ChatClient {
	
	Socket s;
	BufferedReader br; // ��ü������ ����.
	PrintWriter pw; // �������� Return �޾Ƽ� ����.
	
	public void net() {
		try {
			s = new Socket("127.0.0.1", 5500);
			System.out.println("Socket Creating ...");
			
			br = new BufferedReader(new InputStreamReader(System.in)); // ��ü������ �Է��� client ��������.
			pw = new PrintWriter(s.getOutputStream(), true); // Socket���� Return �޾Ƽ� --> ������ ������
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

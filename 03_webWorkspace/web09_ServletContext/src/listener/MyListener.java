package listener;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
/*
 *  WAS에 의해서 호출되는 모든 라이프 사이클 Method 정리
   
 	Global
 *  -----------------------------------------------
 *  1. contextInitialized 가 ( ServletContext 듣기 위해 ) 생성
 
 	----------------- Ready On --------------------
 *  2. ( 서블릿 생성자 호출 )
 *  3. init()
 	------------------ Repeat ---------------------
 *  4. service() -- > doGet() | doPost()
 	----------------- The End ---------------------
    5. destory()
 *  6. contextDestroyed()
 *  
 *  
 *  
 */

@WebListener
public class MyListener implements ServletContextListener {
	
	private ServletContext cont;
	
	public void contextInitialized(ServletContextEvent sce)  {
		
		System.out.println("contextInitialized.... 뚜뚜뚜");
		
		
		// 1. ServletContext리턴 받음.. 이때 ServletContextEvent로 부터 받는다.
		cont = sce.getServletContext();
		
		// 2. DD파일의 경로를 읽어들인다.
		String filename = cont.getInitParameter("path");
		System.out.println("User File Path : "+filename);
		
		//3. getResourceAsStream()..
		InputStream is = null;
		BufferedReader br = null;
		
		
		try {
			System.out.println("getResourceAsStream");
			is = cont.getResourceAsStream(filename);
			
			System.out.println("BufferedReader 생성...");
			br = new BufferedReader(new InputStreamReader(is));
			
			String line = null;
			System.out.println("내용을 읽어드립니다...");
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		}catch ( Exception e ) {
			System.out.println(" 파일을 읽어들이는데 실패했습니다. ");
			
		}
		
		
		
		
	}

    public void contextDestroyed(ServletContextEvent arg0)  { 
    	System.out.println("contextDestroyed....");
    	
    }
	
}

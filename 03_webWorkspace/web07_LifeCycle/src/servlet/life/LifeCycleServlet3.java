package servlet.life;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*
 * 
 *  < Client의 요청을 처리한 결과 >
 *  즉 필드에 지정된 COUNT값을 Servlet 이 출력하지 않고
 *  정보를 JSP 에 넘기고
 *  결과페이지 처리를 JSP가 하도록 로직을 수정.
 *  
 *  이때 !
 *  페이지 연결방법을 사용해야 하나 ( Navigator )
 *  단순하게 우리가 이미 알고 있는 방법인 a태그(hreft 속성에 jsp 페이지를 연결) 를 이용! 
 *  
 * 
 */

// loadOnStartup --> 요청전에 ReadyOn 상태를 만들어 놓는다.

@WebServlet(urlPatterns = {"/LIFE3"}, loadOnStartup = 1)
public class LifeCycleServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int count = 0; // field 하나 추가.
	private String path = "C:\\encore_ohs\\util\\web_util\\life\\count.txt";
	
	
  
    public LifeCycleServlet3() {
    	System.out.println("1. LifeCycleServlet1 생성자 호출... by Container ");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);

	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("3. service() --> doget() | dopost() 호출 .. by Container");
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		count++;
		 
		 out.println("<html><body bgcolor='yellow'>");
		 out.println("<h2 align ='center'> LifeCycle CallBack Method </h3>");
		 out.println("<b>count :: "+ ++count +"</b>"); out.println("</body></html>");
		 
		
		// String Query 즉 get 방식을 이용해야 한다. 
		
		out.close();
		
		
	}
	
	@Override
	public void init() throws ServletException {
		
    	System.out.println("2. init() method 호출... by Container ");
    	// 파일에 저장된 내용을 읽어들이는 로직은 Initialization 부분인 init 에서 해준다.
    	try {
    		BufferedReader br = new BufferedReader(new FileReader(path));
    		String str = br.readLine();
    		
    		count = Integer.parseInt(str);
    		
    		System.out.println("Count.txt의 값을 읽어서 필드 count에 다시 할당!! Update 성공!!");
    		
    	}catch ( Exception e) {
    		System.out.println("파일을 읽어들이는데 오류 발생!! ");
    	}
		
	}

	
	@Override
	public void destroy() {
		System.out.println("4. destroy() method 호출... by Container");
		// 인스턴스가 메모리에서 제거되기 전에 필드값을 영구적으로 보관 -> 파일에 저장
		// 출력용 스트림을 생성. 이곳에 필드값을 출력한다. 
		
		
		File f = new File(path);
		// 디렉토리가 현재 존재하지 않는다면, 디렉토리를 먼저 만들어 놓아야 그곳에 count.txt 파일이 생성된다.
		
		f.getParentFile().mkdirs();
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(f));
			pw.println(count);
			pw.close();
			
			System.out.println(path+" COUNT 값 :: " + count + " 파일에 값 영구적으로 저장됨!!");
			
		}catch ( Exception e) {
			System.out.println("출력용 스트림 생성 실패!!");
		}
		
	}
}

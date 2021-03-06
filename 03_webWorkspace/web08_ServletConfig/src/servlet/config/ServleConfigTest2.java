package servlet.config;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServleConfigTest1
 */

public class ServleConfigTest2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// 필드 추가
	private String path;
	private String custid;
	
       
   
    public ServleConfigTest2() {
    	System.out.println("생성자 호출... 인스턴스 이때 생성된다!! ");
    	
    	
    	
    }

	
    @Override
    public void init() throws ServletException {
    	System.out.println(" init() call .... ");
    	// 저장된 파일의 값을 읽어서, 필드에 할당.
    
    	
    	path = getInitParameter("path"); // dd파일에 있는 param-name에 등록되어 있는 이름을 넣어야한다. --> param-value 가 return 된다.
    
    	System.out.println("init().... configTest2");
    	
    	try {
    		BufferedReader br = new BufferedReader(new FileReader(path));
    		custid = br.readLine();
    		
    		System.out.println("VIP customer credit no : "+ custid);
    		
    		br.close();
    		
    		
    		
    	}catch ( Exception e) {
    		
    	}
    	
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		// 폼으로부터 받아온 값 읽어온다.. getParameter 사용!!
		String custname = request.getParameter("cust");
		
		out.println("<html><body bgcolor=yellow>");
		out.println("<h2 align='cetner'> A Servlet Configuration... Using ServletConfig</h2>");
		out.println("<h3>"+custname+" , "+ custid+"로 인증되었습니다. 서비스 진행 가능합니다./h3> " );
		
		out.println("</body></html>");
		out.close();
		
		
		
	}
	

}

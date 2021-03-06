package servlet.config;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServleConfigTest1
 */

public class ServleConfigTest1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// 필드 추가
	private String name, address;
	
       
   
    public ServleConfigTest1() {
    	System.out.println("생성자 호출... 인스턴스 이때 생성된다!! ");
    	
    	
    	
    }

	
    @Override
    public void init() throws ServletException {
    	System.out.println(" init() call .... ");
    	// servlet의 필드 초기화 (Initialization) --> 화면으로 부터 받아온 정보가 아닌
    	// 그 훨씬 이전에 Container에 keeping 되어있는 값을 가져온것이다.
    	
    	name = getInitParameter("custname"); // dd파일에 있는 param-name에 등록되어 있는 이름을 넣어야한다. --> param-value 가 return 된다.
    	address = getInitParameter("address");
    	System.out.println(name+", "+ address);
    	
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
		
		out.println("<html><body bgcolor=yellow>");
		out.println("<h2 align='cetner'> A Servlet Configuration... Using ServletConfig</h2>");
		out.println("Your name : " + name+"<br>");
		out.println("Your address : " + address+"<br>");
		
		out.println("</body></html>");
		out.close();
		
		
		
	}
	

}

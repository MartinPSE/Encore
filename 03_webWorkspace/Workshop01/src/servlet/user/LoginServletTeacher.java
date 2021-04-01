package servlet.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 *  xml로 만들어주면
 *  <servlet>
 *  	<servlet-name>LoginServletTeacher></servlet-name>
 *  	<servlet-class>servlet.user.LoginServletTeacher</servlet-class>
 *  </servlet>
 *  
 *  <servlet-mapping>
 *  	<servlet-name>LoginServletTeacher</servlet-name>
 *  	<url-pattern>/LoginServletTeacher</url-pattern>
 *  </servlet-mapping>
 * 
 * 
 *   즉, xml을 간편하게 만들어준게 --> Annotation 이다!
 */



@WebServlet("/LoginServletTeacher") // Annotation 
public class LoginServletTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
 

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	
		request.setCharacterEncoding("UTF-8");// method = "get" 이 여서 지금 적용이 안된다. -> 서버에 처리를 해야한다.
		response.setContentType("text/html;charset=utf-8");// 위치는 Printwriter 보다 먼저.
		// 2. 
		// 
		
		PrintWriter out = response.getWriter();
	
		// 1. encoding 설정 응답전에 해주기!
		String id = request.getParameter("id"); 
		String password = request.getParameter("password"); 
				
		out.println("<html><body>");
		out.println("<h3><b>"+id+"</b>"+"님 로그인되셨습니다!!"+"</h3>");
		out.println("<a href='#'>도서 등록</a><br>");
		out.println("<a href='#'>로그 아웃</a><br>");
		out.println("</body></html>");
		out.close();
		
		
		
	}

}

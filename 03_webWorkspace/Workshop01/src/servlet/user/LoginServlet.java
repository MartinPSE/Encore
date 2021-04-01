package servlet.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	request.setCharacterEncoding("UTF-8");// method = "get" 이 여서 지금 적용이 안된다. -> 서버에 처리를 해야한다.
	response.setContentType("text/html;charset=utf-8");// 위치는 Printwriter 보다 먼저.
		
		
	PrintWriter out = response.getWriter();
	
	String id = request.getParameter("id");
	String pass = request.getParameter("password");
	


	out.println("<html><body><h3>");
	out.println("<br>");
	out.println("<center>"+id+" login complete !!!</center></h3><br>");
	out.println("<br>");
	out.println("<p><center><a href = www.naver.com>"+"Register Book"+"</a></center></p>");
	out.println("<p><center><a href = www.naver.com>"+"Logout"+"</a></center></p>");
	out.println("</body></html>");
	out.close();
	
	
	
	
	
	
	}

}
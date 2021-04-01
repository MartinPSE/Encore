package servlet.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HttpFormServlet
 */
@WebServlet("/FormServlet")
public class HttpFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HttpFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 1. 클라이언트 Form 값을 받는다.
		String name = request.getParameter("name"); // String 으로 Form의 이름을 넣자.
		String addr = request.getParameter("address"); //
		
		// 2. 받은 값을 DB가서 잘 연결했다 ! 가정하고
		// 3. 다시 화면으로 (응답 == response ) 출력
		// name Hello!
		
		PrintWriter out =  response.getWriter();
		out.println("<html><body><h3>"); // 화면에 출력하기 위해선, html을 넣어줘야한다.
		out.println("Your Name Information...</h3><br>");
		out.println("<li> Your name is : "+name);
		out.println("</li></body></html>");
		out.close();
		
		
		
		
		
		
	}

}

package servlet.life;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycleServlet
 */
@WebServlet("/LIFE1")
public class LifeCycleServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int count = 0; // field 하나 추가.
	
	
  
    public LifeCycleServlet1() {
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
		// 요청이 클라이언트의 수랑 같을까 과연?
		out.println("<html><body bgcolor='yellow'>");
		out.println("<h2 align ='center'> LifeCycle CallBack Method </h3>");
		out.println("<b>count :: "+ ++count +"</b>");		
		out.println("</body></html>");
		out.close();
		
		
		
		
	}
	
	@Override
	public void init() throws ServletException {
		// 여기까지 Ready On 상태다.
    	System.out.println("2. init() method 호출... by Container "); 

		
	}

	
	@Override
	public void destroy() {
		System.out.println("4. destroy() method 호출... by Container");
		
	}
}

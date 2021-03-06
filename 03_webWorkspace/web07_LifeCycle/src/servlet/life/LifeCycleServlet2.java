package servlet.life;

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

@WebServlet(urlPatterns = {"/LIFE2"}, loadOnStartup = 1)
public class LifeCycleServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int count = 0; // field 하나 추가.
	
	
  
    public LifeCycleServlet2() {
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
		/*
		 * // 이 부분의 내용이 JSP에 들어가는 것이다.
		 *  
		 * out.println("<html><body bgcolor='yellow'>");
		 * out.println("<h2 align ='center'> LifeCycle CallBack Method </h3>");
		 * out.println("<b>count :: "+ ++count +"</b>"); out.println("</body></html>");
		 * 
		 */
		out.println("<a href = life2.jsp?cnt="+count+">여기를 클릭하시면 JSP페이지로 이동합니다.</a>"); // 응답은한다. 이 때 COUTN값을 가지고 JSP로 가려면?
		// String Query 즉 get 방식을 이용해야 한다. 
		
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

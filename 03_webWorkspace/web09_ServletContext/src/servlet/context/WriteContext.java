package servlet.context;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 *  1. 폼값 받는다. getParameter()
 *  2. 받은 값을 가지고 객체를 생성
 *  3.  Servletcontext를 반환받는다.. ServletConfig의 getServletContext() 
 *  	Servletcontext 에 Binding, Writing, 즉 Setter ---> SetAttribute()
 *  4. Binding된 정보를 다음 Servlet이 가져다 쓸 수 있도록 페이지 연결 ---> getAttribute(?)
 */




@WebServlet("/Writing")
public class WriteContext extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String, String> userList;
	private ServletContext cont;
	
	
	

	
	
	@Override
	public void init() throws ServletException {
		System.out.println("<<< init() call ( Writing ) >>>");
		userList = new HashMap<String, String>();
		cont = getServletContext(); // servletConfig가 상속해줬따.. 그냥 바로 사용 가능!
		
		System.out.println("Writing ServletContext... return...."+cont.getContextPath());
		System.out.println("Writing ServletContext... return...."+cont);
		
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
		
		String userId = request.getParameter("userId");
		String userPass = request.getParameter("userPass");
		String userName = request.getParameter("userName");
		
		// userList에 담는다.. ---> Map에선 put으로 담는다.
		userList.put("userId", userId);
		userList.put("userPass", userPass);
		userList.put("userName", userName);
		
		// 바인딩
		cont.setAttribute("userList", userList);
		
		
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body bgcolor='pink' >");
		out.println("<div align = center>");
		out.println("<b>====== Data Writing, Servlet Context ====== <br>");
		out.println("사용자의 정보가 등록되었습니다.</b><br>");
		
		// 다음 servlet 연결
		out.println("<a href ='Reading'> 접속자 명단보기 </a>");
		out.println("</div>");
		out.println("</body></html>");
		out.close();
		
	}

}

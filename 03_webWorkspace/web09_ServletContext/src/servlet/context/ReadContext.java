package servlet.context;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 *  1. servletcontext의 객체를 가져온다.
 *  2. getAttribute()를 사용해서 
 *  3. 출력.
 * 
 */



@WebServlet("/Reading")
public class ReadContext extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private HashMap<String, String> userList;
	private ServletContext cont;
	
	@Override
	public void init() throws ServletException {
		System.out.println("<<< init() call ( Reading )  >>>");
		cont = getServletContext(); // servletConfig가 상속해줬따.. 그냥 바로 사용 가능!
		System.out.println("Reading ServletContext... return...."+cont.getContextPath());
		System.out.println("Reading ServletContext... return...."+cont);
		
		userList = new HashMap<String, String>();
		
				
		
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
		out.println("<html><body>");
		
		userList = (HashMap<String, String>) cont.getAttribute("userList");
		
		out.println("<h2 align = center>다음은 Attribute안에 바인딩된 Data를 찾아온 결과입니다.</h2>");
		Set<String> set = userList.keySet();
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			String value =userList.get(key);
			out.println("<marquee bgcolor = 'yellow'>"+key+" : "+value+"<br></marquee>");
			

		}
		out.println("</body></html>");
		out.close();
		
		
		
			
		
	}

}

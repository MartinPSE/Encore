package servlet.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MFS")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public FormServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
		
	}
	protected void doProcess (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 로직은 여기서 작성!
		/*
		 * 
		 *  1. 한글처리... 양방향 모두 다.
		 *  2. PrintWriter 객체 Return 받고
		 *  3. 각각 폼의 값들을 다 받아온다.
		 *  4. 클라이언트의 브라우저로 받은 내용을 출력한다.
		 *  5. PrintWriter를 닫아주기.
		 */
		// 1. 한글처리
		request.setCharacterEncoding("UTF-8");// method = "get" 이 여서 지금 적용이 안된다. -> 서버에 처리를 해야한다.
		response.setContentType("text/html;charset=utf-8");// 위치는 Printwriter 보다 먼저.
		
		// 2. 
		PrintWriter out = response.getWriter();
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		// 다중 선택
		String[] menus = request.getParameterValues("menu");
		
		String gender = request.getParameter("gender");
		
		String intro = request.getParameter("intro");
		
		
		//3. 
		out.println("<html><body>");
		out.println("<h2> 폼에 입력된 값들을 출력 .. </h2>");
		out.println("<li> 당신의 아이디 : "+id+ "</li>");
		out.println("<li> 당신의 비밀번호 : "+password+ "</li>");
		
		out.println("<h4> 선택한 메뉴들 입니다 </h4>");
		String menu = "";
		for (int i = 0; i < menus.length ; i++) {
			menu += menus[i] + " ";
		}
		out.println(menu);
		
		out.println("<h4> 당신의 성별은 : "+gender+ "</h4>");
		
		out.println("<h3><center> 작성하신 방명록의 내용 입니다</center></h3>");
		out.println("<h4><strong>"+intro+"</strong></h4>");
		
		out.close();
		
		// 이런거 있으면 안된다. 결과페이지와 servlet은 상관없기 때문에.
		
				
	}
}

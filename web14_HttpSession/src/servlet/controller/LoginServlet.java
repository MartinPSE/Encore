package servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import servlet.model.MemberVO;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		// Client가 요청하는 순간 | Session이 만들어진다. 
		// 이 Session을 받아서 사용하자. 
		
		HttpSession session = request.getSession();
		
		// 클라이언트를 구분하는 값도 함께 생성.. JSESSIONID 값
		out.println("JSESSIONID :: " + session.getId() +"<br> LoginServlet");
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		// 위 값을 비지니스로 직에 넣어서 호출... MemberVO vo =  login(id, password); 
		MemberVO rvo = new MemberVO(id,password, "한소희", "여의도");
		out.println("<br>");
		
		session.setAttribute("vo", rvo);
		
		out.println("<a href=ProductServlet> ProductServlet 으로 이동.... 2번째 다시 요청하는 서블릿 </a>");
		
		
		
		
		
		
		
		
		
	}

}

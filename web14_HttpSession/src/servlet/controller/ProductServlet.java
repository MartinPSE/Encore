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

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;     
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		// 새롭게 만들어진 Session 이 아니라 , 기존 Session을 계속 사용한다.
		// 로그아웃하지 않는 이상 계속 사용한다 . (HttpSession 의 scope)
		HttpSession session = request.getSession();  
		if(session.getAttribute("vo") != null) { // 로그인이 되었다면, 즉 session값이 존재한다면!, client가 요청을 했다면!
			MemberVO vo = (MemberVO) session.getAttribute("vo");
			
			out.println("JSESSIONID :: " + session.getId()+"<br> ProductServlet"); // 앞페이지와 같은 JESSSION ID가 나올것이다
			out.println("VO :: " + vo);
			
			
			// 지금 로그인한 사용자가 상품을 구매 .. 상품정보(책)까지 다시 세션에 추가
			
			session.setAttribute("book", "Web개발에 대해서");
			out.println("<a href=CartServlet> CartServlet(장바구니) 으로 이동 ... 3번째 요청 하는 서블릿 </a>");
		} else { // 로그인 실패!
			out.println("<a href=login.html> 로그인 부터 다시 하세요 </a>");
			
		}
		
		
	}

}

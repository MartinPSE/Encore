package servlet.cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ACookieTest")
public class ACookieTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Cookie 는 get 방식입니다.
		Cookie c1 = new Cookie("now", "2021-04-05-15:38");
		Cookie c2 = new Cookie("id", "encore");
		
		// 쿠키의 유효시간을 설정해보자
		c1.setMaxAge(24*60*60); // 하루동안 쿠키 저장. Browser에 저장된다.
		c2.setMaxAge(0);
		
		
		response.addCookie(c1);
		response.addCookie(c2);
		
		response.sendRedirect("bCookieTest.jsp");
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}

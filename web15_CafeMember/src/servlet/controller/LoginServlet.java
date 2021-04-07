package servlet.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import servlet.model.MemberDAOImpl;
import servlet.model.MemberVO;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		try {
			MemberVO rvo = MemberDAOImpl.getInstance().login(id, password);
			
			// rvo를 session에 저장
			HttpSession session = request.getSession();
			if ( rvo != null ) {
				session.setAttribute("vo",rvo);
				System.out.println(" JSESSIONID :: " + session.getId());
				
				request.getRequestDispatcher("login_result.jsp").forward(request, response);
				
				
			}
			
		}catch ( Exception e ) {
			
		}
			
		
	}
		
			
	
}


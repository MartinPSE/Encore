package servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.ast.ArrayAllocationExpression;

import servlet.model.Member;


@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Member members;
	private ServletContext cont;
       
    
    public RegisterServlet() {
  
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
		
		/*
		 *  1. 폼값 받아서 
		 *  2. 받은 값으로 VO 객체 생성
		 *  3. ServletContext 리턴 받아서 VO 객체를 바인딩
		 *  4. 페이지 이동... 안배웠으니까 <a> 태그 이용해서 result.jsp로 이동하자!
		 */
		// 1.
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String age = request.getParameter("age");
		
		// 2. VO 객체 생성
		members = new Member(name, address, Integer.parseInt(age));
		
		//3. Binding
		
		cont = getServletContext();
		cont.setAttribute("members", members);
		
		// 4. Page 이동
		out.println("<html><body>");
		out.println("<a href=result.jsp> 결과를 확인하러 가자. </a>");
				
		out.println("</body></html>");
		out.close();
		
		
		
		
	}
}
	

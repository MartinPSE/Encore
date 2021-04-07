package servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.model.MemberVO;

@WebServlet("/SMS")
public class SearchMemberServlet extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
	MemberVO vo;
	
       
    
    public SearchMemberServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
		
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
				
		/*
		 *  1. 폼값 받아서
		 *  2. DAO 리턴 받고
		 *  3. 비지니스 로직 호출한 결과로 VO객체 Return 받고
		 *  4. Return 받은 값을 Attribute에 바인딩 한다. --> ServeletRequest 를 사용한다.
		 *  5. 네비게이션 ----> 서버내에 있는 jsp로 바로 이동한다.
		 *  
		 */ 
		// 1.
		String id = request.getParameter("id");
		
		// 2. DAO Return 받고

		
		// 3. VO 객체로 리턴 받고
		
		//4. Binding ! ( Request를 이용해서 바인딩 한다 )
		
		request.setAttribute("id", id);
		
		// 서버내에서 페이지로 이동. 
		// forward(servletRequest, servletResponse)
		// 
		//	request.getRequestDispatcher("result_view.jsp").forward(request, response);
		request.getRequestDispatcher("includetest1.jsp").include(request, response);
		
		//  Servlet은 응답과 관련없고, 무조건 자바코드로만 구성해야해.
		
			out.println("<h2>이 부분 보일까요?</h2>");	
			out.close();
	}
}
/*
 *  RequestDispatcher 가 가지고 있는 forward(), include() 방식의 페이지 이동방법.
    1. forward 방식 *
 		- forward 하려는 페이지로 현재 Servlet의 모든 권한을 (req,res) 가지고 서버내에 있는 다른 page로 이동
 		  제어권이 완전히 이동하는 페이지로 가버리기 때문에, 다시 이전 Servlet으로 돌아오질 않아.
 		  따라서 서블릿에서 응답 관련된 객체 PrintWriter를 사용할 일이 없다. 철저하게 로직 중심으로 작성
 		  
 		  결과 페이지의 URL주소를 보면, 결과페이지인 .jsp 주소가 아니라 이전 서블릿의 주소로 출력되어 진다.
 		  모든 권한 (req, res)을 가지고 이동했기 때문에 Servlet 이름으로 주소가 명시되어 진다.
 		  
 	2. include 방식
 		- 만약에 Servlet의 PrintWriter 객체를 이용하려 한다면 include 방식으로 페이지 이동할 수 있다.
 		  include에 담겨져 있는 모든 내용을 가지고 서블릿에 포함되어 짐으로 including을 한 다음에는 
 		  다시 Servlet 이후 과정을 마무리 짓고, Servlet이 직접 응답할 수 있다.
 		  
 		  하지만 이렇게 사용되는 부분은 거의 없고 위 '1번(forwarding)'이 훨씬 더 많이 사용된다.
 		  
 
  
 * 
 * 
 */





package servlet.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import servlet.model.MemberDAOImpl;
import servlet.model.MemberVO;


@WebServlet(urlPatterns = "/front.do", loadOnStartup = 1)
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

  
     
    public DispatcherServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 가장먼저 해야하는 일은 Client로부터 어떤 요청이 들어오는지를 알아야 한다. Command 값 !
		String command = request.getParameter("command");
		String path = "index.html";
		
		if(command.equals("register")) { // 회원가입
			// <X> RegisterServlet의 doProcess() 안에 있는 코드를 직접 여기에 작성
			
			// <O> method로 하나 뽑아내서 그 메소드 안에서 RegisterSerlvet의 doProcess()안에 있는 코드를 작성하자!!
			path = register(request, response);
		}else if (command.equals("find")) { // id로 회원검색
			path = find(request, response);
		}
		else if (command.equals("login")) { // Login
			path = find(request, response);
		}
		else if (command.equals("allmember")) { // 전체 회원수 목록 보여주기
			path = allmember(request, response);
		}
		
		// Method가 if문이 걸리고 나오는 공간
		
		request.getRequestDispatcher(path).forward(request, response);

		
	} // doProcess
	
	protected String register(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Allmember --> register_result.jsp
		// 1. form 값 받고
				String id = request.getParameter("id");
				String password = request.getParameter("password");
				String name = request.getParameter("name");
				String address = request.getParameter("address");
				String path = "register_error.jsp";
				
				//2. VO를 만들자.
				MemberVO pvo = new MemberVO(id, password, name, address);
				
				
				// 3. DAO 이용, 4. 비지니스 로직 호출 
				try {
					// 5. Return 값이 없음 --> Binding 할 필요 없음.
					MemberDAOImpl.getInstance().registerMember(pvo);
					path = "register_result.jsp";
					// 6. Page이동 하자. ( forward )
					
					
				}catch ( SQLException e) {
					
					
				}
		return path;
	}

	protected String find(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String path = "find_fail.jsp";
		
		try {
			
			MemberVO rvo = MemberDAOImpl.getInstance().findByIdMember(id);
			
			if ( rvo != null ) { // 찾는 id가 있을때만 
				request.setAttribute("vo", rvo);
				path = "find_ok.jsp";
			}
		} catch ( SQLException e ) {
			
				}
		
		// 다 돌고나서 page 이동해주자
		
		return path;
	}
		

	
	protected String login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String path = "error.jsp";
		
		try {
			MemberVO rvo = MemberDAOImpl.getInstance().login(id, password);
			
			// rvo를 session에 저장
			HttpSession session = request.getSession();
			if ( rvo != null ) {
				session.setAttribute("vo",rvo);
				System.out.println(" JSESSIONID :: " + session.getId());
				path = "login_result.jsp";
				
				
			}
			
		}catch ( Exception e ) {
			
		}
		return path;
	}
	
	protected String allmember(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = "";
		try {
			ArrayList<MemberVO> list =MemberDAOImpl.getInstance().showAllMember();
			request.setAttribute("list", list);
			path = "allView.jsp";
			
			
			
		}catch ( Exception e ) {
			
		}
		return path;
	}

		
}


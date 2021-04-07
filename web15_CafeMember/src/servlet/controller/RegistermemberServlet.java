package servlet.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.model.MemberDAOImpl;
import servlet.model.MemberVO;

@WebServlet("/RGS")
public class RegistermemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 로직을 여기서 작성
		/*
		 *  -----------------------------------------------
		   	1. 폼값 받아서  									---> Front와 손 잡고
		   	2. PVO(객체) 생성
		   	3. DAO --> Return 받아서
		   	4. 비지니스 로직 호출	   								---> Back 과 손잡고
		   	5. 결과값이 있으면 --> Binding(Attribute 잘 선택해서! )
		   	6. 페이지 이동.(Navigation)  						--- > View 랑도 손잡고
		 *  ------------- Controller 의 역활 ---------------- 
		 * 
		 */
		// 1. form 값 받고
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		
		//2. VO를 만들자.
		MemberVO pvo = new MemberVO(id, password, name, address);
		
		
		// 3. DAO 이용, 4. 비지니스 로직 호출 
		try {
			// 5. Return 값이 없음 --> Binding 할 필요 없음.
			MemberDAOImpl.getInstance().registerMember(pvo);
			
			// 6. Page이동 하자. ( forward // redirect )
			//	request.getRequestDispatcher("AllMember").forward(request, response);
			
			response.sendRedirect("AllMember?name="+name); // redirect 방식으로 페이지 이동 --> 방금 가입한 사람의 이름을 get방식으로 전달.
			
		}catch ( SQLException e) {
			
		}
		
		
	}

}

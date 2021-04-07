package servlet.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.model.MemberDAOImpl;
import servlet.model.MemberVO;

// Interface 상속 받는 JavaClass --> Component 

public class FindController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
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

}

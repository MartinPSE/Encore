package servlet.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.model.MemberDAOImpl;
import servlet.model.MemberVO;

@WebServlet("/AllMember")
public class AllMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 *  폼값 --> 없음
		 *  DAO 리턴 받아서 --> 비지니스 로직 호출 
		 *  결과값 바인딩 
		 *  네비게이션 ( 페이지 이동) 
		 *  
		 *  
		 */
		try {
			ArrayList<MemberVO> lists =MemberDAOImpl.getInstance().showAllMember();
			request.setAttribute("lists", lists);
			
			request.getRequestDispatcher("allView.jsp").forward(request, response);
			
			
			
		}catch ( Exception e ) {
			
		}
		
			
		} 
		
		
	}



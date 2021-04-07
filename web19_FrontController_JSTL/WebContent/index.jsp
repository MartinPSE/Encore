<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>www.book_encore.com</title>
<style type="text/css">
	#wrap{
		text-align: center;
		border: 2px dotted green;
	}

</style>
</head>
<body>
<h1> CafeMember :: FrontControllerPattern + EL, JSTL </h1>
<%--
	JSTL -- choose 
				when
					otheriwse
	
	index 페이지 에서는 클라이언트가 6가지의 서비스를 요청 할 수 있다.
	이때 인증과 권한에 따라서 요청할 수 있는 서비스가 달라져야 한다.
	
	인증(Authentication)
	
	회원 검색 하기 ( 권한 상관없이 다 할 수 있는 )
	
	로그인 한 사용자 - 권한(Authorization)
				   로그아웃 | 전체회원 명단보기 | 정보수정  
	
	
	로그인 안한 사용자 - 권한(Authorization)
					회원가입 | 로그인
	
	 
	
 --%>


<div id="wrap">
	<li><a href="find.jsp">회원 검색 하기</a><p>
	<c:choose>
		<c:when test="${!empty vo}">
			<li><a href="front.do?command=allmember">전체회원 명단보기</a><p>
			<li><a href="update.jsp">회원 정보 수정</a><p>
			<li><a href="front.do?command=logout">로그아웃</a><p>
		
		</c:when>
		
		<c:otherwise>
			<li><a href="register.jsp">회원 가입 하기</a><p>
			<li><a href="login.jsp">로그인 하기</a><p>
		</c:otherwise>
		
	</c:choose>
	

	
</div>
</body>
</html>
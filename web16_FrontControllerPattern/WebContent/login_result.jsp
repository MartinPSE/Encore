<%@page import="servlet.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
	MemberVO vo = (MemberVO) session.getAttribute("vo"); 
	if (vo == null ) { // login하지 않고, 이곳으로 바로 오신분 --> vo 정보 존재하지 않는다.	
%>
	<h3> 로그인먼저 하셔야합니다.</h3>
	<a href="login.html"> 여기를 클릭하여 주세요. </a>
<%
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Login Information....</h2>
LOGIN ID : <b> <%=vo.getId() %></b><br>
LOGIN NAME : <b> <%=vo.getName()  %></b><br>
LOGIN ADDRESS : <b> <%=vo.getAddress()  %></b><br>
LOGIN JSESSIONID : <b> <%= session.getId()  %></b><br>
<hr>
<a href="logout.jsp"> LOGOUT </a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="index.html"> HOME </a>
</body>
</html>











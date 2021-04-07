<%@page import="servlet.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">

	<h2>회원 검색 결과<br><hr>
		<h3> <%= request.getAttribute("vo") %></h3><br><br>
		<a href="index.html"> 홈으로 돌아가기 </a>
		
</div>
</body>
</html>
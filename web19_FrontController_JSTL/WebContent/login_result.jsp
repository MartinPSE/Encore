<%@page import="servlet.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<c:choose>
	<c:when test="${!empty vo}">
		<div align="center" style="margin:50px">
			<b>${vo.name}님 로그인 성공!! </b><br>
			<hr>
			<a href="index.jsp"> Home </a>
			<hr>
		</div>
	</c:when>
	
	<c:otherwise>
		<script>
		alert("로그인을 먼저 진행해주셔야 합니다");
		location.href = "login.jsp";
		</script>
	</c:otherwise>

</c:choose>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center" style="margin : 10px">
	<h2>Login Information....</h2>
LOGIN ID: <b> ${vo.id}</b><br>
LOGIN NAME : <b> ${vo.name}</b><br>
LOGIN ADDRESS : <b> ${vo.address}</b><br>
LOGIN JSESSIONID : <b><%= session.getId() %></b><br>
	<hr>
	
	<h3><a href="front.do?command=logout">LOGOUT</a>
	<h3><a href="index.jsp">HOME</a></h3>
</div>
</body>
</html>











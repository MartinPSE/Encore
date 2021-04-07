<%@page import="servlet.model.MemberVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ArrayList<MemberVO> lists = (ArrayList) request.getAttribute("lists");



%>    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h3>
	<marquee bgcolor = "yellow">회원 전체 명단 보기 </marquee>
	<hr>
	<table border="2" width="350" bgcolor="yellow" >
		<% for (int i =0 ; i < lists.size() ; i ++){
		
		%>
		<tr>
			<td><%= lists.get(i).getId()  %></td>
			<td><%= lists.get(i).getName() %></td>
			<td><%= lists.get(i).getAddress()  %></td>
		</tr>
		
		
		<%
		};
		%>
		
		
		
		
	</table><br>
	<a href ="index.html"><Strong>홈으로 돌아가기</Strong></a>

</h3>

</div>


</body>
</html>
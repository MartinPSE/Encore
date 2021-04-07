<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--  html 주석 -->
<%--
바인딩된 객체를 받아와서   ... request.getAttrbiute() <% %> 자바 문법!
정보를 출력하는 로직 작성
 --%> 
<%
	String id = (String) request.getAttribute("id");



%>   
 
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<marquee bgcolor="green">
		<h2>
		조회한 id님의 정보입니다.<br>
		이름 : 강호동<br>
		아이디 : <%= id %><br>
		주소 : 서래마을 <br>
		</h2>
	</marquee>
</div>

</body>
</html>
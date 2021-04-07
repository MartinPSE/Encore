<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 검색 결과</title>
</head>
<body>
<div align="center" style="margin : 50px">
	<h2>회원 검색 결과 </h2><hr>
	<h3><%= request.getAttribute("vo") %></h3>
	<hr>
	<A href="index.html">홈으로</A>
</div>
</body>
</html>
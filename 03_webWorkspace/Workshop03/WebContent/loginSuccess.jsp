<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 로그인 성공 !</title>
</head>
<body>
<div align="center">
	<marquee bgcolor="green"> Login Success</marquee>
	<h3> <%= request.getParameter("id") %> 님이 로그인 되었습니다. !!!</h3><br>
	<br>
	<p align = center><a href = "#"> Register Book </a></p>
	<p align = center><a href = "login.html"> Logout </a></p>
</div>
</body>
</html>
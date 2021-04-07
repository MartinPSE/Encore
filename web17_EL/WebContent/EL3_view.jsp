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
	<h2> Attribute에 바인딩 된 VO정보를 출력 <br><hr>
	아이디 : ${vo.id}<br> <%-- [ request.getParameter("vo").getId() == vo.id ] --%>
	이름 : ${vo.name} <br>
	주소 : ${vo.address} <br>
	</h2><hr>
	<h2> Attribute에 바인딩 된 LIST 정보를 입력</h2>
	<hr>
	아이디 1 : ${list[0].id}<br> <%-- list[0] == 1번째 VO --%>
	이름 1 : ${list[0].name}<br>
	주소 1 : ${list[0].address}<br>
	1VO :: ${list[0]}<br>
	<hr>
	아이디 2 : ${list[1].id}<br>
	이름 2 : ${list[1].name}<br>
	주소 2 : ${list[1].address}<br>
	2VO :: ${list[1]}<br>
	<hr>
	
</div>

</body>
</html>
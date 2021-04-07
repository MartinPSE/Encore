<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2> ACookieTest에서 저장된 쿠키정보를 받아온다..</h2>
	<%
		Cookie[] cs = request.getCookies();
		for(Cookie c : cs){
			out.println(c.getName()+"-------------"+c.getValue()); // 쿠키의 이름은 Name , 정보는 value (key, value) 느낌으로 
		}
	
	%>

</body>
</html>
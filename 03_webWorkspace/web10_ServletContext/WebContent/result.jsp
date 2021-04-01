<%@page import="servlet.model.Member"%>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>

<!-- html 주석입니다. 소스 보기하면 보인다. -->

<%-- JSP 주석입니다. 소스 보기하면 보이질 않는다. --%>
<!-- 
 %= % 출력문
 %  % 이 안에는 자바 코드가 들어간다. 

request --- HttpServletRequest
response --- HttpServletResponse
session --- HttpSession
out --- PrintWriter
application ---- ServletContext


 -->
 
<% Member members = (Member)application.getAttribute("members"); %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>Result Page</title>
</head>
<body>
<div align = center>
<marquee bgcolor ="white"><h1>
 JSP Result Page <br>
 Attribute에 바인딩 된 정보를 가져 옵니다. <br>
당신의 이름 : <%= members.getName()  %><br>
당신의 나이 : <%= members.getAge()  %> 세<br>
당신의 주소 : <%= members.getAddress() %><br>

</h1></marquee>
</div>

</body>
</html>

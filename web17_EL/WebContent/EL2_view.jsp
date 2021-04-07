<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> EL2_view . jsp</title>
</head>
<body>

<B> 1. JSP 기본 엘리먼트로 폼값 받아오기 </B>
ID : <%= request.getParameter("userId") %>
<hr>
<B> 2. EL로 폼값 받아오기</B>
ID : ${param.userId} <% //   (request.getParameter) 대신 'param' 을 사용해줘야 한다. %>
<br>
<hr>
<br>
<B> 1. JSP 기본 엘리먼트로 checkbox 폼값 받아오기</B><br>
<% 
String[] menus = request.getParameterValues("menu");
for(String menu : menus){
%>	

	<%= menu %>
	
<%	
}
%>
<hr>
<B> 2. EL로 checkbox 폼값 받아오기</B>
선택한 메뉴 :: <br>
${paramValues.menu[0]} <% // checkbox --> (request.getParamValues) 대신에 paramValues 로 사용한다.%>
${paramValues.menu[1]}
${paramValues.menu[2]}
${paramValues.menu[3]}
<% // for문을 표현하지 못한다.  %>

</body>
</html>
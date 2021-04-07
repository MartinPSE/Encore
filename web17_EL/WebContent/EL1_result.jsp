<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2> Attribute에 바인딩 된 내용을 찾아오자 </h2>
<b> 1 ~ 50 까지의 합산 결과 1) ::  </b>
<%= request.getAttribute("RESULT") %><br>

<%= session.getAttribute("RESULT") %><br>
<hr>
<b> 1 ~ 50 까지의 합산결과 2) EL :: </b>
${RESULT} <br>
${requestScope.RESULT} <br>
${sessionScope.RESULT} <br>
<hr>
${RESULT}<br>
${RESULT + 10000}<br>
${NAME}<br>
 
<% /* EL에서 Attribute의 이름 --> Scope
	  ${Attribute에 바인딩 된 이름} == getAttribute("바인딩 된 이름") 
	  바로 사용 or Scope (Attribute)와 같은 역할
	   
	  * 연산도 가능하다.
	  
	  * 없는 이름을 넣거나 잘못 넣어도 --> Error 가 아니라, 아무것도 출력되지 않는다.
	  
	  
	  
	  request -> session -> contextServlet 순으로 찾는다.
	  
	*/	

%>




</body>
</html>
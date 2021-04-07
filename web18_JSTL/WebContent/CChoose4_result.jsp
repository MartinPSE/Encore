<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
 <!--  c:choose 조건 여러개
 			c:when 각각의 조건
 			c:otherwise || else랑 동일 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${param.name == '1'}">
			<p>그럭저럭 지냅니다.</p>
		
		
		</c:when>
		
		<c:when test="${param.name=='2'}">
			<p> 네! 잘 지내고 있습니다 .</p>
			
		
		</c:when>
		
		<c:otherwise>
			<p> 멋진 시간을 보내고 있습니다 </p>
			
		
		</c:otherwise>
	</c:choose>

</body>
</html>
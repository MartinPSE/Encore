<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!--  JSTL 의 scope는 page부터 시작된다. 
	scope 속성을 지정해줘야 넘어가서 값을 출력해준다.  -->

<c:set var="CODE" value="1004" scope="request"/>
<c:set var="NAME" value="encore" scope="request"/>
<c:set var="PRICE" value="22000" scope="request"/>

<jsp:forward page="CSET2_result.jsp"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

상품코드 : ${CODE}

</body>
</html>
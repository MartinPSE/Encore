<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--  DataSource방식으로 DB를 찾아와보자!!  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align = "center">
	<h2> ConnectionPool..... DataSource Test </h2>
	<%
	Connection conn = null;
	// 1. Naming Service (JNDI) 를 통해서 DataSource(type)를 찾아온다. 
	// 2. javax.naming.Context의 lookup() 기능이 이때 사용된다. 
	
	Context ic = new InitialContext();
	// DataSource ds = (DataSource) ic.lookup("jdbc/mysql"); 
	DataSource ds = (DataSource) ic.lookup("java:comp/env/jdbc/mysql"); // 외부이름접근법.  
	out.println("<b>DataSource Lookup Complete<br>");
	
	conn = ds.getConnection();
	out.println("Connection Complete >> Return ");
	
	
	%>

	</div>
</body>
</html>
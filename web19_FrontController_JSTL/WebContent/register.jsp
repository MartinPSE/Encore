<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function passCheck() {
		
		var f = document.registerForm;
		if(f.password.value != f.repassword.value){
			alert("비밀번호를 확인해주세요!!");
			f.repassword.value="";
			f.repassword.focus();
			return false;
		}
	}
</script>
</head>
<body>

<h2 align="center"><b>Register Member Form....</b></h2><p>
<form action="front.do" method="post" name="registerForm" onsubmit="return passCheck()">
<input type="hidden" name="command" value="register">
ID : <input type="text" name="id" required="required"><br><br>
PASSWORD : <input type="password" name="password" required="required"><br><br>
NAME : <input type="text" name="name" required="required"><br><br>
ADDRESS : <input type="text" name="address" required="required"><br><br>

<input type="submit" value="member register">
</form>
</body>
</html>












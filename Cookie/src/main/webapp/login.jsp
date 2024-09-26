<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h5 style="color: red">${errorMsg }</h5>
	<form action="login">
	<input type="text" name="t1" placeholder="Username">
	<input type="text" name="t2" placeholder="Password">
	<input type="submit" value = "Login">
	</form>
</body>
</html>
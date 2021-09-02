<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	${param.message}
	<form action="RegisterController" method="post">
		Enter username : <input type="text" name="username" /><br/> 
		Enter email :<input type="email" name="email" /><br/>
		Enter address : <input type="text" name="address" /><br/>
		Enter phoneNumber :<input type="number" name="phoneNumber" /><br />
		<input type="submit" value="Register" />
	</form>
</body>
</html>
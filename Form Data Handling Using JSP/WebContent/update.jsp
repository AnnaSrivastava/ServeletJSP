<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="RegisterController" method="post">
		Enter username : <input type="text" name="username" value="${user.username}"/><br/> 
		Enter email :<input type="email" name="email" value="${user.email}" readonly="readonly"/><br/>
		Enter address : <input type="text" name="address" value="${user.address}"/><br/>
		Enter phoneNumber :<input type="number" name="phoneNumber" value="${user.phoneNumber}"/><br />
		<input type="submit" value="Update" />
	</form>
</body>
</html>
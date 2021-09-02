<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addStudent" method="post">
		Enter student id : <input type="text" name="stud_id"/><br/>
		Enter student name : <input type="text" name="stud_name"/><br/>
		Enter student stream : <input type="text" name="stream"/><br/>
		Enter student percentage : <input type="text" name="percentage"/><br/>
		<input type="submit" value="Submit" />
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>StudentApp</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Student Id</th>
				<th>Student Name</th>
				<th>Stream</th>
				<th>Percentage</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${students}" var="student">
				<tr>
					<td>${student.stud_id}</td>
					<td>${student.stud_name}</td>
					<td>${student.stream}</td>
					<td>${student.percentage}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="register.jsp">Add new Book</a>
</body>
</html>
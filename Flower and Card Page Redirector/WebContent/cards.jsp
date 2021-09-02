<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Cards Page</h1>
<p>Choose your cards quantity</p>
	<form action="cardController" method="POST">
		<input type="number" name="cardsQuantity" value="0"/> 
		<input type="submit" value="Submit" />
	</form>
</body>
</html>
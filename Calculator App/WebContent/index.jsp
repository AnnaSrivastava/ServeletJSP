<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post">
		Enter number 1 : <input type="number" name="num1"/><br /> 
		Enter number 2 : <input type="number" name="num2"/><br />
		<input formaction="CalculationController?action=add" type="submit" value="Add"/>
		<input formaction="CalculationController?action=subtract" type="submit" value="Subtract"/>
		<input formaction="CalculationController?action=multiply" type="submit" value="Multiply"/>
		<input formaction="CalculationController?action=divide" type="submit" value="Divide"/>
	</form>
	${param.message}
	<br />
	Result is : ${result}
</body>
</html>
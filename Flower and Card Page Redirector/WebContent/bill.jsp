<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	Integer flowersQuantity=(Integer)request.getSession().getAttribute("flowersQuantity");
	Integer cardsQuantity=(Integer)request.getSession().getAttribute("cardsQuantity");
	out.println("Flowers Quantity : "+flowersQuantity);
	out.println("Cards Quantity : "+cardsQuantity);
%>
</body>
</html>
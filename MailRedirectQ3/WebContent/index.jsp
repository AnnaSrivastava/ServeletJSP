<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ServeletCommunication</title>
</head>
<body>
	<form method="post" action="./mailController">
  <input type="radio" id="gmail" name="fav_mail" value="gmail">
  <label for="gmail">Gmail</label><br>
  <input type="radio" id="rediff" name="fav_mail" value="rediff">
  <label for="rediff">Rediff Mail</label><br>
  <input type="radio" id="yahoo" name="fav_mail" value="yahoo">
  <label for="yahoo">Yahoo Mail</label><br>
  <input type="radio" id="hotmail" name="fav_mail" value="hotmail">
  <label for="hotmail">Hot Mail</label><br>
  <input type="radio" id="unknown" name="fav_mail" value="unknown">
  <label for="unknown">Unknown</label><br>
  <input type="submit" value="Submit"/>
</form> 
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="LoginRegister" method="post">
	<table style="background-color: lightblue; margin-left:20px; margin-left: 20px;">
	<tr>
	<td><h3 style="color: black">Registration Page !!!</h3></td>
	</tr>
	<tr>
	<td>UserName: </td>
	<td><input type="text" name="username" required></td>
	</tr>

	<tr>
	<td>Name: </td>
	<td><input type="text" name="name" required></td>
	</tr>
	
	<tr>
	<td>Password: </td>
	<td><input type="password" name="password1" required></td>
	</tr>
	
	<tr>
	<td>Re-Type Password: </td>
	<td><input type="password" name="password2" required></td>
	</tr>
	
	<tr>
	<td><input type="submit" name="submit" value="register"></td>
	<td></td>
	</tr>
	</table>
	</form>

</body>
</html>
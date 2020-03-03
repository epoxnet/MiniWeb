<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>welcome</title>
</head>
<body style="color: black" style="background-color: gray" >
<h1>${message}</h1>

<form action="${pageContext.request.contextPath}/InventoryServlet" method="post">
	<table style="background-color: red; margin-left:100px; margin-left: 100px;">
	<tr>
	<td><h3 style="color: black">Inventory Page !!!</h3></td>
	</tr>
	<tr>
	<td>Manufacture: </td>
	<td><input type="text" name="manufacture" ></td>
	</tr>

	<tr>
	<td>Model: </td>
	<td><input type="text" name="model" ></td>
	</tr>
	
	<tr>
	<td>IMEI: </td>
	<td><input type="text" name="imei" required></td>
	</tr>
	
	
	<tr>
	<td><input type="submit" name="submit" value="search"></td>
	<td><input type="submit" name="submit" value="add"></td>
	<td><input type="submit" name="submit" value="edit"></td>
	<td></td>
	</tr>
	</table>
	<table style="background-color: white; margin-left:100px; margin-left: 100px;">
	<tr>
	<td>	
	<h1  style="color: red;">${failureMessage} </h1>
	</td>
	</tr>
	<tr>
	<td>
	<h1  style="color: green;">${successMessageItem} </h1>
	</td>
	</tr>
	<tr>
	<td>
	<h1  style="color: blue;">${displaymsg}</h1>
	<h1  style="color: blue;">${displaymsg1}</h1>
	<h1  style="color: blue;">${displaymsg2}</h1>
	</td>
	</tr>
	</table>
	</form>
</body>
</html>
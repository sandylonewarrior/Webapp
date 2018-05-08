<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Form</title>
</head>
<body>
	<h1>Enter the Details of Customer</h1>
	<form action="${pageContext.request.contextPath}/CustomerServlet" method="post">
		<tr>
			<td>Customer Name</td>
			<td><input type="text" name="customer_Name" /></td>
		</tr>
		</br>
		<tr>
			<td>Customer phone</td>
			<td><input type="text" name="customer_Phone" /></td>
		</tr>
		</br>
		<tr>
			<td>City</td>
			<td><input type="text" name="customer_City" /></td>
		</tr>
		</br>
		<tr>
			<td>State</td>
			<td><input type="text" name="customer_State" /></td>
		</tr>
		</br>
		<tr>
			<td>Apartment Number</td>
			<td><input type="text" name="customer_AptNo" /></td>
		</tr>
		</br>
		<tr>
			<td>Country</td>
			<td><input type="text" name="customer_Country" /></td>
		</tr>
		</br> <input type="submit" value="Submit" /> </br>
	</form>
	<a href="/Customer_JSP/views/homepage.jsp"> Home </a>
</body>
</html>
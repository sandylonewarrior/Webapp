<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/ProductServlet" method="post">
	<tr>
		<td>Product Name</td>
		<td><input type="text" name="productName" /></td>
	</tr>
	</br>
	<tr>
		<td>Product Description</td>
		<td><input type="text" name="description" /></td>
	</tr>
	</br>
	<tr>
		<td>Price</td>
		<td><input type="text" name="priceEach" /></td>
	</tr>
	</br> <input type="submit" value="Submit" /> </br>
	
	<a href="/Customer_JSP/views/homepage.jsp"> Home </a>
	</form>
</body>
</html>
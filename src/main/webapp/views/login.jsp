<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="homepage.jsp" method="post">
		<table>
			<thead>
				<tr>
					<th>Login Here</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>User Id</td>
					<td><input type="text" name="userId" /></td>
				</tr>
				</br>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				</tr>
				</br>
				<tr>
					<td colspan="1"><input type="submit" value="Login"></td>
				</tr>
				</br>
			</tbody>
		</table>
	</form>
</body>
</html>
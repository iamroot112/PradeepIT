<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form action="product" modelAttribute="product" method="POST">
	<table>
		<tr>
			<td>Product ID</td>
			<td><form:input path="productId" /></td>
		</tr>
		<tr>
			<td>ProductName</td>
			<td><form:input path="productName" /></td>
		</tr>
		<tr>
			<td>ProductPrice</td>
			<td><form:input path="productPrice" /></td>
		</tr>
		</table>
	</form:form>
</body>
</html>
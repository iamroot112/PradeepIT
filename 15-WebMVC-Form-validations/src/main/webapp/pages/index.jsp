<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style >
.error{
color: red;
}
</style>
</head>
<body>
	<h1>User Registration Form</h1>
	<form:form action="register" modelAttribute="user" method="POST">
		<table>
			<tr>
				<td>username:</td>
				<td><form:input path="uname" />
				<form:errors path="uname"  cssClass="error" /> </td>
			</tr>
			<tr>
				<td>password:</td>
				<td><form:input path="pwd" />
				<form:errors path="pwd"  cssClass="error"/></td>
			</tr>
			<tr>
				<td>EmailID:</td>
				<td><form:input path="email" />
				<form:errors path="email" cssClass="error"/></td>
			</tr>
			<tr>
				<td>PhoneNumber:</td>
				<td><form:input path="phno" />
				<form:errors path="phno" cssClass="error"/></td>
			</tr>
			<tr>
				<td>Age</td>
				<td><form:input path="age" />
				<form:errors path="age" cssClass="error"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register" /></td>
		</table>
	</form:form>
</body>
</html>
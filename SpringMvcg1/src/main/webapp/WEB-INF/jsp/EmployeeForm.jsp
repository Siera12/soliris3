<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Details</title>
</head>
<body>
	<h1 align="center">Add Employee Form</h1>
	
	<br/><br/><br/>
	
	<form:form action="ViewEmployeeCtr" modelAttribute="employeeObj" method="post">
		<table>
			<tr>
				<td>Employee Id:</td>
				<td><form:input path="employeeId"/><form:errors path="employeeId"/></td>
			</tr>
			<tr>
				<td>Employee Name:</td>
				<td><form:input path="employeeName"/><form:errors path="employeeName"/></td>
			</tr>
			<tr>
				<td>Employee Email:</td>
				<td><form:input path="email"/><form:errors path="email"/></td>
			</tr>	
			<tr>
				<td>Employee ContactNumber:</td>
				<td><form:input path="contactNumber"/><form:errors path="contactNumber"/></td>
			</tr>
			<tr>
					<td colspan="2">
						<input type="submit" value="Register"/>
 					</td>
				</tr>
		
		</table>
	</form:form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<title>Add Department</title>
</head>
<body>
	<form:form action="/HumanResource/submitDepartment"	modelAttribute="departments" method="post">
		<table>
			
			<tr>
				<td><form:hidden path="deptId" /></td>
			</tr>
			<tr>
				<td><form:label path="deptName" title="Department Name">Department Name</form:label></td>
				<td><form:input type="text" path="deptName" /></td>
			</tr>
			<tr>
				<td><form:label path="description" title="Description">Description</form:label></td>

			<td><form:input type="text" path="description" /></td>
			</tr>
			<tr>
				<td><form:label path="active" title="Active">Active</form:label></td>
				<td><form:input type="text" path="active" /></td>
			</tr>
			
			
			<tr>
				<td><input type="submit" value="submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>

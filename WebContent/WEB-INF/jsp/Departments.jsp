<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Department details</title>
</head>

<body>
	<form method="get" action="/HumanResource/addDepartment">
		<table>
			<tr>
			<td><input type="submit" value="Add"/></td>
			</tr>
			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Active</th>
				<th>Edit</th>
				<th>Delete</th>
				<c:forEach var="d" items="${departmentList}">
					<tr>


						<td><c:out value="${d.deptName}" /></td>
						<td><c:out value="${d.description}" /></td>
						<td><c:out value="${d.active}" /></td>
						<td><a href="editDepartment/${d.deptId}">Edit</a></td>
						<td><a href="deleteDepartment/${d.deptId}">Delete</a></td>
					</tr>
				</c:forEach>
		</table>
	</form>

</body>
</form>

</html>
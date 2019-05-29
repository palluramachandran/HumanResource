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
<form method="get" action="/HumanResource/addEmployee">
		<table>
			<tr>
			<td><input type="submit" value="Add"/></td>
			</tr>
			<tr>
			    <th>EmpID</th>
				<th>DeptID</th>
				<th>FirstName</th>
				<th>LastName</th>
				<th>EmailID</th>
				<th>Designation</th>
				<th>SkillSet</th>
				<th>Gender</th>
				<th>Password</th>
				<th>Salary</th>
				
				<c:forEach var="e" items="${employee}">
					<tr>

                        <td><c:out value="${e.deptId}" /></td>
						<td><c:out value="${e.empId}" /></td>
						<td><c:out value="${e.firstName}" /></td>
						<td><c:out value="${e.lastName}" /></td>
						<td><c:out value="${e.emailId}" /></td>
						<td><c:out value="${e.designation}" /></td>
						<td><c:out value="${e.skillSet}" /></td>
						<td><c:out value="${e.gender}" /></td>
						<td><c:out value="${e.password}" /></td>
						<td><c:out value="${e.salary}" /></td>
						
						
						<td><a href="editEmployee/${e.empId}">Edit</a></td>
						<td><a href="deleteEmployee/${e.empId}">Delete</a></td>
					</tr>
				</c:forEach>
		</table>
	</form>
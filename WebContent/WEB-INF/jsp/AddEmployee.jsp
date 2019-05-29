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
<title>Add Employee</title>
</head>
<body>
	<form:form action="/HumanResource/submitEmployee"	modelAttribute="employees" method="post">
		<table>
			<tr>
				<td><form:hidden path="empId" /></td>
			</tr>
			<tr>
				<td><form:label path="firstName" title="EmployeeFirst Name">EmployeeFirst Name</form:label></td>
				<td><form:input type="text" path="firstName" /></td>
			</tr>
			<tr>
				<td><form:label path="lastName" title="EmployeeLast Name">EmployeeLast Name</form:label></td>
				<td><form:input type="text" path="lastName" /></td>
			</tr>
			<tr>
				<td><form:label path="emailId" title="Email Id">Email Id</form:label></td>
				<td><form:input type="text" path="emailId" /></td>
				<tr>
				<td><form:label path="designation" title="Designation">Designation</form:label></td>
				<td><form:input type="text" path="designation" /></td>
			</tr>
			<tr>
				<td><form:label path="skillSet" title="Skill Set">Skill Set</form:label></td>
				<td><form:input type="text" path="skillSet" /></td>
			</tr>
			<tr>
				<td><form:label path="gender" title="Gender">Gender</form:label></td>
				<td><form:input type="text" path="gender" /></td>
			</tr>
			<tr>
				<td><form:label path="password" title="Password">Password</form:label></td>
				<td><form:input type="text" path="password" /></td>
			</tr>
			<tr>
				<td><form:label path="salary" title="Salary">Salary</form:label></td>
				<td><form:input type="text" path="salary" /></td>
			</tr>
			<tr>
               <td><form:label path = "deptId"></form:label></td>
               <td>
                  <form:select path = "deptId">
                    
                     <form:options items = "${departments}" />
                  </form:select>     	
               </td>
            </tr>   
			<tr>

				<td><input type="submit" value="submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
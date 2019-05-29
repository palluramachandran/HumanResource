<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Skill Count</title>
</head>
<body>
<table>
<c:forEach var="e" items="${empSkillList}">
			<tr>
				
				<td><c:out value="${e.skill}" /></td>
				<td><c:out value="${e.noOfEmployees}" /></td>
				
			</tr>
		</c:forEach>
	</table>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>START PAGE</title>
	</head>
	<body>
		<h3>Faculties list</h3>
		<table border="1">
				<tr>
					<th>id</th>
					<th>name</th>
					<th></th>
				</tr>
			<c:forEach var="faculty" items="${faculties}">
				<tr>
					<td>${faculty.id}</td>
					<td>${faculty.name}</td>
					<td>
						<a href='<c:url value="/students?id=${faculty.id}"/>'>students list</a>
					</td>
				</tr>	
			</c:forEach>	
		</table>
	</body>
</html>
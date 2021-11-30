<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>Faculty info</title>
	</head>
	<body>
		<h3>№${faculty.id} ${faculty.name}</h3>
		<h2>Students</h2>
		<table border="1">
				<tr>
					<th>id</th>
					<th>name</th>
					<th>surname</th>
					<th>age</th>
					<th></th>
				</tr>
			<c:forEach var="student" items="${faculty.students}">
				<tr>
					<td>${student.id}</td>
					<td>${student.name}</td>
					<td>${student.surname}</td>
					<td>${student.age}</td>
					<td>
						<a href="#">edit</a>
						<a href="#">delete</a>
					</td>
				</tr>	
			</c:forEach>
		</table>
	</body>
</html>
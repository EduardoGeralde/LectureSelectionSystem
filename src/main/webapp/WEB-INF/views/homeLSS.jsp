<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home LSS</title>
</head>
<body>
	<h1>Home LSS (Lecture Selection System)</h1>
	<table>
		<tr>
			<td>
				<form action="/LectureSelectionSystem/showUserForm">
					<button type="submit">User Registration</button>
				</form>
			</td>
			<td>
				<form action="/LectureSelectionSystem/showEventForm">
					<button type="submit">Event Registration</button>
				</form>
			</td>
		</tr>
	</table>
	<table>
		<tr>
			<td><h3>Events</h3></td>
		</tr>
		<c:forEach items="${events}" var="event">
			<tr>
				<td>${event.eventName}</td>
				<td>${event.eventLocal}</td>
				<td>${event.eventDate}</td>
				<td>
				<c:forEach items="${event.eventLectures}" var="lectures">
				<br>[${lectures.lecturerName}-${lectures.lectureTitle}-${lectures.lectureDescription}]
				</c:forEach>
				</td>
			</tr>
			<td>
				<c:if test="${event.eventActive}">
				<a href="${spring:mvcUrl('EC#show').arg(0,event.eventId).build()}">Add Lecture</a>
				</c:if>
			</td>
		</c:forEach>
	</table>
</body>
</html>
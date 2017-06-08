<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home LSS</title>
</head>
<body>
	<h1>Home LSS (Lecture Selection System)</h1>
	
	<form action="/LectureSelectionSystem/showEventForm">
		<button type="submit">Event Registration</button>
	</form>
	
	<form action="/LectureSelectionSystem/showLectureForm">
		<button type="submit">Lecture Registration</button>
	</form>
	
	<form action="/LectureSelectionSystem/showUserForm">
		<button type="submit">User Registration</button>
	</form>
	
	<table>
		<tr>
			<td>Events</td>
			<td>Lectures</td>
		</tr>
		<c:forEach items="${events}" var="event">
			<tr>
				<td>${event.eventName}</td>
				<td>${event.eventLocal}</td>
				<td>${event.eventDate}</td>
				<tr>
					<c:forEach items="${event.eventLectures}" var="lectures">
						[${lectures.lecturerName}-${lectures.lectureTitle}-${lectures.lectureDescription}]
					</c:forEach>
				</tr>
		</c:forEach>
	</table>
</body>
</html>
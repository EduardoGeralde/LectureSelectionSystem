<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home LSS</title>
</head>
<body>
	<h1>Home LSS (Lecture Selection System)</h1>
	
	<form method="post" action="/LectureSelectionSystem/showEventForm">
		<button type="submit">Event Registration</button>
	</form>
	
	<form method="post" action="/LectureSelectionSystem/showLectureForm">
		<button type="submit">Lecture Registration</button>
	</form>
	
	<form method="post" action="/LectureSelectionSystem/showUserForm">
		<button type="submit">User Registration</button>
	</form>
	
	
</body>
</html>
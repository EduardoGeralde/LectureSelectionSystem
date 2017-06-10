<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lecture Registration</title>
</head>
<body>
	<h1>Lecture Registration</h1>
	<form method="post" action="/LectureSelectionSystem/SaveLectures">
		<div>
			<label for="Event_eventId">Event Belonging ID</label>
			<input type="text" name="Event_eventId" id="Event_eventId" />
		</div>
		<div>
			<label for="lecturerName">Lecturer Name</label>
			<input type="text" name="lecturerName" id="lecturerName" />
		</div>
		<div>
			<label for="lectureTitle">Lecture Title</label>
			<input type="text" name="lectureTitle" id="lectureTitle" />
		</div>
		<div>
			<label for="lectureDescription">Lecture Description</label>
			<textarea rows="10" cols="20" name="lectureDescription" id="lectureDescription"></textarea>
		</div>
		<div>
			<input type="submit" value="Save">
		</div>
	</form>
</body>
</html>
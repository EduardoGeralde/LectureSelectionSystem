<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Event Registration</title>
</head>
<body>
	<h1>Event Registration</h1>
	<form method="post" action="/LectureSelectionSystem/saveEvents">
		<div>
			<label for="eventName">Event Name</label>
			<input type="text" name="eventName" id="eventName" />
		</div>
		<div>
			<label for="eventDescription">Event Description</label>
			<textarea rows="10" cols="20" name="eventDescription" id="eventDescription"></textarea>
		</div>
		<div>
			<label for="eventSite">Event Site</label>
			<input type="text" name="eventSite" id="eventSite" />
		</div>
		<div>
			<label for="eventOrganizer">Event Organizer</label>
			<input type="text" name="eventOrganizer" id="eventOrganizer" />
		</div>
		<div>
			<label for="eventLocal">Event Local</label>
			<input type="text" name="eventLocal" id="eventLocal" />
		</div>
		<div>
			<label for="eventLogoPath">Event Logo</label>
			<input type="file" name="eventLogoPath" id="eventLogoPath"/>
		</div>
		<div>
			<label for="eventDate">Event Date</label>
			<input type="text" name="eventDate" id="eventDate" />
		</div>
		<div>
			<input type="submit" value="Save">
		</div>
	</form>
</body>
</html>
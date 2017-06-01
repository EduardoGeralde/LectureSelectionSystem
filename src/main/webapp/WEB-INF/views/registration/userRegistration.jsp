<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Registration</title>
</head>
<body>
	<h1>User Registration</h1>
	<form method="post" action="/LectureSelectionSystem/users">
		<div>
			<label for="userName">User Name</label>
			<input type="text" name="lecturerName" id="lecturerName" />
		</div>
		<div>
			<label for="userEmail">User Email</label>
			<input type="text" name="userEmail" id="userEmail" />
		</div>
		<div>
			<label for="userPassword">User Password</label>
			<input type="password" name="userPassword" id="userPassword" />
		</div>
		<div>
			<input type="submit" value="Save">
		</div>
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Upload Practice</title>
</head>
<body>

	<form action="uploadimage" method="POST" enctype="multipart/form-data">
	<input type="file" name="demoimage">
	<input type="submit" value="Submit">
	</form>
 </body>
</html>
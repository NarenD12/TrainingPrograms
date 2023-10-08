<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<Style>
body {text-align:center;}
</Style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="insert" method="post">
<pre>
<input type="number" name="id" placeholder="Enter Id" required >
<input type="text" name="name" placeholder="Enter Name" required>
<input type="number" name="salary" placeholder="Enter Salary" min="7500">
<input type="submit" value="Insert">
</pre>
</form>
</body>
</html>
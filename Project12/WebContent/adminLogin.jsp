<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
</head>
<body bgcolor="#6543">

<center>
<form action="<%=request.getContextPath() %>/xyz" method="post">
<h1 style="color:blue;">Admin Login</h1>
<input type="text" name="aid" placeholder="Enter the admin id" required/>
<br><br>
<input type=""password" name="apass" placeholder="Enter the password" required/>
<br><br>
<input type="submit" value="Login" style="color:blue">
</form>
</center>
</body>
</html>
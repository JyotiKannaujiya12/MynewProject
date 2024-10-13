<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LoginId</title>
</head>
<body>
<center>
<form action="<%=request.getContextPath() %>/userLogin" method="post">
<h1>User Login Id</h1>

<input type="text" name="user_id" placeholder="Enter the user id" required/>
<br><br>
<input type="password" name="user_pass" placeholder="Enter the password" required/>
<br><br>
<input type="submit" value="user Login"/>
</form>
</center>
</body>
</html>
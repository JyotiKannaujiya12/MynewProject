<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>

<center>
<h1>Login Form</h1>
<form action="<%=request.getContextPath()%>/love" method="post">

<input type="text" name="fname" placeholder="Enter the first name" required/>
<br><br>
<input type="text" name="lname" placeholder="Enter last name" required/>
<br><br>
<input type="text" name="emailId" placeholder="Enter the emailid" required/>
<br><br>
<input type="text" name="Id" placeholder="Enter the id" required/>
<br><br>
<input type="submit" value="login">
</form>
</center>
</body>
</html>
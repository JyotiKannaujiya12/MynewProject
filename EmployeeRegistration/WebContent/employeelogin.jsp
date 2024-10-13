<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Login</title>
</head>
<body>
<center>
<h1>Employee Login</h1>
<form action="<%=request.getContextPath()%>/employeelogin" method="post">
<input type="text" name="eid" placeholder="Enter the employee id"  required/>
<br><br>
<input type="text" name="epass" placeholder="Enter the employee password" required/>
<br><br>
<input type="submit" value="login">
</form>
</center>
</body>
</html>
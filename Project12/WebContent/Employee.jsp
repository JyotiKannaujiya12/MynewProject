<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Login</title>
</head>
<body>
<body bgcolor="teal">

<center>
<form action="<%=request.getContextPath() %>/abc" method="post">
<h1 style="color:red;">Employee Login</h1>
<input type="text" name="employee_name" placeholder="Enter the employee name" required/>
<br><br>
<input type="text" name="employee_id" placeholder="Enter the employee id" required/>
<br><br>
<input type=""password" name="employee_pass" placeholder="Enter the password" required/>
<br><br>
<input type="submit" value="Login" style="color:blue">
</form>
</center>
</body>
</html>
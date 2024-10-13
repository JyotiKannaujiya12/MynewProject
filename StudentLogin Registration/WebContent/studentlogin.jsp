<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Login</title>
</head>
<body>



<center>

<h1 style="color:red;">Student Login</h1>
<form action="<%=request.getContextPath()%>/studentlogin" method="post">
<input type="text" name="sid" placeholder="Enter the admin id" required/>
<br><br>
<input type="password" name="spass" placeholder="Enter the password" required/>
<br><br>
<input type="submit" value="Login">
<br><br>
<button style="background-color: teal;"><a href="studentSignup.jsp" style="color:red">Student signup</a></button>
&nbsp;&nbsp; &nbsp; &nbsp; &nbsp;
<button style="background-color: teal;"><a href="index.jsp" style="color:red">Student Login</a></button>


</form>
</center>
</body>
</html>
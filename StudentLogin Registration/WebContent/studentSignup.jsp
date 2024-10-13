<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<center>

<h1 style="color:red;">Student signup</h1>
<form action="<%=request.getContextPath()%>/studentSignup" method="post">
<input type="text" name="sname" placeholder="Enter the Student name" required/>
<br><br>
<input type="text" name="sid" placeholder="Enter the student id"  required/>
<br><br>
<input type="password" name="spass" placeholder="Enter the student password"  required/>
<br><br>
<input type="text" name="sclass" placeholder="Enter the student class" required/>
<br><br>
<input type="text" name="sfee" placeholder="Enter the student  fee" required/>
<br><br>
<input type="text" name="sfather" placeholder="Enter the student father name"required/> 
<br><br>
<input type="submit" value="signup">
<br><br>

</form>
</center>
</body>
</html>
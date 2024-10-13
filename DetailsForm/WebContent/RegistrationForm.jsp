<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
<center>
<h1 style="color:red;">RegistrationForm</h1>
<form action="<%=request.getContextPath()%>/jyoti" method="post">
<input type="text" name="Firstname" placeholder="Enter the name" required/>
<br><br>
<input type="text" name="lastname" placeholder="Enter the lastname " required/>
<br><br>
<input type="text" name="emailid" placeholder="Enter the EmailId" required/>
<br><br>
<input type="text" name="password" placeholder="Enter your password " required/>
<br><br>
<input type="text" name="Dob" placeholder="Enter your date of birth" required/>
<br><br>
<input type="submit" value="submit">

</form>
</center>
</body>
</html>
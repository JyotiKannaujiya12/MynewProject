<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details</title>
</head>
<body>



<center>
<h1>Employee Details</h1>
<form action="<%=request.getContextPath()%>/employeedetails" method="post">
<input type="text" name="efname" placeholder="Enter the employee first name" required/>
<br><br>
<input type="text" name="elname" placeholder="Enter the employee last name"  required/>
<br><br>
<input type="text" name="epass" placeholder="Enter the employee pass" required/>
<br><br>
<input type="text" name="eid" placeholder="Enter the employee id"  required/>
<br><br>
<input type="text" name="eaddress" placeholder="Enter the employee address" required/>
<br><br>
<input type="text" name="emob" placeholder="Enter the emplyee mobile"required/> 
<br><br>
<input type="submit" value="signup">
<br><br>
<button style="background-color: teal;"><a href="employeelogin.jsp" style="color:red">employee Login</a></button>
&nbsp;&nbsp; &nbsp; &nbsp; &nbsp;
<button style="background-color: teal;"><a href="index.jsp" style="color:red"> details</a></button>

</form>
</center>
</body>
</html>
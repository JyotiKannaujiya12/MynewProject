<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enqury details</title>
</head>
<body>
<%
String name=request.getParameter("P_name");
String address=request.getParameter("P_address");
String mobileNo=request.getParameter("P_mobile");
%>

<h1>name=<%=name %></h1>
<h1>address=<%=address%></h1>
<h1>mobile</h1><%=mobileNo%></h1>
</body>
</html>
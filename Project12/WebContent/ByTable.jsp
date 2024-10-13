<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name=request.getParameter("P_name");
String address=request.getParameter("P_address");
String mobileNo=request.getParameter("P_mobile");
%>
<h1>Entry Details</h1>
<table border="2">
<tr>
<td>Name:</td>
<td><%=name %></td>
</tr>

<tr>
<td>Address:</td>
<td><%=address %></td>
</tr>
<tr>
<td>Mobile:</td>
<td><%=mobileNo%></td>
</tr>
</table>
</body>
</html>
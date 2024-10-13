package com.employeeLogin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeLogin extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String employee_name=req.getParameter("employee_name");
	String employee_id=req.getParameter("employee_id");
	String employee_pass=req.getParameter("employee_pass");
	System.out.println("Employee name:"+employee_name);
	System.out.println("Employee id:"+employee_id);
	System.out.println("Employee Password:"+employee_pass);
	
}
	
}


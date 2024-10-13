package com.employee;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeDetails extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		

		String employeefname=req.getParameter("efname");
		String employeelname=req.getParameter("elname");
		String employeepassword=req.getParameter("epass");
		String employeeid=req.getParameter("eid");
		String employeeaddress=req.getParameter("eaddress");
		String employeemob=req.getParameter("emob");
		
		System.out.println("Employee first name:"+employeefname);
		System.out.println("Employee last name:"+employeelname);
		System.out.println("Employee password:"+employeepassword);
		System.out.println("Employee id:"+employeeid);
		System.out.println("Employee address:"+employeeaddress);
		System.out.println("Employee mobile:"+employeemob);
		
		
	}
}

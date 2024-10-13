package com.registration;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUp extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String rfirstName=req.getParameter("firstName");
		String rlastName=req.getParameter("lastName");
		String rdob=req.getParameter("dob");
		String rfatherName=req.getParameter("fatherName");
		String rmotherName=req.getParameter("motherName");
		String rmob=req.getParameter("mobNum");
		String remail=req.getParameter("emailId");
		
		System.out.println("First Name:"+rfirstName);
		System.out.println("Last Name:"+rlastName);
		System.out.println("Date of Birth:"+rdob);
		System.out.println("Father Name:"+rfatherName);
		System.out.println("Mother Name:"+rmotherName);
		System.out.println("Mobile number:"+rmob);
		System.out.println("Email:"+remail);
		
		
	}
}

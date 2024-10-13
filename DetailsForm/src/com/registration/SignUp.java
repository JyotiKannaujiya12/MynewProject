package com.registration;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUp extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String Firstname=req.getParameter("Firstname");
		String lastname=req.getParameter("lastname");
		String emailid=req.getParameter("emailid");
		String password=req.getParameter("password");
		String Dob=req.getParameter("Dob");
		
		
		System.out.println("FirstName:"+Firstname);
		System.out.println("LastName:"+lastname);
		System.out.println("EmailId:"+emailid);
		System.out.println("Password:"+password);
		System.out.println("Date of Birth:"+Dob);
	}

}

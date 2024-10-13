package com.loginForm;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginUp extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String emailId=req.getParameter("emailId");
		String Id=req.getParameter("Id");
		
		System.out.println("First name="+fname);
		System.out.println("last name="+lname);
		System.out.println("email Id="+emailId);
		System.out.println("Id="+Id);
	}
}

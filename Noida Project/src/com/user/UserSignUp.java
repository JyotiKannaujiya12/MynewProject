package com.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.userDao.UserDao;

public class UserSignUp extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String con_pass=req.getParameter("con-pass");
		System.out.println(name);
		System.out.println(email);
		System.out.println(password);
		System.out.println(con_pass);
		boolean flag=UserDao.userRegistration(name, email, password, con_pass);
		
	}
}

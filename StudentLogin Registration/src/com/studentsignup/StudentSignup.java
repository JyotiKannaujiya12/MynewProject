package com.studentsignup;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.studentDao.StudentDao;


public class StudentSignup extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String studentname=req.getParameter("sname");
		String studentid=req.getParameter("sid");
		String studentpassword=req.getParameter("spass");
		String studentclass=req.getParameter("sclass");
		String studentfee=req.getParameter("sfee");
		String studentfather=req.getParameter("sfather");
		
		System.out.println("Student name:"+studentname);
		System.out.println("Student id:"+studentid);
		System.out.println("Student password:"+studentpassword);
		System.out.println("Student class:"+studentclass);
		System.out.println("Student fee:"+studentfee);
		System.out.println("Student father name:"+studentfather);
		
		
	}
}

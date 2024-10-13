package com.elogin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eloginDao.EloginDao;





public class EmployeeLogin extends HttpServlet{





	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String employeeid=req.getParameter("eid");
		String employeepassword=req.getParameter("epass");
		System.out.println("Employee id:"+employeeid);
		System.out.println("Employee password:"+employeepassword);
		
		
	
		boolean flag=EloginDao.employeelogin(employeeid, employeepassword);
		if(flag)
		{
			RequestDispatcher rd=req.getRequestDispatcher("employeehome.jsp?no=2");
			rd.forward(req, resp);
		}
		else
		{
			RequestDispatcher rd=req.getRequestDispatcher("index.jsp?no=1");
			rd.forward(req, resp);
		}
		}
	}


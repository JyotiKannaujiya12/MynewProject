package com.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminLogin extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String admin_id=req.getParameter("aid");
	String admin_pass=req.getParameter("apass");
	System.out.println("Admin id:"+admin_id);
	System.out.println("Admin Password:"+admin_pass);
}
}

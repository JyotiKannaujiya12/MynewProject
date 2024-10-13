package com.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.jdbc.PreparedStatement;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/message")

public class ContectUs extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String message=req.getParameter("message");
		System.out.println(name);
		System.out.println(email);
		System.out.println(message);
		
		//CREATE THE QUARY
		
		String INSERT_QUERY="INSERT INTO brandberry_tb(name, email, message)values(?,?,?)";
		// get Printwriter
		
		PrintWriter pw=resp.getWriter();
		// SET CONTENT TYPE 
		resp.setContentType("text/html");
		
		try {
			//LOAD THE JDBC DRIVER
			Class.forName("com.mysql.jdbc.Driver");
			//CREAT THE CONNECTION
			Connection con=DriverManager.getConnection("jdbc:mysql:///brandberry_db","root","admin");
			PreparedStatement ps=(PreparedStatement) con.prepareStatement(INSERT_QUERY);
			ps.setString(1,name);
			ps.setString(2, email);
			ps.setString(3, message);
			
		// EXECUTE QUERY
			int count=ps.executeUpdate();
			if(count==0) 
			{
				pw.println("record not stored in the Database ");
				
			}
			else 
			{
				pw.println("Record Stored in to Database");
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		}

}

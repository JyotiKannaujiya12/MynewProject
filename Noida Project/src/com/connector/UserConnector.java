package com.connector;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class UserConnector {
	public static Connection getConnection() {
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/noida_db","root","admin");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
	

}

package com.userDao;

import java.sql.ResultSet;
import java.sql.Statement;

import com.connector.UserConnector;
import com.mysql.jdbc.Connection;

public class UserDao {

	public static boolean userRegistration(String name,String email,String password,String con_pass) {
		Connection con=null;
		boolean flag=false;
		Statement st=null;
		ResultSet rs=null;
		try {
			con=UserConnector.getConnection();
			st=con.createStatement();
			String query="insert into noida_tbl(name,email,password,con_pass)values('"+name+"','"+email+"','"+password+"','"+con_pass+"')";
			int n=st.executeUpdate(query);
			if(n!=0) {
				flag=true;
			}
		} 
		catch (Exception e) 
		{
		e.printStackTrace();
		}
		
		return flag;
	}
}

package com.userDao;

import java.sql.ResultSet;
import java.sql.Statement;

import com.connector.DatabaseConnector;

import com.mysql.jdbc.Connection;

public class RegistrationDao {

	
	public static boolean userRegistration(String email,String password,String psw_repeat) {
		Connection con=null;
		boolean flag=false;
		Statement st=null;
		ResultSet rs=null;
		try {
			con=DatabaseConnector.getConnection();
			st=con.createStatement();
			String query="insert into jkk_tbl(email,password,psw_repeat)values('"+email+"','"+password+"','"+psw_repeat+"')";
			int n=st.executeUpdate(query);
			if(n!=0) {
				flag=true;
			}
		}
		catch (Exception e) 
		{
		e.printStackTrace();
		}
		return  flag;
		}
	}

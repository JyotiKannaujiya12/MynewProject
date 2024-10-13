package com.studentDao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.database.DatabaseConnector;

public class StudentDao {

	
	public static boolean studentRegistration(String sname,String sid,String spass,String sclass,String sfee,String sfather)
	{
		Connection con=null;
		boolean flag=false;
		Statement st=null;
		try
		{
			con= DatabaseConnector.getConnection();
			st= con.createStatement();
			String query="insert into student_login(s_name,s_id,s_pass,s_class,s_fee,s_father)values('"+sname+"','"+sid+"','"+spass+"','"+sclass+"','"+sfee+"','"+sfather+"')";
			int n=st.executeUpdate(query);
			if(n!=0)
			{
				flag=true;
			}
			
		}
		
			catch(Exception e)
			{
				e.printStackTrace();
			}
		return flag;
	}
	public static boolean userLogin(String sid)
	{
		Connection con=null;
		boolean flag=false;
		Statement st=null;
		ResultSet rs=null;
		try
		{
		con=DatabaseConnector.getConnection();
		st=con.createStatement();
		String query=" select*from student_login where s_id='"+sid+"'";
		rs=st.executeQuery(query);
		if(rs.next())
		{
			flag=true;
		}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return flag;
	}
}

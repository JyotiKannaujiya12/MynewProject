package com.employeeDao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.database.DatabaseConnector;

public class EmployeeDao {

	
	public static boolean employeedetails(String efname,String elname,String epass,String eid,String eaddress,String emob)
	{
		Connection con=null;
		boolean flag=false;
		Statement st=null;
		try
		{
			con= DatabaseConnector.getConnection();
			st= con.createStatement();
			String query="insert into m_employeee(e_fname,e_lname,e_pass,e_id,e_address,e_mob)values('"+efname+"','"+elname+"','"+epass+"','"+eid+"','"+eaddress+"','"+emob+"')";
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
	public static boolean employeelogin(String eid)
	{
		Connection con=null;
		boolean flag=false;
		Statement st=null;
		ResultSet rs=null;
		try
		{
		con=DatabaseConnector.getConnection();
		st=con.createStatement();
		String query=" select*from m_employeee where e_id='"+eid+"'";
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

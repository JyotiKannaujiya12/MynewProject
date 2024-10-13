package com.eloginDao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.database.DatabaseConnector;

public class EloginDao {

	
	public static boolean employeelogin(String eid,String epass)
	{
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		boolean flag=false;
		try
		{
			con=DatabaseConnector.getConnection();
			st=con.createStatement();
			String query="select*from m_employeee where e_id='"+eid+"' and e_pass='"+epass+"'";
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



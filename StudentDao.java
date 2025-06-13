package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.connection.Connector;
import com.entity.Student;

public class StudentDao
{
	public static int register(Student std) throws ClassNotFoundException, SQLException
	{
		Connection con =Connector.createConnection();
		String query="insert into student_tbl values(?,?,?,?,?,?)";
		
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, std.getId());
		ps.setString(2, std.getName());
		ps.setString(3, std.getUsername());
		ps.setString(4, std.getPassword());
        ps.setString(5, std.getCity());
        ps.setString(6, std.getContact());
        
        
		return ps.executeUpdate();
	}

}

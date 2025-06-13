package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector
{
	public static Connection createConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/student_registration";
		String username="root";
		String password="root";
		
		Connection con = DriverManager.getConnection(url,username,password);
		
		System.out.println("Connection Created");
		return con;
		
	}

	
}

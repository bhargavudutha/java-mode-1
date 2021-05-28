package com.second_exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC2 {

	public static void main(String[] args) throws Exception {
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_asgnmt", "root", "root");
		con.setAutoCommit(false);
		Statement st=con.createStatement();
		st.executeUpdate("insert into customers values('Bhargav',10000,'bhargav@hcl.com')");
		con.commit();
		con.rollback();
		}
		catch(SQLException e)
		{
			
			System.out.println("Email already exist");
		}
	}
}
	


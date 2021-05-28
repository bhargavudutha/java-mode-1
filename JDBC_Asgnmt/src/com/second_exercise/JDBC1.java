package com.second_exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC1 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_asgnmt", "root", "root");
		Statement stmt = con.createStatement();
		stmt.executeUpdate(
				"create table customers(name varchar(20),salary int(10),email varchar(20) UNIQUE)");
		System.out.println("Table created successfully");
		con.close();
		stmt.close();
	}
}

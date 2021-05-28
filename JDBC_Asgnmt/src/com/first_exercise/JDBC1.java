/*Jdbc Exercise(Using Statement and PreparedStatement)
1.Let’s write code to insert a new record into the table Users with
following details:

o username: steve
o password: secretpass
o fullname: steve paul
o email: steve.paul@hcl.com*/

package com.first_exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC1 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_asgnmt", "root", "root");
		Statement stmt = con.createStatement();
		stmt.executeUpdate(
				"create table users(username varchar(20),password varchar(20),fullname varchar(20), email varchar(20))");
		System.out.println("Table created successfully");
		con.close();
		stmt.close();
	}
}
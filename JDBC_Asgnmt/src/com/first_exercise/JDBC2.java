/*2. Select all records from the Users table and print out details for each
record.*/
package com.first_exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC2 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_asgnmt", "root", "root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from users");
		while (rs.next()) {
			System.out.println(
					rs.getString(1) + " ," + rs.getString(2) + ", " + rs.getString(3) + " ," + rs.getString(4));
		}
		st.close();
		con.close();

	}

}

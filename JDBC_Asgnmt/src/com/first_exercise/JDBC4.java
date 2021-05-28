/*4. Write a code to delete a record whose username field contains
“steve”.*/
package com.first_exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC4 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_asgnmt", "root", "root");
		Statement st = con.createStatement();
		st.executeUpdate("delete from users where username='steve'");
		System.out.println("Deleted successfully");
		st.close();
		con.close();
	}
}

/*3. Write a code to update all the details  of “steve paul”.*/
package com.first_exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC3 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_asgnmt", "root", "root");
		Statement st = con.createStatement();
		st.executeUpdate(
				"update users set username='Bhargav',password='bh@rgaV',fullname='Bhargav Udutha', email='bhargav@hcl.com' where fullname='steve paul'");
		System.out.println("Values are updated");
		st.close();
		con.close();
	}

}
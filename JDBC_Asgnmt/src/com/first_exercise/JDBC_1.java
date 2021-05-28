//insertion into table
package com.first_exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBC_1 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		String username = sc.nextLine();
		System.out.println("Enter password");
		String password = sc.nextLine();
		System.out.println("Enter fullname");
		String fullname = sc.nextLine();
		System.out.println("Enter email");
		String email = sc.nextLine();
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_asgnmt", "root", "root");
		PreparedStatement ps = con.prepareStatement("insert into users values(?,?,?,?)");
		ps.setString(1, username);
		ps.setString(2, password);
		ps.setString(3, fullname);
		ps.setString(4, email);
		int noOfRows = ps.executeUpdate();
		System.out.println(noOfRows + "row inserted");
		sc.close();
		ps.close();
		con.close();
	}

}

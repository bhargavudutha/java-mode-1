package com.second_exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC2 {
public static void main(String[] args) throws Exception {
Connection con = null;
try {
while (true) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter name:");
String name = sc.next();
System.out.println("Enter Salary:");
int salary = sc.nextInt();
System.out.println("Enter email:");
String email = sc.next();
Class.forName("com.mysql.cj.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_asgnmt", "root", "root");
con.setAutoCommit(false);
PreparedStatement ps = con.prepareStatement("insert into customers values(?,?,?)");
ps.setString(1, name);
ps.setInt(2, salary);
ps.setString(3, email);
ps.executeUpdate();
con.commit();
System.out.println("Do you Want to add more records y/n");
String ans = sc.next();
if (!"y".equalsIgnoreCase(ans)) {
System.out.println("Data saved successfully");
break;
}
}
} 
catch (Exception e) {
con.rollback();
System.out.println("Email Id must be unique . Data Rollback successfully");
} finally {
con.close();
}
}
}

	


package com.hcl.petshop.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DBConnection {
	
	private final static String url="jdbc:mysql://localhost:3306/petshop";
	private final static String UserName="root";
	private final static String password="root";
	private DBConnection() {
   
		
	}
	
	private static Connection con=null;
	public final static Connection getConnection()  {
		
		if(con==null) {
			 try {
				 Class.forName("com.mysql.cj.jdbc.Driver");
				 con= DriverManager.getConnection(url, UserName,password);
				} catch (SQLException | ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
		}
		
		return con;
	}

}

package com.hcl.petshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hcl.petshop.model.User;
import com.hcl.petshop.util.DBConnection;

public class UserDAO {

	public static boolean validate(String name, String pass) throws SQLException {
		boolean status = false;
		Connection con = DBConnection.getConnection();
		PreparedStatement ps = con.prepareStatement("select * from user where userName=? and pwd=?");
		try {
			ps.setString(1, name);
			ps.setString(2, pass);

			ResultSet rs = ps.executeQuery();
			status = rs.next();

		} catch (Exception e) {
			System.out.println(e);
		}
		return status;

	}

	public int addUser(User user) throws SQLException {
		int status = 0;
		Connection con = DBConnection.getConnection();

		String sql = "insert into user values(?,?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		try {
			stmt.setString(1, user.getUserName());
			stmt.setString(2, user.getPassword());

			status = stmt.executeUpdate();

		} catch (SQLException se) {
			se.getMessage();
		} finally {
			closePreparedStmt(stmt);
		}

		return status;

	}

	public void closePreparedStmt(PreparedStatement stmt) {
		try {
			if (stmt != null) {
				stmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

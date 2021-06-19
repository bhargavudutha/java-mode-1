package com.hcl.petshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.hcl.petshop.model.Pet;

import com.hcl.petshop.util.DBConnection;

public class PetDAO {
	
	public int addPet(Pet pet) throws SQLException {
		int status = 0;
		Connection con = DBConnection.getConnection();

		String sql = "insert into pet values(?,?,?,?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		try {
			stmt.setInt(1, pet.getId());
			stmt.setString(2, pet.getName());
			stmt.setInt(3, pet.getAge());
			stmt.setString(4, pet.getPlace());

			status = stmt.executeUpdate();

		} catch (SQLException se) {
			se.getMessage();
		} finally {
			closePreparedStmt(stmt);
		}

		return status;

	}
	
	public int addToMyPet(Pet pet) throws SQLException {
		int status = 0;
		Connection con = DBConnection.getConnection();

		String sql = "insert into mypet values(?,?,?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		try {
			stmt.setString(1, pet.getName());
			stmt.setInt(2, pet.getAge());
			stmt.setString(3, pet.getPlace());

			status = stmt.executeUpdate();

		} catch (SQLException se) {
			se.getMessage();
		} finally {
			closePreparedStmt(stmt);
		}

		return status;

	}
	
	
		List<Pet> list = new ArrayList<Pet>();
    // Method to display all the books
	public List<Pet> displayPet() throws SQLException{

		ResultSet rs = null;
		Statement stmt = null;
		Connection con = DBConnection.getConnection();
		try {
			stmt = con.createStatement();
			String sql = "select id, petname,age,place from pet";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id=rs.getInt(1);
                int age=rs.getInt(3);
				String name = rs.getString(2);
				String place = rs.getString(4);
				
				Pet pet=new Pet();
				pet.setId(id);
				pet.setName(name);
				pet.setAge(age);
				pet.setPlace(place);
				list.add(pet);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			rs.close();
			stmt.close();
		}
		return list;

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
	
	
	List<Pet> list1 = new ArrayList<Pet>();
    // Method to display all the books
	public List<Pet> displayMyPet() throws SQLException{

		ResultSet rs = null;
		Statement stmt = null;
		Connection con = DBConnection.getConnection();
		try {
			stmt = con.createStatement();
			String sql = "select id,petname,age,place from mypet";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id=rs.getInt(1);
                int age=rs.getInt(3);
				String name = rs.getString(2);
				String place = rs.getString(4);
				
				Pet pet=new Pet();
				pet.setId(id);
				pet.setName(name);
				pet.setAge(age);
				pet.setPlace(place);
				list1.add(pet);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			rs.close();
			stmt.close();
		}
		return list1;

	}
	Connection con;
	
	public List<Pet> selectPet(int id) {
        Pet pet=new Pet();
        
       
        try {
        		 con =DBConnection.getConnection();
            String sql= "select petname,age,place  from pet where id=?";
            PreparedStatement preparedStatement = con.prepareStatement(sql); 
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object
            while (rs.next()) {
           
                String name = rs.getString("petname");
                String place = rs.getString("place");
              int age= rs.getInt("age");
                
              pet.setId(id);
              pet.setName(name);
              pet.setAge(age);
              pet.setPlace(place);
               list.add(pet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }


}

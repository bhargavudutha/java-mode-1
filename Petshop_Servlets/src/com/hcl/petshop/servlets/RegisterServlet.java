package com.hcl.petshop.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hcl.petshop.dao.UserDAO;
import com.hcl.petshop.model.User;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		response.setContentType("text/html");
		User user= new User();
		UserDAO dao= new UserDAO();
        PrintWriter out = response.getWriter();
        String name = request.getParameter("username");
        String password = request.getParameter("password");
        String confirmPassword=request.getParameter("confirmpassword");
        try {
        	user.setUserName(name);
        	user.setPassword(password);
        	
         if(!(password.equals(confirmPassword))) {
			out.println("Password and Confirm Password must be same");
			RequestDispatcher rd = request.getRequestDispatcher("Register.jsp");
			rd.include(request, response);
       
        }
	
   else if(!UserDAO.validate(name,password))
				{
				    dao.addUser(user);
				    out.print("You are successfully registered");
				    RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
					rd.include(request, response);
				}
				else
				{
					out.print("User name already exists");
					RequestDispatcher rd = request.getRequestDispatcher("Register.jsp");
					rd.include(request, response);
               }
				
			} 
        	catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
        	}
   
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

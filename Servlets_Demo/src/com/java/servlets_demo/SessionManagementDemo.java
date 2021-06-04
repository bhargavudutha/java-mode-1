package com.java.servlets_demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SessionManagementDemo")
public class SessionManagementDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String user=request.getParameter("User_name");
		out.println("Username"+user+"<br>");
		HttpSession session=request.getSession();
		session.setAttribute("User_name",user);
		out.println("Homepage"+"<br>");
		out.println("<a href='SessionManagementDemo2'>Mobiles</a>");
		out.println("<a href='SessionManagementDemo2'>Laptops</a>");
	}

}

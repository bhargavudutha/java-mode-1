package com.servlets_demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookiesServlet1
 */
@WebServlet("/CookiesServlet1")
public class CookiesServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String name=request.getParameter("username");
		out.println(name);
		Cookie cookie=new Cookie("name",name);
		response.addCookie(cookie);
		out.println("<form action='CookieServlet2'>");
		out.println("<input type='Submit' name='Submit'/>");
	}

}

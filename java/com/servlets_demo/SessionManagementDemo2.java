package com.servlets_demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionManagementDemo2
 */
@WebServlet("/SessionManagementDemo2")
public class SessionManagementDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionManagementDemo2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		//session.setMaxInactiveInterval(10);
		//session.setMaxInactiveInterval(0);
		//session.invalidate();
		out.println("<a href='SessionManagementDemo3'>Payment</a>");
		out.println("Hello"+session.getAttribute("username"));
		//session.invalidate();
		//session.setMaxInactiveInterval(15*60); 15secs
	}

	

}

package com.hcl.petshop.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hcl.petshop.dao.PetDAO;
import com.hcl.petshop.model.Pet;

/**
 * Servlet implementation class MyPetServlet
 */
@WebServlet("/MyPetServlet")
public class MyPetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyPetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		PetDAO dao= new PetDAO();
		List<Pet> list = new ArrayList<Pet>();
		try {
			list = dao.displayMyPet();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        
		
        out.print("<table border='1' width='100%'");
		out.print("<tr><th>Name</th><th>Age</th><th>place</th><th>Purchase</th></tr>");
		for(Pet pet:list){
			out.print("<tr><td>"+pet.getName()+"</td><td>"+pet.getAge()+"</td><td>"+pet.getPlace()+"</td><td><a href='AddMyPetServlet?name="+pet.getName()+"'>edit</a></td></tr>");
		}
		out.print("</table>");
		
				out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

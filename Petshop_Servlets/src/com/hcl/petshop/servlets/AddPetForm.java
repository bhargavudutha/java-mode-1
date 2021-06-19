package com.hcl.petshop.servlets;

import java.io.IOException;
import java.io.PrintWriter;
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
 * Servlet implementation class AddPetForm
 */
@WebServlet("/AddPetForm")
public class AddPetForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPetForm() {
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
		PrintWriter pw=response.getWriter();
		String id=request.getParameter("id");
		
		PetDAO dao=new PetDAO();
		int id1=Integer.parseInt(id);
		List<Pet> list1= new ArrayList<Pet>();
		list1=dao.selectPet(id1);
		for(Pet pet:list1){
			pw.print("<form action='AddMyPetServlet' method='post'>");
			pw.print("<table>");
			
			pw.print("<tr><td>ID:</td><td><input type='text' name='id' value="+pet.getId()+"/></td></tr>");
			pw.print("<tr><td>petname:</td><td><input type='text' name='petname' value="+pet.getName()+"/></td></tr>");
			pw.print("<tr><td>age:</td><td><input type='text' name='age' value="+pet.getAge()+"/></td></tr>");
			pw.print("<tr><td>place:</td><td><input type='text' name='place' value="+pet.getPlace()+"/></td><tr>");
			
			pw.print("<tr><td colspan='3'><input type='submit'  value='Buy'/></td></tr>");
			pw.print("/table");
			pw.print("/form");
			
			pw.close();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

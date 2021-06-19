package com.hcl.petshop.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hcl.petshop.dao.PetDAO;
import com.hcl.petshop.dao.UserDAO;
import com.hcl.petshop.model.Pet;
import com.hcl.petshop.model.User;

/**
 * Servlet implementation class AddPetServlet
 */
@WebServlet("/AddPetServlet")
public class AddPetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddPetServlet() {
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		Pet pet = new Pet();
		PetDAO dao = new PetDAO();

		PrintWriter out = response.getWriter();
		String ids = request.getParameter("id");
		String name = request.getParameter("petname");
		String age = request.getParameter("age");

		String place = request.getParameter("place");
		int age1 = Integer.parseInt(age);
		int id = Integer.parseInt(ids);

		pet.setId(id);
		pet.setName(name);
		pet.setAge(age1);
		pet.setPlace(place);

		try {
			dao.addPet(pet);
			out.println("Pet Added succesfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");

		rd.include(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

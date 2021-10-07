package webproject.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webproject.impl.EmployImpl;
import webproject.services.EmployRegister;

/**
 * Servlet implementation class EmployRegiServlet
 */
@WebServlet("/EmployRegiServlet")
public class EmployRegiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public EmployRegiServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		 String FirstName=request.getParameter("name");
		 String LastName=request.getParameter("name");
		 String email=request.getParameter("email");
		 String password=request.getParameter("password");
		System.out.println("firstname--"+FirstName+"lastname--"+LastName+"email--"+email+"password--"+password);
		
		EmployRegister obj=new EmployImpl();
		obj.empRegister(FirstName, LastName, email, password);
	}

}

package webproject.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webproject.impl.RegistrationImpl;
import webproject.services.RegistrationI;

/**
 * Servlet implementation class RegistrationServelt
 */
@WebServlet("/RegistrationServelt")
public class RegistrationServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServelt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String FirstName=request.getParameter("firstName");
		 String LastName=request.getParameter("lastName");
		 String email=request.getParameter("email");
		 String password=request.getParameter("password");
		System.out.println("firstName--"+FirstName+"lastName--"+LastName+"email--"+email+"password--"+password);
		RegistrationI obj=new RegistrationImpl();
		obj.Registration(FirstName, LastName, email, password);
		
		
		
		
		
	}

}

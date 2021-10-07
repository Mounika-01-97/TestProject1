package webproject.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SigninServlet
 */
@WebServlet("/SigninServlet")
public class SigninServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SigninServlet() {
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
		String userName=request.getParameter("user");
		 String passWord=request.getParameter("pwd");
		 System.out.println("user--"+userName+"pass--"+passWord);
	if(userName.equalsIgnoreCase("mounika")&&passWord.equalsIgnoreCase("jakkula")) {
		response.sendRedirect("Sucess.html");
		System.out.println("inside if condition");
		RequestDispatcher rd=request.getRequestDispatcher("/Sucess.html");
		
		System.out.println("after the dispatcher");
	}
	else {
		System.out.println("inside the else condition");
		response.sendRedirect("Failure.html");
		RequestDispatcher rd=request.getRequestDispatcher("/Failure.html");
	}
	
	
	
	
	
	
	
	}

}

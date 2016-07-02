package com.test.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String operation=		request.getParameter("operation");
		String email=			request.getParameter("email");
		String securityKey=		request.getParameter("securityKey");
System.out.println("Enter in Login");
		
	if(operation != null){
		
		if("login".equalsIgnoreCase(operation)){
			if("ram@test.com".equalsIgnoreCase(email) && "test".equalsIgnoreCase(securityKey)){

				response.sendRedirect("/viewRecord");
			}else{
		
				request.setAttribute("msg", "Login Failed");
				RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
				rd.forward(request, response);
			
			}
		}else{
			request.setAttribute("msg", "Registration Failed");
			RequestDispatcher rd = request.getRequestDispatcher("/success.jsp");
			rd.forward(request, response);
		}
		
	}else{
		RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
		rd.forward(request, response);
	}

		
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doGet(request, response);
		// TODO Auto-generated method stub
	}

}

/**
 * 
 */
package com.test.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Virendra.Patidar
 *
 */
public class RegisterController extends HttpServlet {
	
	
		private static final long serialVersionUID = 1L;
	     

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			
	String operation=		request.getParameter("operation");
	String email=			request.getParameter("email");
	String contact =		request.getParameter("contact");
	String securityKey=		request.getParameter("securityKey");
	String 	patientName=	request.getParameter("patientName");
		
	if(operation != null){
		
		if("Submit".equalsIgnoreCase(operation)){
			request.setAttribute("msg", "Registration SuccessFul now Go to Login Page");
			RequestDispatcher rd = request.getRequestDispatcher("/success.jsp");
			rd.forward(request, response);
		}else{
			request.setAttribute("msg", "Registration Failed");
			RequestDispatcher rd = request.getRequestDispatcher("/success.jsp");
			rd.forward(request, response);
		}
		
	}else{
		RequestDispatcher rd = request.getRequestDispatcher("/registration.jsp");
		rd.forward(request, response);
	}

			// TODO Auto-generated method stub
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			doGet(request, response);
		}

	}


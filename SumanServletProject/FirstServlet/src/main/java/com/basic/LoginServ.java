package com.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServ
 */
@WebServlet("FirstServlet/LoginServ")
public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		String user=request.getParameter("username");
		String pass=request.getParameter("pass");
		
		request.getRequestDispatcher("/link.html").include(request,response);
		
		if(pass.equals("Suman1234")) {
			out.println("Welcome "+user);
			HttpSession ses=request.getSession();
			ses.setAttribute("user", user);
			
		}else {
			out.println("Password is Wrong..............<br>");
			request.getRequestDispatcher("/login.html").include(request, response);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

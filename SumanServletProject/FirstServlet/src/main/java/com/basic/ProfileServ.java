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
 * Servlet implementation class ProfileServ
 */
@WebServlet("/ProfileServ")
public class ProfileServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		request.getRequestDispatcher("/link.html").include(request, response);
		HttpSession session=request.getSession(false);
		
		if(session!=null) {
			String name=(String)session.getAttribute("user");
			
			out.print("Hello, "+name+" Welcome to profile");
			out.println("<font color='green'");
			out.println("Hello "+name+"<br> your course is java web designing. ");
			
		}else {
			out.print("Please login first");
			request.getRequestDispatcher("/login.html").include(request, response);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

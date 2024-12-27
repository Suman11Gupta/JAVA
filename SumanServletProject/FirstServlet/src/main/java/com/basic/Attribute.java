package com.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Attribute
 */
@WebServlet("/Attribute")
public class Attribute extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String course=request.getParameter("course");
		//-------------------------Application--------------------------
		ServletContext con=request.getServletContext();
		con.setAttribute("first name", fname);
		//-------------------------Session-------------------------------
		HttpSession ses=request.getSession();
		ses.setAttribute("course", course);
		//--------------------------request---------------------------------
		request.setAttribute("last_name", lname);
		
		out.println("<h2> vist below link to display attribute. <h2>");
		
		out.println("<a href='ShowAttribute'>Show Attribute</a>");
		request.getRequestDispatcher("ShowAttribute").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

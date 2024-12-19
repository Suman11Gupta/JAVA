package com.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConfigDemo
 */
//@WebServlet("/ConfigDemo")
public class ConfigDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter obj=response.getWriter();
		obj.println("<h1> Servlet Config Interface....</h1>");
		
		ServletConfig ob=getServletConfig();
		String name=ob.getServletName();
		
		obj.println("<h2> Working in servlet "+name+"</h2>");
		obj.println("<font color=red>Hello user your otp for "+ob.getInitParameter("Bank")+" is ");
		String pass=ob.getInitParameter("password");
		if(pass.equals("2024"))
			obj.println("9978");
		else
			obj.println("Please enter correct password");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

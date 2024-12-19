package com.basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Eligiblecheck")
public class Eligiblecheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Eligiblecheck() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter obj=response.getWriter();
		
		String Fname=request.getParameter("Fname");
		String Lname=request.getParameter("Lname");
		int Age=Integer.parseInt(request.getParameter("Age"));
		String res="";
		
		if(Age>=18)
			res=Fname+" "+Lname+" You are eligible for voting";
		else 
			res=Fname+" "+Lname+" You are not eligible for voting.You can vote after "+(18-Age)+" Years";
		
		obj.print("<b>"+res);
		
		//-------getParameternames-----------
		obj.print("<h2> Using getParameter Names method</h2><br>");
		Enumeration<String> Eobj=request.getParameterNames();
		
		while(Eobj.hasMoreElements()) {
			String str=Eobj.nextElement();
			obj.println(str+"------>"+request.getParameter(str)+"<br>");
		}
		
		//----getParameternames------------------
		obj.print("<h2> Using getParameter Names method</h2><br>");
		Enumeration<String> paraname=request.getParameterNames();
		
		while(paraname.hasMoreElements()) {
			String pname=paraname.nextElement();
			String value=request.getParameter(pname);
			obj.println(pname+":"+value+"<br>");
		}
		
		//-------------------using getParametermap--------------
		obj.println("<h1> Using get parameter map method</h1><br>");
		Map<String,String[]> map=request.getParameterMap();
		
		Set<String> paramap=map.keySet();
		
		for(String p:paramap) {
			obj.println(p+":");
			String[] value=map.get(p);
			System.out.println(value.length);
			for(String b:value) {
				obj.println(b+"<br>");
			}
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

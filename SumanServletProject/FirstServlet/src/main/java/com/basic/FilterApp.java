package com.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class FilterApp
 */
@WebFilter("/FilterApp")
public class FilterApp extends HttpFilter implements Filter {
	
	FilterConfig config;
	public void init(FilterConfig fConfig) throws ServletException {
		this.config=fConfig;
	}
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public FilterApp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		PrintWriter  obj=response.getWriter();
		
		String con=config.getInitParameter("construction");
		System.out.println(con);
		if(con.equals("yes")) {
			obj.println("<br><font color='red'>this site is under construction</font.<br>");
		}else {
			obj.println("<br><b>Servlet via Filter</b><br>");
			chain.doFilter(request, response);
		}
		
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	

}

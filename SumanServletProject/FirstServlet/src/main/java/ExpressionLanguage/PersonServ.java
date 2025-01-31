package ExpressionLanguage;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PersonServ
 */
@WebServlet("/PersonServ")
public class PersonServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Person ob=new Person();
		ob.setName("Suman");
		ob.setAge(23);
		
		request.setAttribute("course", 369);//request scope
		request.setAttribute("person",ob);
		
		HttpSession session=request.getSession();
		
		session.setAttribute("course", "session scope-----> Java Web App");//Session Scope
		
		ServletContext context=getServletContext();
		context.setAttribute("course", "Application scope---> Python wen app");//application scope
		
		request.getRequestDispatcher("ELProject/firstEL.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

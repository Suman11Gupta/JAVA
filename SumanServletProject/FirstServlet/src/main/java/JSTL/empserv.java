package JSTL;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class empserv
 */
@WebServlet("/empserv")
public class empserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<emp> empList = new ArrayList<emp>();
		emp emp1=new emp();
		emp1.setId(1);
		emp1.setName("Suman");
		emp1.setRole("Developer");
		
		emp emp2=new emp();
		emp2.setId(2);
		emp2.setName("Sonali");
		emp2.setRole("Developer");
		
		empList.add(emp1);
		empList.add(emp2);
		
		request.setAttribute("empList", empList);
		
		request.setAttribute("htmlTagData", "<br/> Create a new line.");
		
		request.getRequestDispatcher("taglib/emp.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

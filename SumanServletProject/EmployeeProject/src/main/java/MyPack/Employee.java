package MyPack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Employee
 */
@WebServlet("/Employee")
public class Employee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAO obj1;
		int result=0;
		response.setContentType("text/html");
     PrintWriter obj=response.getWriter();
	
		
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String pass=request.getParameter("pass");
		String email=request.getParameter("email");
		String country=request.getParameter("country");
		
		
			
			//Insert
			Employee_Pojo emp1=new Employee_Pojo();
			
			emp1.setId(id);
			emp1.setName(name);
			emp1.setPass(pass);
			emp1.setEmail(email);
			emp1.setCountry(country);
			obj1=new Emp_Dao();
			try {
				result=obj1.saveEmployee(emp1);
			}catch(SQLException | ClassNotFoundException e) {
				System.out.println(e);
				throw new RuntimeException(e);
			}
			
			if(result>0) {
				obj.println("Employee added");
			}
			else {
				obj.println("Failed to add employee");
			}	
			response.sendRedirect("/EmployeeProject/Display");
			
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

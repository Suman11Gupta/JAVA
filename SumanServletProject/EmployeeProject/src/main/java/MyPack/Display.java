package MyPack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Display
 */
@WebServlet("/Display")
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAO obj1;
		response.setContentType("text/html");
		PrintWriter obj=response.getWriter();
		List<Employee_Pojo> emp2=new ArrayList<>();
		Employee_Pojo obj3=new Employee_Pojo();
		obj1=new Emp_Dao();
		try {
			emp2=obj1.getalldata();
			
			obj.println("<!DOCTYPE html>");
			obj.println("<html>");
			obj.println("<head><title>Employee List</title></head>");
			obj.println("<body>");
			obj.println("<h1>Employee List</h1>");
			obj.println("<a href='/EmployeeProject/Employee.html'>Add New Employee</a><br><br>");
			obj.println("<table border='1'>");
			obj.println("<tr><th>ID</th><th>Name</th><th>Password</th><th>Email</th><th>Country</th><th>Edit</th><th>Delete</th></tr>");

			for(Employee_Pojo pojoob:emp2) {
				obj.print("<tr><td>"+pojoob.getId()+"</td><td>"+pojoob.getName()+"</td><td>"+pojoob.getPass()+"</td><td>"+pojoob.getEmail()+"</td><td>"
						+pojoob.getCountry()+"</td><td>"+
						"<a href='Edit?id=" + pojoob.getId() + "'>Edit</a></td>"
						+"<td><a href='Delete?id=" + pojoob.getId() + "'>Delete</a></td></tr>");
				
			}
//	            while (rs.next()) {
//	            	obj.println("<tr>");
//	            	obj.println("<td>" + rs.getString("id") + "</td>");
//	            	obj.println("<td>" + rs.getString("name") + "</td>");
//	            	obj.println("<td>" + rs.getString("pass") + "</td>");
//	            	obj.println("<td>" + rs.getString("email") + "</td>");
//	            	obj.println("<td>" + rs.getString("country") + "</td>");
//	            	obj.println("<td><a href='Edit?id=" + rs.getString("ID") + "'>Edit</a></td>");
//	            	obj.println("<td><a href='Delete?id=" + rs.getString("ID") + "'>Delete</a></td>");
//	            	obj.println("</tr>");
//	            }
	            obj.println("</table>");
	            obj.println("</body>");
	            obj.println("</html>");
	        } catch (Exception e) {
	            e.printStackTrace(obj);
	        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

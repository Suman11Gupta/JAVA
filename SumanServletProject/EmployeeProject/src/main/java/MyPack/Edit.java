package MyPack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Edit
 */
@WebServlet("/Edit")
public class Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAO obj1;
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
		String Id=request.getParameter("id");
		obj1=new Emp_Dao();
		Employee_Pojo emp4=new Employee_Pojo();

		try {
			emp4=obj1.getid(Id);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	                out.println("<!DOCTYPE html>");
	                out.println("<html>");
	                out.println("<head><title>Edit Employee</title></head>");
	                out.println("<body>");
	                out.println("<h1>Edit Employee</h1>");
	                out.println("<form action='Update'>");
	                out.println("<input type='hidden' name='id' value='" + Id + "'>");
	                out.println(" Id:   <input type='text' name='id' value='" + emp4.getId() + "'required><br>");
	                out.println(" Name: <input type='text' name='name' value='" + emp4.getName() + "' required><br>");
	                out.println(" Password: <input type='password' name='pass' value='" + emp4.getPass() + "' required><br>");
	                out.println(" Email: <input type='email' name='email' value='" + emp4.getEmail() + "' required><br>");
	                out.println("Country: <input type='text' name='country' value='" + emp4.getCountry() + "' required><br><br>");
	                out.println(" <input type='submit' value='Update Employee'>");
	                out.println("</form>");
	                out.println("</body>");
	                out.println("</html>");
	                out.close();
			
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

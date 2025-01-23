package MyPack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Update
 */
@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		DAO obj2;
		int result=0;
		PrintWriter obj=response.getWriter();
		String Id=request.getParameter("id");
		String Name=request.getParameter("name");
		String Password=request.getParameter("pass");
		String Email=request.getParameter("email");
		String Country=request.getParameter("country");
		
		Employee_Pojo pojo=new Employee_Pojo();
		pojo.setId(Id);
		pojo.setName(Name);
		pojo.setPass(Password);
		pojo.setEmail(Email);
		pojo.setCountry(Country);
		obj2=new Emp_Dao();
		try {
			result=obj2.empUpdate(pojo);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 if(result>0) {
	    	   obj.println("updated successfully"+pojo.getId());
	    	   System.out.println("updated successfully"+pojo.getId());
	            request.getRequestDispatcher("Employee.html").include(request, response);

	       }
	       else {
	    	   obj.println("update fail"+pojo.getId());
	    	   System.out.println("update fail success"+pojo.getId());
	    	   

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

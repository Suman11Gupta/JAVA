package MyPack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JDBC_Login
 */
@WebServlet("/JDBC_Login")
public class JDBC_Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		int status=0;
		//out.println("working");
		String Empno=request.getParameter("empno");
		String Name=request.getParameter("name");
		String Salary=request.getParameter("sal");
		String Deptno=request.getParameter("deptno");
		
		out.print("empno= "+Empno);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//Register driver class
			//Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("after get");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/suman","root","");//create
			
			Statement st=con.createStatement();//create statement object
			PreparedStatement ps=con.prepareStatement("insert into employee(Empno,Name,Salary,Deptno) values(?,?,?,?)");
			ps.setString(1, Empno);
			ps.setString(2, Name);
			ps.setString(3,Salary);
			ps.setString(4, Deptno);
			status=ps.executeUpdate();
			con.close();
			out.println("<b> Record Inserted</b>");
		}catch(Exception e) {
			System.out.println(e);
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

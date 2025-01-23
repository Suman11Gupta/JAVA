package MyPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	public static String url="jdbc:mysql://localhost:3306/suman";
	public static String user="root";
	public static String pass="";
	public static Connection getconnection() throws ClassNotFoundException,SQLException{
		Connection con=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection(url,user,pass);
		return con;
	}
}

package JDBC;
import java.sql.*;
public class Database {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver register");

        Connection con=DriverManager.getConnection("jdbc:mysql://localhost3306/employee","root","Mysql0123");
        System.out.println("Connection Established");

        Statement stmt=con.createStatement();

        ResultSet rs=stmt.executeQuery("Select * from emp");
        System.out.println("Empno\tName\tsalary\tDeptno");
        System.out.println("........................................................");
        while(rs.next()){
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4));
        }
    }
}

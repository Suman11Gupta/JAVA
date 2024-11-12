package Suman;

import java.sql.*;

import static java.lang.Class.forName;

public class Privious_next {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver register");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
        System.out.println("sql connection establish");

        Statement obs=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet rs= obs.executeQuery("Select * from emp");
        rs.last();
        int count=1;
        while(rs.previous()){
            if(count==2)
                Thread.sleep(2000);
            count++;
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4));
        }
        System.out.println();
        System.out.println();
        rs.last();
        while(rs.next()){
            Thread.sleep(5000);
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4));
        }
    }
}

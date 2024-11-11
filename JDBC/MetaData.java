package Suman;

import java.sql.*;

public class MetaData {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver register");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
            System.out.println("Connection established");
            Statement smt=con.createStatement();
            ResultSet rs=smt.executeQuery("select * from emp");
            ResultSetMetaData md= rs.getMetaData();
            System.out.println(md.getTableName(1));
            int field_count=md.getColumnCount();
            System.out.println("number of column n: "+field_count);
            for(int i=1;i<=field_count;i++){
                System.out.println(md.getColumnName(i)+"----->"+md.getColumnTypeName(i));
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}

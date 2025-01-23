package MyPack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Emp_Dao implements DAO {

	public static final String saveEmp="insert into employeelist(id,name,pass,email,country) values(?,?,?,?,?)";
	
	public static final String updateEmp="update employeelist set name=?,pass=?,email=?,country=? where id=?";
	
	public static final String deleteEmp="delete from employeelist where id=?";
	
	public static final String getEmp="select * from employeelist where id=?";
	
	public static final String getAll="select * from employeelist";
	
	@Override
	public int saveEmployee(Employee_Pojo employee) throws SQLException, ClassNotFoundException {
		int status=0;
		Connection con=DBconnection.getconnection();
		PreparedStatement ps=con.prepareStatement(saveEmp);
		ps.setString(1, employee.getId());
		ps.setString(2, employee.getName());
		ps.setString(3, employee.getPass());
		ps.setString(4, employee.getEmail());
		ps.setString(5, employee.getCountry());
		status=ps.executeUpdate();
		return status;
	}

	@Override
	public int empUpdate(Employee_Pojo employee) throws ClassNotFoundException, SQLException {
		int status=0;
		Connection con=DBconnection.getconnection();
		PreparedStatement ps=con.prepareStatement(updateEmp);
//		ps.setString(1, employee.getId());
		ps.setString(1, employee.getName());
		ps.setString(2, employee.getPass());
		ps.setString(3, employee.getEmail());
		ps.setString(4, employee.getCountry());
		ps.setString(5, employee.getId());
		System.out.println(ps);
		status=ps.executeUpdate();
		return status;
	}

	@Override
	public int empDelete(String id) throws ClassNotFoundException, SQLException {
		int status=0;
		Connection con=DBconnection.getconnection();
		PreparedStatement ps=con.prepareStatement(deleteEmp);
		
		ps.setString(1, id);
		System.out.println(ps);
		status=ps.executeUpdate();
		return status;
	}


	@Override
	public List<Employee_Pojo> getalldata() throws ClassNotFoundException, SQLException {
		List<Employee_Pojo> elist=new ArrayList<>();
		int status=0;
		Connection con=DBconnection.getconnection();
		PreparedStatement ps=con.prepareStatement(getAll);
		System.out.println(ps);
		ResultSet rs=ps.executeQuery();
		while (rs.next()) {
			Employee_Pojo emp=new Employee_Pojo();
			emp.setId(rs.getString(1));
			emp.setName(rs.getString(2));
			emp.setPass(rs.getString(3));
			emp.setEmail(rs.getString(4));
			emp.setCountry(rs.getString(5));
			elist.add(emp);
		}
		return elist;
	}

	@Override
	public Employee_Pojo getid(String id) throws ClassNotFoundException, SQLException {
		int status=0;
		Connection con=DBconnection.getconnection();
		PreparedStatement ps=con.prepareStatement(getEmp);
		ps.setString(1, id);
		System.out.println(ps);
		ResultSet rs=ps.executeQuery();
		Employee_Pojo emp=new Employee_Pojo();
		while (rs.next()) {
			emp.setId(rs.getString(1));
			emp.setName(rs.getString(2));
			emp.setPass(rs.getString(3));
			emp.setEmail(rs.getString(4));
			emp.setCountry(rs.getString(5));
		}
		return emp;
	}

}

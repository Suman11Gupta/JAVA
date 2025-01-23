package MyPack;
import java.sql.SQLException;
import java.util.List;

public interface DAO {
	 public int saveEmployee(Employee_Pojo employee) throws SQLException,ClassNotFoundException;
	 public int empUpdate(Employee_Pojo employee) throws ClassNotFoundException,SQLException;
	 public int empDelete(String id) throws ClassNotFoundException,SQLException;
	 public List<Employee_Pojo> getalldata() throws ClassNotFoundException,SQLException;
	 public Employee_Pojo getid(String id) throws ClassNotFoundException,SQLException;
}

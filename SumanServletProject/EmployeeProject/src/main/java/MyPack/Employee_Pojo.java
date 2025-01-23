package MyPack;

public class Employee_Pojo {
     String id;
     String name;
     String pass;
     String email;
     String country;
     
    
//	public Employee_Pojo(String id, String name, String pass, String email, String country) {
//		this.id = id;
//		this.name = name;
//		this.pass = pass;
//		this.email = email;
//		this.country = country;
//	}
	
     	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Employee_Pojo [id=" + id + ", name=" + name + ", pass=" + pass + ", email=" + email + ", country="
				+ country + "]";
	}
    
	
}

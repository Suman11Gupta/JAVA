package JSTL;

public class emp {
    
	private int id;
	private String name;
	private String role;
	
	public emp() {
		super();
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "emp [id=" + id + ", name=" + name + ", role=" + role + "]";
	}
	
	
}

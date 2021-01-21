package next.xadmin.login.bean;

public class user {
	protected int id;
	protected String name;
	protected String email;
	protected String department;
	protected String password;
	public user() {
	}
	
	public user(String name, String email, String department,String password) {
		super();
		this.name = name;
		this.email = email;
		this.department = department;
		this.password=password;
	}

	public user(int id, String name, String email, String department,String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.department = department;
		this.password=password;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getdepartment() {
		return department;
	}
	public void setdepartment(String department) {
		this.department = department;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}
}
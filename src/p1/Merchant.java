package p1;

public class Merchant {

	private int mmid;
	private String name,email,password;
	public int getId() {
		return mmid;
	}
	public void setId(int id) {
		this.mmid = id;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Merchant(int mmid, String name, String email, String password) {
		
		super();
		
		this.name = name;
		this.mmid=mmid;
		this.email = email;
		this.password = password;
	}
}

package p1;

public class CExecutive {
	private int eid;
	private String email,password;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
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
	public CExecutive(int eid, String email, String password) {
		super();
		this.eid = eid;
		this.email = email;
		this.password = password;
	}
	public CExecutive() {
		super();
	}
	
}

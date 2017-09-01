package p1;

public class Salesperson {
	private int sid;
	private String email,password;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
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
	public Salesperson(int sid, String email, String password) {
		super();
		this.sid = sid;
		this.email = email;
		this.password = password;
	}
	public Salesperson() {
		super();
	}
	
}

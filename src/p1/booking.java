package p1;

public class booking {
	
	private int did,numtravel,sid,mmid,total;
	private String title,bookdate,CustomerName,CustomerEmail,status,location,fcost,tcost,scost;

	public int getNumtravel() {
		return numtravel;
	}

	public void setNumtravel(int numtravel) {
		this.numtravel = numtravel;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getMmid() {
		return mmid;
	}

	public void setMmid(int mmid) {
		this.mmid = mmid;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getFcost() {
		return fcost;
	}

	public void setFcost(String fcost) {
		this.fcost = fcost;
	}

	public String getTcost() {
		return tcost;
	}

	public void setTcost(String tcost) {
		this.tcost = tcost;
	}

	public String getScost() {
		return scost;
	}

	public void setScost(String scost) {
		this.scost = scost;
	}

	public booking(String title,String customerName,
			String customerEmail,String bookdate, String status, String location,int did) {
		super();
		this.did = did;
		this.title = title;
		this.bookdate = bookdate;
		CustomerName = customerName;
		CustomerEmail = customerEmail;
		this.status = status;
		this.location = location;
	}

	public String getTitle() {
		return title;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBookdate() {
		return bookdate;
	}

	public void setBookdate(String bookdate) {
		this.bookdate = bookdate;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getCustomerEmail() {
		return CustomerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		CustomerEmail = customerEmail;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public booking(int id,String title, String customerName,
			String customerEmail,String bookdate,String status) {
		super();
		this.did=id;
		this.title = title;
		this.bookdate = bookdate;
		CustomerName = customerName;
		CustomerEmail = customerEmail;
		this.status = status;
	}

	public booking(String customerName, String customerEmail,String bookdate,
			String status) {
		super();
		this.bookdate = bookdate;
		CustomerName = customerName;
		CustomerEmail = customerEmail;
		this.status = status;
	}

	public booking(int id, String title2, String date, String name,
			String email, String status2, String hotelname, int sid, int mmid,
			String fcost, String tcost, String scost, int tot, int no) {
			
			did=id;
			this.title=title2;
			CustomerEmail=email;
			CustomerName=name;
			bookdate=date;	this.fcost=fcost; this.scost=scost;	this.tcost=tcost;	total=tot;
			numtravel=no;
			
		
		
		
		// TODO Auto-generated constructor stub
	}

	
	

}

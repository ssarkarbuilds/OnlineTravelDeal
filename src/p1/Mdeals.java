package p1;

public class Mdeals {
	
	
	public Mdeals(String location, int numbooks) {
		super();
		this.location = location;
		this.numbooks = numbooks;
	}
	private String name,email,validf,validt,location;
	private int price,numbooks,mmid;
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
	public String getValidf() {
		return validf;
	}
	public void setValidf(String validf) {
		this.validf = validf;
	}
	public String getValidt() {
		return validt;
	}
	public void setValidt(String validt) {
		this.validt = validt;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNumbooks() {
		return numbooks;
	}
	public void setNumbooks(int numbooks) {
		this.numbooks = numbooks;
	}
	public int getMmid() {
		return mmid;
	}
	public void setMmid(int mmid) {
		this.mmid = mmid;
	}
	public Mdeals(String name, String email, String validf, String validt,
			String location, int price, int numbooks, int mmid) {
		super();
		this.name = name;
		this.email = email;
		this.validf = validf;
		this.validt = validt;
		this.location = location;
		this.price = price;
		this.numbooks = numbooks;
		this.mmid = mmid;
	}
	public Mdeals() {
		super();
	}
	public Mdeals(String location) {
		super();
		this.location = location;
	}
	public Mdeals(String validf, String validt, int price,String location,int mmid) {
		super();
		this.validf = validf;
		this.validt = validt;
		this.price = price;
		this.location=location;
		this.mmid = mmid;
	}
				//(name,0,email,name1,validto,validfrom,p)
	public Mdeals(String location,int numbooks,String email,String name,String validt,String validf,int price)
	{
		this.name = name;
		this.numbooks = numbooks;	
		this.email = email;
		this.validt = validt;	this.validf = validf;	this.price = price;	this.location=location;
	}

		
		
	}
	
	
	
	



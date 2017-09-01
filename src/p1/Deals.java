package p1;

public class Deals {
	
	
	private int did,numtravel,total,sid,mmid,pperchild,pperadult,numbuy;
	public int getPperchild() {
		return pperchild;
	}
	public void setPperchild(int pperchild) {
		this.pperchild = pperchild;
	}
	public int getPperadult() {
		return pperadult;
	}
	public void setPperadult(int pperadult) {
		this.pperadult = pperadult;
	}
	public int getNumbuy() {
		return numbuy;
	}
	public void setNumbuy(int numbuy) {
		this.numbuy = numbuy;
	}
	private String title,location,duration,validf,validt,description,fcost,scost,tcost,image;
	public int getDid() {
		return did;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public int getNumtravel() {
		return numtravel;
	}
	public Deals(int did, int numtravel, int total, int sid, int mmid,
			String title, String location, String duration, String validf,
			String validt, String description, String fcost, String scost,
			String tcost, String image) {
		super();
		this.did = did;
		this.numtravel = numtravel;
		this.total = total;
		this.sid = sid;
		this.mmid = mmid;
		this.title = title;
		this.location = location;
		this.duration = duration;
		this.validf = validf;
		this.validt = validt;
		this.description = description;
		this.fcost = fcost;
		this.scost = scost;
		this.tcost = tcost;
		this.image = image;
	}
	public void setNumtravel(int numtravel) {
		this.numtravel = numtravel;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLocation() {
		return location;
	}
	
	public Deals(int did,String title, String location, String duration,int numtravel,String validf,
			String validt,int total,int sid, int mmid,String image,int numbuy) {
		super();
		this.did = did;
		this.numtravel = numtravel;
		this.total = total;
		this.sid = sid;
		this.mmid = mmid;
		this.title = title;
		this.location = location;
		this.duration = duration;
		this.validf = validf;
		this.validt = validt;
		this.image = image;
		this.numbuy=numbuy;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFcost() {
		return fcost;
	}
	public void setFcost(String fcost) {
		this.fcost = fcost;
	}
	public String getScost() {
		return scost;
	}
	public void setScost(String scost) {
		this.scost = scost;
	}
	public String getTcost() {
		return tcost;
	}
	public void setTcost(String tcost) {
		this.tcost = tcost;
	}
	public Deals(int did,
			String title, String location, String duration,int numtravel,String validf,
			String validt, String description, String fcost, String scost,
			String tcost,int total,int sid, int mmid,String image) {
		super();
		this.did = did;
		this.numtravel = numtravel;
		this.total = total;
		this.sid = sid;
		this.mmid = mmid;
		this.title = title;
		this.location = location;
		this.duration = duration;
		this.validf = validf;
		this.validt = validt;
		this.description = description;
		this.fcost = fcost;
		this.scost = scost;
		this.tcost = tcost;
		this.image=image;
	}
	
	
	//did,title,location,description,duration,numtravel,validf,validt,fcost,scost,tcost,total,image from deals where description=?";
	public Deals(int did,
			String title, String location,String description,String duration,int numtravel,String validf,
			String validt,String fcost, String scost,
			String tcost,int total,String image) {
		super();
		
		this.numtravel = numtravel;
		this.total = total;
		this.did=did;
		this.title = title;
		this.location = location;
		this.duration = duration;
		this.validf = validf;
		this.validt = validt;
		this.description =description;
		this.fcost = fcost;
		this.scost = scost;
		this.tcost = tcost;
		this.image=image;
	}

	
	
	
}

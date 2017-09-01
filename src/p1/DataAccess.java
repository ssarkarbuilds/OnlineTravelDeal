package p1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


//final

public class DataAccess {
	
	private Connection con;
	private PreparedStatement psselect,psbook,psselect5,ps1;
	private PreparedStatement pstmtclogin,pstmtslogin,pstmtcheck,pstmtreg,pstmtshowdeal,pstmtbooking,pstmtgethots,pstmtgethdetails,pstmtinsert,pstmtmlogin;
	private PreparedStatement pstmtselectmerchant,pstmtname,pstmtbook,pstmtaddhotel,pstmtgetcustdeals,pstmtelogin,pstmtshowbookingdetails,pstmtupdatestatus;
	private String sql="select id,name,email,gender,address,phone from customer where email=? and password=?";
	private String sql2="select email from customer",sql3="insert into customer values(?,?,?,?,?,?,?)",sqlbooking="insert into booking values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	private String sql4="select did,title,location,duration,numtravel,validf,validt,total,sid,mmid,image,numbuy from deals where sid=?";
	private String sql5="select did,title,location,duration,numtravel,validf,validt,total,sid,mmid,image from deals where description=?";
	private String sql6="select sid,email,password from Salesperson where email=? and password=?",sqlselect="select name from Customer where email=? and password=?";
	private String sql7="select CustomerName,CustomerEmail,bookdate,status from booking where id=?",sqlgetcustbooking="select did,title,bookdate,CustomerName,CustomerEmail,status from booking where CustomerEmail=?";
	private String sql8="select location from mdeals",sqladdhotel="insert into Mdeals values(?,?,?,?,?,?,?,?)";
	private String sql9="select validf,validt,price,location,mmid from mdeals where location=?",sqlelogin="select eid,email,password from cexecutive where email=? and password=?";;
	private String sql10="insert into deals(did,title,location,duration,numtravel,validf,validt,description,fcost,scost,tcost,total,sid,mmid,image) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	private String sql11="select * from Merchant where email=? and password=?",sqlbookings="select * from booking where location=? and status=?";
	private String sqlmerchant="select location,numbooks from mdeals where email=?",sqlname="select name from mdeals where email=?",sqlupdatestatus="update booking set status=? where customeremail=?";
	private String sqlshowdeals="select did,title,location,description,duration,numtravel,validf,validt,fcost,scost,tcost,total,image from deals where description=?";
	private String sqlselecthotelname="select location from mdeals where mmid=?",sqlselect10="select numbooks from mdeals where email=? and location=?";
	
	public DataAccess() throws SQLException{
		String url="jdbc:mysql://localhost:3306/project",user="root",pass="subhamsql";
		con=DriverManager.getConnection(url,user,pass);
		pstmtclogin=con.prepareStatement(sql);
		pstmtcheck=con.prepareStatement(sql2);
		pstmtreg=con.prepareStatement(sql3);
		pstmtshowdeal=con.prepareStatement(sql4);
		pstmtslogin=con.prepareStatement(sql6);
		pstmtbooking=con.prepareStatement(sql7);
		pstmtgethots=con.prepareStatement(sql8);
		pstmtgethdetails=con.prepareStatement(sql9);
		pstmtinsert=con.prepareStatement(sql10);
		pstmtmlogin=con.prepareStatement(sql11);
		pstmtselectmerchant=con.prepareStatement(sqlmerchant);
		pstmtname=con.prepareStatement(sqlname);
		pstmtbook=con.prepareStatement(sqlbookings);
		pstmtaddhotel=con.prepareStatement(sqladdhotel);
		pstmtgetcustdeals=con.prepareStatement(sqlshowdeals);
		pstmtelogin=con.prepareStatement(sqlelogin);
		pstmtshowbookingdetails=con.prepareStatement(sqlgetcustbooking);
		pstmtupdatestatus=con.prepareStatement(sqlupdatestatus);
		psselect=con.prepareStatement(sqlselect);
		psbook=con.prepareStatement(sqlbooking);
		psselect5=con.prepareStatement(sqlselecthotelname);
		ps1=con.prepareStatement(sqlselect10);
	}
	
	
	public String select(String email,String password)throws SQLException  //prantik's
	{
		psselect.setString(1,email);
		psselect.setString(2,password);
		String name;
		ResultSet rs=psselect.executeQuery();
		if(rs.next())
		{
			name=rs.getString(1);     // returns the name of the User who logged in for displaying onto the webpage.
			
		}
		else
		{
			name= null;
		}
		return name;
		
	}
	public int getno(int mmid,String loc) throws SQLException		//prantik's
	{
		ps1.setInt(1,mmid);
		ps1.setString(2,loc);
		ResultSet rs=ps1.executeQuery();
		int name;
		rs.next();
			name=rs.getInt(1);
		
		
		return name;
	}
	
	public Customer validate(String email,String password) throws SQLException{
		
		pstmtclogin.setString(1,email);
		pstmtclogin.setString(2,password);
		ResultSet s=pstmtclogin.executeQuery();
		
		if(s.next()){
			Customer c=new Customer(s.getInt(1),s.getString(2),s.getString(3),s.getString(4),s.getString(5));
			return c;
		}
		else{
			return null;
		}
			
	}
	public int validate2(String email) throws SQLException{
		int flag=1;
		
		
		ResultSet rs=pstmtcheck.executeQuery();
		if(rs.next()){
			do{
					if(rs.getString(1).equals(email)){
						flag=0;
						break;
					}
				
			}while(rs.next());
		}
		
		else{
			flag=0;
		}
		return flag;
			
	}
	public void register(Customer c) throws SQLException
	{
		pstmtreg.setInt(1,c.getId());
		pstmtreg.setString(2,c.getName());
		pstmtreg.setString(3,c.getEmail());
		pstmtreg.setString(4,c.getGender());
		pstmtreg.setString(5,c.getAddress());
		pstmtreg.setString(6,c.getPassword());
		pstmtreg.setString(7,c.getPhn_number());
		pstmtreg.executeUpdate();
		
		
	}

	
	public ArrayList<Deals> selectdeals(int sid) throws SQLException{
		
		pstmtshowdeal.setInt(1, sid);
		ResultSet rs=pstmtshowdeal.executeQuery();
		ArrayList<Deals> list = null;
		while(rs.next())
		{
			if(list==null)
			{
				list=new ArrayList<>();
			}
				list.add(new Deals(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getString(7),rs.getInt(8),rs.getInt(9),rs.getInt(10),rs.getString(11),rs.getInt(12)));
			
			
		}
		return list;
		
	}
	
	public ArrayList<Deals> selectalldeals(String description) throws SQLException{
			pstmtgetcustdeals.setString(1, description);
			ResultSet rs=pstmtgetcustdeals.executeQuery();
			ArrayList<Deals> list=null;
			while(rs.next())
			{
				if(list==null)
				{
					list=new ArrayList<Deals>();
				}
				list.add(new Deals(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getInt(12),rs.getString(13)));
			}
			return list;
	}
	
 	public Salesperson salespersonvalidate(String email,String password) throws SQLException{
		
		pstmtslogin.setString(1,email);
		pstmtslogin.setString(2,password);
		ResultSet s=pstmtslogin.executeQuery();
		if(s.next()){
			Salesperson c=new Salesperson(s.getInt(1),s.getString(2),s.getString(3));
			return c;
		}
		else{
			return null;
		}
	}
 	
	public void addbookings(booking b) throws SQLException
	{
		psbook.setInt(1,b.getDid());
		psbook.setString(2,b.getTitle());
		psbook.setString(3,b.getBookdate());
		psbook.setString(4,b.getCustomerName());
		psbook.setString(5,b.getCustomerEmail());
		psbook.setString(6,b.getStatus());
		psbook.setString(7,b.getLocation());
		psbook.setInt(8,b.getSid());
		psbook.setInt(9,b.getMmid());
		psbook.setString(10,b.getFcost());
		psbook.setString(11,b.getTcost());
		psbook.setString(12,b.getScost());
		psbook.setInt(13,b.getTotal());
		
		psbook.setInt(15,b.getNumtravel());
		psbook.executeUpdate();
	}
	
	public String gethotelname(int mmid) throws SQLException
	{
		psselect5.setInt(1,mmid);
		ResultSet rs=psselect5.executeQuery();
		String name;
		if(rs.next())
		{
			name=rs.getString(1);
		}
		else
		{
			name=null;
		}
		return name;
	}
	
	
	public ArrayList<booking> showbookings(int id) throws SQLException
	{
			pstmtbooking.setInt(1,id);
			ResultSet rs=pstmtbooking.executeQuery();
			ArrayList<booking> list = null;
			while(rs.next())
			{
				if(list==null)
				{
					list=new ArrayList<>();
				}
					list.add(new booking(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
				
				
			}
			return list;
	}
	
	
	public ArrayList<Mdeals> gethotels() throws SQLException
	{
		ResultSet rs=pstmtgethots.executeQuery();
		ArrayList<Mdeals> list = null;
		
		while(rs.next())
		{
			if(list==null)
				list=new ArrayList<Mdeals>();
			list.add(new Mdeals(rs.getString(1)));
		}
		
		return list;
	}
	
	public Mdeals gethotdetails(String location) throws SQLException
	{
		pstmtgethdetails.setString(1, location);
		ResultSet rs=pstmtgethdetails.executeQuery();
		Mdeals hotel = null;
		
		while(rs.next())
		{
			if(hotel==null)
				hotel=new Mdeals();
			hotel=new Mdeals(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getInt(5));
		}
		
		return hotel;
	}
	
	public void insertdeal(Deals d) throws SQLException
	{
		pstmtinsert.setInt(1,d.getDid());
		pstmtinsert.setString(2,d.getTitle());
		pstmtinsert.setString(3, d.getLocation());
		pstmtinsert.setString(4, d.getDuration());
		pstmtinsert.setInt(5,d.getNumtravel());
		pstmtinsert.setString(6, d.getValidf());
		pstmtinsert.setString(7, d.getValidt());
		pstmtinsert.setString(8, d.getDescription());
		pstmtinsert.setString(9, d.getFcost());
		pstmtinsert.setString(10, d.getScost());
		pstmtinsert.setString(11, d.getTcost());
		pstmtinsert.setInt(12,d.getTotal());
		pstmtinsert.setInt(13, d.getSid());
		pstmtinsert.setInt(14, d.getMmid());
		pstmtinsert.setString(15, d.getImage());
		pstmtinsert.executeUpdate();
	}
	public String select1(String email,String password)throws SQLException
	{
		pstmtmlogin.setString(1,email);
		pstmtmlogin.setString(2,password);
		String name;
		ResultSet rs=pstmtmlogin.executeQuery();
		if(rs.next())
		{
			name=rs.getString(1);
			
		}
		else
		{
			name= null;
		}
		return name;
		
	}
	public ArrayList<Mdeals> selectMerchant(String email) throws SQLException
	{
		pstmtselectmerchant.setString(1,email);
		String name;
		int nob;
		ResultSet rs=pstmtselectmerchant.executeQuery();
		ArrayList<Mdeals> a=new ArrayList<>();
		if(rs.next())
		{
			do
			{
				name=rs.getString(1);
				nob=rs.getInt(2);
				a.add(new Mdeals(name,nob));
			}while(rs.next());
		}
		else
		{
			a=null;
			
		}
		return a;
	}
	public String selectname(String email)throws Exception
	{
		pstmtname.setString(1,email);
		ResultSet rs=pstmtname.executeQuery();
		String name;
		if(rs.next())
		{
			name=rs.getString(1);
		
		}
		else
		{
			name=null;
		}
		return name;
	}
	public ArrayList<booking> getbookingdetails(String hotelname,String status)throws Exception
	{
		pstmtbook.setString(1,hotelname);
		pstmtbook.setString(2,status);
		ArrayList<booking> a=new ArrayList<booking>();
		ResultSet rs=pstmtbook.executeQuery();
		if(rs.next())
		{
			do
			{
				a.add(new booking(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7)));
			}while(rs.next());
		}
		else
		{
			a=null;
		}
		return a;
	}
	public void addHotel(Mdeals c) throws SQLException
	{
		
		
		pstmtaddhotel.setString(1,c.getName());
		pstmtaddhotel.setString(2,c.getEmail());
		pstmtaddhotel.setInt(3,c.getNumbooks());
		pstmtaddhotel.setString(4,c.getValidf());
		pstmtaddhotel.setString(5,c.getValidt());
		pstmtaddhotel.setInt(6,c.getPrice());
		pstmtaddhotel.setString(7,c.getLocation());
		pstmtaddhotel.setInt(8, c.getMmid());
		pstmtaddhotel.executeUpdate();
	}

	public CExecutive customerexecutivevalidate(String email, String password) throws SQLException {
		// TODO Auto-generated method stub
		pstmtelogin.setString(1,email);
		pstmtelogin.setString(2,password);
		ResultSet s=pstmtelogin.executeQuery();
		
		if(s.next()){
			CExecutive c=new CExecutive(s.getInt(1),s.getString(2),s.getString(3));
			return c;
		}
		else{
			return null;
		}
		
	}
	public ArrayList<booking> getcustbookingdetails(String email) throws SQLException{
		
		pstmtshowbookingdetails.setString(1, email);
		
		ResultSet rs=pstmtshowbookingdetails.executeQuery();
		ArrayList<booking> list = null;
		while(rs.next())
		{
			if(list==null)
			{
				list=new ArrayList<>();
			}
				list.add(new booking(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
			
			
		}
		return list;
		
	}

	public void updatestatus(String email, String status) throws SQLException {
		
		
		pstmtupdatestatus.setString(1,status);
		pstmtupdatestatus.setString(2,email);
		pstmtupdatestatus.executeUpdate();
		
	}
	
	
}



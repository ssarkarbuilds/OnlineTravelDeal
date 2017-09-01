package p1;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Confirm_Servlet
 */
@WebServlet("/Confirm_Servlet")
public class Confirm_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Confirm_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession s=request.getSession();
		Deals da=(Deals)s.getAttribute("Deal");
		Object ob=s.getAttribute("name1");
		String name=(String) ob;
		String email=(String) s.getAttribute("email1");
		int tot=(int) s.getAttribute("totalcost1");
		int du=(int) s.getAttribute("duration");
		int no=(int) s.getAttribute("no1");
		String date=(String) s.getAttribute("date1");
		int id=da.getDid();
		String title=da.getTitle();
		String status="waiting";
		try {
			DataAccess d=new DataAccess();
			String hotelname=d.gethotelname(da.getMmid());
			booking b=new booking(id,title,date,name,email,status,hotelname,da.getSid(),da.getMmid(),da.getFcost(),da.getTcost(),da.getScost(),tot,no);
			d.addbookings(b);
			int n=d.getno(da.getMmid(),hotelname);
		//	d.updatestatus(n+1,hotelname);
			response.sendRedirect("confirm.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

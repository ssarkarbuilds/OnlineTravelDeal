package p1;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Customer_registration_servlet
 */
@WebServlet("/CustregisterServlet")
public class CustregisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       																				//final
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustregisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Random r=new Random();
		
		String name=req.getParameter("name");
		String add=req.getParameter("address");
		String gender=req.getParameter("gender");
		String phn=req.getParameter("Phn_number");
		String em=req.getParameter("email");
		String pass=req.getParameter("password");
		Customer c=new Customer(r.nextInt(),name,add,gender,phn,em,pass);
		req.setAttribute("CUSTOMER",c);
		DataAccess d;
		try {
			d = new DataAccess();
			int check=d.validate2(em);
			
			if(check==1){
				RequestDispatcher rd=req.getRequestDispatcher("CreatecustServlet");
				rd.forward(req, res);}
			else
				res.sendError(902, "Error Ocurred Duplicate User");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			res.sendError(902, "Error Ocurred Duplicate User"+e.getMessage());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	}

}

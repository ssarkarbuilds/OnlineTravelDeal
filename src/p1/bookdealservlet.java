package p1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class book_deal_servlet
 */
@WebServlet("/bookdealservlet")
public class bookdealservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bookdealservlet() {
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
	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String duration=req.getParameter("du");
		String Noofperson=req.getParameter("no");
		String date=req.getParameter("da");
		int n=Integer.parseInt(Noofperson);
		int du1=Integer.parseInt(duration);
		String food=req.getParameter("food");
		HttpSession s=req.getSession();
		Deals d=(Deals) s.getAttribute("Deal");
		int totalcost;
		if(food=="yes")
		{	
			totalcost=(Integer.parseInt(d.getScost()) *du1)+(n*(Integer.parseInt(d.getFcost())+Integer.parseInt(d.getTcost())));
			
		}
		else
		{
			totalcost=(Integer.parseInt(d.getScost()) *du1)+(n*Integer.parseInt(d.getTcost()));
		}
		s.setAttribute("totalcost1",totalcost);
		s.setAttribute("duration",du1);
		s.setAttribute("no1",n);
		s.setAttribute("date1",date);
		response.sendRedirect("confirmbooking.jsp");
	}

}

package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormDataServlet
 */
@WebServlet("/FormDataServlet")
public class FormDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormDataServlet() {
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
		 	
		PrintWriter out=response.getWriter();
		
		int fcost=Integer.parseInt(request.getParameter("fcost"));
		int tcost=Integer.parseInt(request.getParameter("tcost"));
		int sid=Integer.parseInt(request.getParameter("sid"));
		int scost=Integer.parseInt(request.getParameter("scost"));
		int numtravel=Integer.parseInt(request.getParameter("numtravel"));
		int total=numtravel*(fcost+tcost+scost);
		
		String ffcost=""+fcost; String ttcost=""+tcost; String sscost=""+scost; 
		
	
		Deals d=new Deals(Integer.parseInt(request.getParameter("did")),request.getParameter("title"),request.getParameter("location"),request.getParameter("duration"),
				numtravel,request.getParameter("validf"),request.getParameter("validt"),request.getParameter("des"),ffcost,
				sscost,ttcost,total,sid,Integer.parseInt(request.getParameter("mmid")),request.getParameter("image"));
		
		try {
			DataAccess da=new DataAccess();
			da.insertdeal(d);
			out.println("<h1>Successfully entered</h1>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		  
		  
		
		
	}

}

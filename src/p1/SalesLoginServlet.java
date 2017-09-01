package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SalesLoginServlet
 */
@WebServlet("/SalesLoginServlet")
public class SalesLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SalesLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter p=response.getWriter();
		p.println("<html><title>Authentication</title><body>");
		String name=request.getParameter("user");
		String pass1=request.getParameter("pass");
		DataAccess da;
		try {
			da = new DataAccess();
			Salesperson c=da.salespersonvalidate(name,pass1);
			
			if(c!=null){
				p.println(c.getSid());
				p.println("<h3>SUCESSFULLY LOGGED IN,WELCOME:"+c.getEmail()+"</h3>");
				/*HttpSession session=request.getSession(true);
				session.setAttribute("SID", c.getSid());
				sessio*/
				response.sendRedirect("salesoption.jsp?name="+c.getEmail()+"&sid="+c.getSid());
				//response.sendRedirect("selectalldeals?name="+c.getEmail());
				
			}
			else
			{
				p.println("<h6>LOGIN FAILURE</h6>");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.println("</body></html>");
		p.close();
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
		


	}



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
 * Servlet implementation class custlogin
 */
@WebServlet("/custlogin")
public class custlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       														//FINAL
    /**
     * @see HttpServlet#HttpServlet()
     */
    public custlogin() {
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
		
		response.setContentType("text/html");
		PrintWriter p=response.getWriter();
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");
		p.println("<html><title>test</title>");
		
																					//FINAL
		try {
			DataAccess da=new DataAccess();
			Customer c=da.validate(email,pass);
			
			if(c!=null){
				request.setAttribute("name", email);
				response.sendRedirect("ShowcustdealsServlet?name="+email);
				
			}
			else{
				p.println("<body>");
				p.println("<h2>Invalid User</h2>");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			p.println("<h2>ERROR : "+e.getMessage()+"</h2>");
		}
		p.println("</body></html>");
		p.close();
	}

}

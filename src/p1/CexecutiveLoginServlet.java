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
 * Servlet implementation class CexecutiveLoginServlet
 */
@WebServlet("/CexecutiveLoginServlet")
public class CexecutiveLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CexecutiveLoginServlet() {
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
		
		
		
		String name=request.getParameter("user");
		String pass=request.getParameter("pass");
		DataAccess da;
		try {
			da = new DataAccess();
			CExecutive c=da.customerexecutivevalidate(name,pass);
			if(c!=null){
				//p.println("<h3>SUCESSFULLY LOGGED IN,WELCOME:"+c.getEmail()+"</h3>");
				response.sendRedirect("Cexecutiveform.html");
			}
			else
			{
				response.sendError(902, "Error Occurred");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		}

	}



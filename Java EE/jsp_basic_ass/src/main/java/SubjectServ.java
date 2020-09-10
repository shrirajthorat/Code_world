

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SubjectServ
 */
public class SubjectServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String sub=request.getParameter("Subject");
		
		if(sub.equalsIgnoreCase("java"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("j2se.jsp");
			rd.forward(request, response);
		}else if(sub.equalsIgnoreCase("c++"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("cplusplus.jsp");
			rd.forward(request, response);
		}else
		{
			RequestDispatcher rd=request.getRequestDispatcher("oracle.jsp");
			rd.forward(request, response);
		}
				
		
	}

}



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CareerServ
 */
public class CareerServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
	
		mypack.CareerExpert c=new mypack.CareerExpert();
		String s=(String) request.getParameter("qual");
	
		 String q=c.getadvice(s);
		/*PrintWriter pw=response.getWriter();
		pw.println(s);*/
		 request.setAttribute("str",q);
		 RequestDispatcher rd=request.getRequestDispatcher("CareerDetails.jsp");
		 rd.forward(request, response);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

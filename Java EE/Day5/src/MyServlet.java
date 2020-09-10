

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List l=new ArrayList();
		l.add("Ganesh");
		l.add("Nihir");
		l.add("Tushank");
		l.add("Ojas");
		l.add("Prasanna");
		
		HttpSession session=request.getSession();
		session.setAttribute("ArrayList", l);
		PrintWriter pw=response.getWriter();
		pw.println("Session created");
		
	}

}

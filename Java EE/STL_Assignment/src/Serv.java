

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Serv
 */
@WebServlet("/Serv")
public class Serv extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
		Person p1=new Person();
		p1.setName("abc");
		p1.setAge(20);
		
		Person p2=new Person();
		p2.setName("Xyz");
		p2.setAge(25);
		
	
	List<Person> personlist=new ArrayList<Person>();
	personlist.add(p1);
	personlist.add(p2);
	
	request.setAttribute("myList", personlist);
	RequestDispatcher rd=request.getRequestDispatcher("Result.jsp");
	rd.forward(request, response);
	PrintWriter pw=response.getWriter();
	pw.println(personlist);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

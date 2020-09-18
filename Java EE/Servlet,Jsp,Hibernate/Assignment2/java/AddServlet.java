

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mypack.Student;
import mypack.StudentDAO;
import mypack.StudentDAODataImpl;
import mypack.StudentDAOFileImpl;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		StudentDAO sdao;
		PrintWriter pw=response.getWriter();
		Student s=new Student();
		s.setName(request.getParameter("name"));
		s.setAddress(request.getParameter("add"));
		String c=request.getParameter("Persistent");
		if(c.equalsIgnoreCase("file"))
		{	
			 s.setRollno(Integer.parseInt( request.getParameter("no")));
			 StudentDAOFileImpl f=new StudentDAOFileImpl();
			f.addStudent(s);
			pw.println("Object persisted inside inside file");
		}else
		{
			StudentDAODataImpl d=new StudentDAODataImpl();
			d.addStudent(s);
			pw.println("Object persisted inside inside database");
		}
		
	}

}

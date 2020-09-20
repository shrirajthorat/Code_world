

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.*;

import mypack.*;

/**
 * Servlet implementation class CourseServ
 */
@WebServlet("/CourseServ")
public class CourseServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	private Session	session;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
        try { 
        	session = HibernateUtil.getSessionFactory().openSession(); 
            Transaction transaction = null; 
            transaction = session.beginTransaction(); 

            Module m1=new Module(request.getParameter("m1"));
            Module m2=new Module(request.getParameter("m2"));
            Module m3=new Module(request.getParameter("m3"));
           Set<Module> h=new HashSet<Module>();
           h.add(m1);
           h.add(m2);
           h.add(m3);
     String name=request.getParameter("name");
    double fee= (double)Integer.parseUnsignedInt(request.getParameter("fee"));
           Course c=new Course(name,fee,h);
           session.save(c);
           transaction.commit(); 
            System.out.println("done with entering in db");  
             }
        catch(Exception ee)
        {
        	System.out.println("in catch\t"+ee);
        }
	}

}

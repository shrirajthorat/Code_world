

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.criteria.CriteriaQuery;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import mypack.Course;
import mypack.HibernateUtil;
import mypack.Module;

/**
 * Servlet implementation class ShowServ
 */
@WebServlet("/ShowServ")
public class ShowServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	private Session	session;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 try { 
	        	session = HibernateUtil.getSessionFactory().openSession(); 
	            Transaction transaction = null; 
	            transaction = session.beginTransaction(); 
	            
	            CriteriaQuery<Course> criteria=session.getCriteriaBuilder().createQuery(Course.class);
	            criteria.from(Course.class);
	            System.out.println("Now calling list method");
	            List<?> results = session.createQuery(criteria).getResultList();
	            
	            
	            /*Query<?> query=session.createQuery("from Course");
				List<?> mylist1=query.list();*/
				request.setAttribute("l", results);
				RequestDispatcher rd=request.getRequestDispatcher("Del.jsp");
				rd.forward(request, response);
	            
	             }
	        catch(Exception ee)
	        {
	        	System.out.println("in catch\t"+ee);
	        }
	}

}

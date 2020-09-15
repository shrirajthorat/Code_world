

import java.io.IOException;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import mypack.HibernateUtil;
import mypack.Register;

/**
 * Servlet implementation class ViewServ
 */
@WebServlet("/ViewServ")
public class ViewServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	Session session = HibernateUtil.getSessionFactory().openSession(); 
    Transaction tx = null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try
		{
			tx=session.beginTransaction();
	
			Query<?> query=session.createQuery("from Register");
			List<Register> mylist1=(List<Register>) query.list();
			
			request.setAttribute("Shree", mylist1);
			RequestDispatcher rd=request.getRequestDispatcher("ViewRegister.jsp");
			rd.forward(request, response);
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		
		
	}

}

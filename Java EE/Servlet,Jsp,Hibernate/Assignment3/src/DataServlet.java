

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import mypack.Dept;
import mypack.HibernateUtil;


/**
 * Servlet implementation class DataServlet
 */
@WebServlet("/DataServlet")
public class DataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	private Session session;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
		 session = HibernateUtil.getSessionFactory().openSession(); 
        Transaction transaction = null; 
        String location=request.getParameter("loc");
        Query<?> query=session.createQuery("from Dept d where d.loc=:str");
        
        query.setParameter("str",location);
    	List<Dept> mylist1=(List<Dept>) query.list();
    	request.setAttribute("list", mylist1);
    	RequestDispatcher rd=request.getRequestDispatcher("Data.jsp");
		rd.forward(request, response);
        
 	}
    catch(Exception ee)
    {
    	System.out.println("in catch\t"+ee);
    }
	}

}

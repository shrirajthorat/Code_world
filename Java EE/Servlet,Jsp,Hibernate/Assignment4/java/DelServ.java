

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import mypack.HibernateUtil;

/**
 * Servlet implementation class DelServ
 */
@WebServlet("/DelServ")
public class DelServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */private Session session;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			int id=Integer.parseInt(request.getParameter("id"));
			 session = HibernateUtil.getSessionFactory().openSession(); 
			Transaction transaction = session.beginTransaction(); 
			Query<?> query=session.createQuery("delete from Module m where mid=:abc");
			query.setParameter("abc",id);
			int k=query.executeUpdate();
			//transaction.commit();
			
			Query<?> q=session.createQuery("delete from Course c where COURSEID=:abc");
			q.setParameter("abc",id);
			int k1=q.executeUpdate();
			transaction.commit();
			PrintWriter pw=response.getWriter();
			pw.println("id selected is\t"+id);
			System.out.println("done completely");
			
		}catch(Exception ee)
        {
        	System.out.println("in catch\t"+ee);
        }
	}

}

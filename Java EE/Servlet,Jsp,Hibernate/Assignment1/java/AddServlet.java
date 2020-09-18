

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import mypack.HibernateUtil;
import mypack.Product;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	private Session session;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
		session = HibernateUtil.getSessionFactory().openSession(); 
		Product p=new Product();
		p.setPname(request.getParameter("name"));
		p.setPrice(Integer.parseInt(request.getParameter("price")));
		p.setQty(Integer.parseInt(request.getParameter("number")));
		
		session.save(p);
		Transaction t=session.beginTransaction();
		t.commit();
		session.close();
		
		RequestDispatcher rd=request.getRequestDispatcher("Home.jsp");
		rd.forward(request, response);
		
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

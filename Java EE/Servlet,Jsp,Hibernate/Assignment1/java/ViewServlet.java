

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.*;

import mypack.HibernateUtil;
import mypack.Product;

/**
 * Servlet implementation class ViewServlet
 */
@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	private Session session;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		session = HibernateUtil.getSessionFactory().openSession(); 
		Query<?> query=session.createQuery("from Product");
		List<Product> mylist1=(List<Product>) query.list();
		request.setAttribute("list", mylist1);
		RequestDispatcher rd=request.getRequestDispatcher("View.jsp");
		rd.forward(request, response);
	}

}

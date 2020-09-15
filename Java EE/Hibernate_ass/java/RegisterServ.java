

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.Transaction;

import mypack.HibernateUtil;
import mypack.Register;

/**
 * Servlet implementation class RegisterServ
 */
@WebServlet("/RegisterServ")
public class RegisterServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

	private Session session;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try
		{
			session = HibernateUtil.getSessionFactory().openSession(); 
			
			System.out.println("on console??");
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			String name=request.getParameter("name");
			String Emailid=request.getParameter("Email-id");
			String Login=request.getParameter("Login");
			String Password=request.getParameter("Password");
			
			Register r=new Register();
			r.setName(name);
			r.setPassword(Password);
			r.setEmailId(Emailid);
			r.setLogin(Login);
			
			Transaction tx =  session.beginTransaction();
			session.save(r);
			tx.commit();
			session.close();
			out.println("Done with Register");
		}
		catch(Exception ee)
		{
			System.out.println("in service  "+ee);
		}
	}

}

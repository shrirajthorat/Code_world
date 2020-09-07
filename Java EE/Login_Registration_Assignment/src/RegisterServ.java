import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.naming.NamingException;
import javax.naming.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServ
 */
@WebServlet("/RegisterServ")
public class RegisterServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection conn;
	
	public void init() throws ServletException
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3305/login_data";
			conn=DriverManager.getConnection(url,"root","root");
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("fname");
		String Address =request.getParameter("Address");
		String Email=request.getParameter("Email");
		String Login =request.getParameter("Login");
		String Password=request.getParameter("Password");

		PreparedStatement pst=conn.prepareStatement("insert into data values(?,?,?,?,?)");
		pst.setString(1,name);
		pst.setString(2,Address);
		pst.setString(3,Email);
		pst.setString(4,Login);
		pst.setString(5,Password);
		
		int k=pst.executeUpdate();
		if(k>0)
		{
			pw.println("Record has been added");
		}
		else
		{
			pw.println("cannot add");
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

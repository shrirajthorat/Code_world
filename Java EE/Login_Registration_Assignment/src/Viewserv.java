

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Viewserv
 */
@WebServlet("/Viewserv")
public class Viewserv extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	private Connection conn;
	public void init(ServletConfig config) throws ServletException {
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
		        pw.println("Registerd Names");
		        pw.println("<br>");
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("select * from data");
			 pw.println("<table style='width:100%'>");
			 pw.println("<tr>");
				 pw.println("<th>Name</th>");
				 pw.println("<th>Address</th>");
				 pw.println("<th>Email</th>");
				 pw.println("<th>Login_ID</th>&nbsp;&nbsp;");
				 pw.println("<th>Password</th>");
			pw.println("</tr>");
			while(rs.next())
			{	
				pw.println("</tr>");
				pw.println("<td>"+rs.getString(1)+"&nbsp;&nbsp;</td>");
				pw.println("<td>"+rs.getString(2)+"&nbsp;&nbsp;</td>");
				pw.println("<td>"+rs.getString(3)+"&nbsp;&nbsp;</td>");
				pw.println("<td>"+rs.getString(4)+"&nbsp;&nbsp;</td>");
				pw.println("<td>"+rs.getString(5)+"&nbsp;&nbsp;</td>");
				pw.println("</tr>");
			}
			pw.println("</table>");
		}catch(Exception ee)
		{
			System.out.println(ee);
		}
	}

}

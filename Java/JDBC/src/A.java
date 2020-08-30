import java.sql.*;
public class A {

	public static void main(String[] args) {
		
		String ss="jdbc:mysql://localhost:3305/mydb";
		try(Connection con=DriverManager.getConnection(ss,"root","root");)
		{
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from student");
			while(rs.next())
			{
				int no=rs.getInt("rollno");
				String name=rs.getString("name");
				String age=rs.getString("age");
				System.out.println(no+"\t"+name+"\t"+age);
			}
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
		
	}

}

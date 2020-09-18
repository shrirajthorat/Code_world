package mypack;

import org.hibernate.*;

public class StudentDAODataImpl implements StudentDAO {

	private SessionFactory sf;
	private Session session;
	
	public StudentDAODataImpl()
	{
		sf=HibernateUtil.getSessionFactory();
	}
	
	@Override
	public void addStudent(Student s) {
		
		 session=sf.openSession();
		   Transaction trans=session.beginTransaction();
		   session.save(s);
		   trans.commit();
		   session.close();
	}

}

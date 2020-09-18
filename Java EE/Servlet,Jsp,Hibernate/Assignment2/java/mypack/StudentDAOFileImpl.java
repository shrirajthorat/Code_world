package mypack;

import java.io.*;

public class StudentDAOFileImpl implements StudentDAO{

	@Override
	public void addStudent(Student s) {
		
		try
		{
			FileOutputStream fos=new FileOutputStream("d:\\DAO.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(s);
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}

}

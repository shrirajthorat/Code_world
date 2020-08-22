import java.io.*;
import java.util.*;

class Employee implements Serializable {
	int empid;
	String empname,designation;
	public Employee(int empid, String empname, String designation) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.designation = designation;
	}
	public String disp()
	{
		return empid+" "+empname+" "+designation;
	}
}
public class File {

	public static void main(String[] args) {
			
		List l=new ArrayList();
		l.add(new Employee(1,"ABC","Sales"));
		l.add(new Employee(2,"DSF","Accountant"));
		l.add(new Employee(3,"wee","Manager"));
		l.add(new Employee(4,"uip","Boss"));
		
		try(FileOutputStream fos=new FileOutputStream("d:\\ab1.txt"))
		{
		try(ObjectOutputStream oos=new ObjectOutputStream(fos))
		{
		oos.writeObject(l); //Serialization
		System.out.println("Written inside file");
		}
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		
		try(FileInputStream fis=new FileInputStream("d:\\ab1.txt"))
		{
		try(ObjectInputStream ois=new ObjectInputStream(fis))
		{
			List l1=(List) ois.readObject();
			Iterator itr=l1.iterator();
			while(itr.hasNext())
			{
				System.out.println(((Employee) itr.next()).disp());
			}
		}
		}
	catch(Exception ee)
	{
		ee.printStackTrace();
	}
	}

}

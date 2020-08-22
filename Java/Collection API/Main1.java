import java.util.*;
import java.io.*;

class Employee implements Serializable {
	private int empid;
	private String name;
	private double salary;

	Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "[" + empid + " " + name + " " + salary + "]";
	}
}

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee m1 = new Employee(100, "ABC", 10000);
		Employee m2 = new Employee(200, "MNC", 20000);
		Employee m3 = new Employee(300, "XYZ", 30000);
		Employee m4 = new Employee(400, "WER", 40000);

		List l = new ArrayList();
		l.add(m1);
		l.add(m2);
		l.add(m3);
		l.add(m4);

		Iterator itr=l.iterator(); 
		  while(itr.hasNext()) 
		  {
			  System.out.println(itr.next()); 
		  } 
		
		  try(FileOutputStream fos=new FileOutputStream("d:\\abcde.txt"))
		  {
			  try(ObjectOutputStream oos=new ObjectOutputStream(fos)) 
			  { 
				  oos.writeObject(l);
			  }
		   System.out.println("Written inside file");
		  }
		  catch(Exception ee) 
		  {
			  ee.printStackTrace(); 
		  }
		  
		  try(FileInputStream fis=new FileInputStream("d:\\abcde.txt"))
		  {
			  try(ObjectInputStream ois=new ObjectInputStream(fis)) 
			  {
				  System.out.println(ois.readObject());
				 }
			  } 
		  catch(Exception ee) 
		  {
			  ee.printStackTrace(); 
		  }
		
	}

}


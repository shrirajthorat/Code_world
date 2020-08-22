import java.io.*;

class Customer implements Serializable{
	int custid;
	String custname;
	String address;
	int age;
	public Customer(int custid, String custname, String address, int age) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.address = address;
		this.age = age;
	}
	
	public String toString()
	{
		return "["+custid+" "+custname+" "+address+" "+age+"]";
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c=new Customer(1,"Shree","At posd sd ",23);
		
		try(FileOutputStream f=new FileOutputStream("d:\\serializable.txt"))
		{
			try(ObjectOutputStream oos=new ObjectOutputStream(f))
			{
				oos.writeObject(c);
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		try(FileInputStream i=new FileInputStream("d:\\serializable.txt"))
		{
			try(ObjectInputStream ois=new ObjectInputStream(i))
			{
				Customer s=(Customer)ois.readObject();
				System.out.println(s);
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}

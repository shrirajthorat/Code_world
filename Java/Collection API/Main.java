import java.util.*;
import java.io.*;
class MyNum implements Serializable{
	private int num;
	MyNum (int num)
	{
		this.num=num;
	}
	@Override
	public String toString() {
		return "[" + num+ "]";
	}
}

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNum m1=new MyNum(100);
		MyNum m2=new MyNum(200);
		MyNum m3=new MyNum(300);
		MyNum m4=new MyNum(400);
		
		List<MyNum> l=new ArrayList<MyNum>();
		l.add(m1);
		l.add(m2);
		l.add(m3);
		l.add(m4);
		
		System.out.println(l);
		
		try(FileOutputStream fos=new FileOutputStream("d:\\abcd.txt"))
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
		
		try(FileInputStream fis=new FileInputStream("d:\\abcd.txt"))
		{
		try(ObjectInputStream ois=new ObjectInputStream(fis))
		{
			List<MyNum> l1=(List<MyNum>) ois.readObject();
			Iterator itr=l1.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		}
		}
	catch(Exception ee)
	{
		ee.printStackTrace();
	}
	}

}

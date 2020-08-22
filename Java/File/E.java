import java.io.*;
import java.util.*;
public class E
{
	public static void main(String args[])
	{
		try(FileOutputStream fos=new FileOutputStream("d:\\dataOPStream.txt"))
		{
			try(DataOutputStream dos=new DataOutputStream(fos))
			{	
				int n;
				Scanner s=new Scanner(System.in);
				while((n = s.nextInt())!= 0)
				{
					dos.writeInt(n);
				}
				
				
			}
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}
		
		try(FileInputStream fis=new FileInputStream("d:\\dataOPStream.txt"))
		{
			try(DataInputStream dis=new DataInputStream(fis))
			{
				while(true){
				System.out.println(dis.readInt());
				k--;
				}
			}
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}

	}
}
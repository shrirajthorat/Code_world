//copying of file through byte stream
import java.io.*;
public class D{

	public static void main(String args[])
	{
		byte b[]=null;
		try(FileInputStream fr=new FileInputStream("d:\\z.txt"))
		{
			 b=new byte[(int)new File("d:\\z.txt").length()];
			fr.read(b);
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		try(FileOutputStream f=new FileOutputStream ("d:\\copyOfStreambyte.txt",true))
		{
			int k=(int)new File("d:\\z.txt").length();
			f.write(b,0,k);
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}
		System.out.println("File copied sucesfully");
	}
}
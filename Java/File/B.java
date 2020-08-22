import java.io.*;
public class B{

	public static void main(String args[])
	{
		char arr1[]=null;
		try(FileReader fr=new FileReader("d:\\z.txt"))
		{
			arr1=new char[(int)new File("d:\\z.txt").length()];
			fr.read(arr1);
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		try(FileWriter f=new FileWriter("d:\\copyOfUnicode.txt"))
		{
			f.write(arr1);
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}
		System.out.println("File copied sucesfully");
	}
}
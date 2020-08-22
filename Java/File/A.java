//Reading and writing from the file through scanner
import java.io.*;
import java.util.*;
public class A{

	public static void main(String args[])
	{
		char arr1[]=null;
		/*try(FileWriter f=new FileWriter("d:\\z.txt"))
		{
			System.out.println("Enter 10 char");
			
			
			for(int i=0;i<10;i++)
			{ 	Scanner s=new Scanner(System.in);
				char a=s.next().charAt(0);
				f.write(a);
			}
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}*/
		try(FileReader fr=new FileReader("d:\\z.txt"))
		{

		arr1=new char[(int)new File("d:\\z.txt").length()];
		fr.read(arr1);
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
	}
}
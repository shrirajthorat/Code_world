public class While_Demo
{
	public static void main(String[] args)
	{
		int a=3;
		// Pre-Test Loop
		while(a<30)
		{
			a++;
			if(a==24)
			{
				continue;
			}
			System.out.println(a);
			
		}
	}
}
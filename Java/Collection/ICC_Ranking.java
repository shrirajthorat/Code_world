import java.util.*;

public class ICC_Ranking {

	public static void main(String[] args) {
		
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(1,"Rohit");
		m.put(3,"KL_Rahul");
		m.put(2,"Kohli");
		m.put(5,"Dhoni");
		m.put(4,"Dhawan");
		System.out.println("Enter any rank bet 1 to 5" );
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		
		System.out.println(m.get(a));
	}

}

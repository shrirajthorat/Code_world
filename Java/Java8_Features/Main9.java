interface myInterface{
	void fun(char a,int b);
}
class Someclass{
	void disp(char a,int b)
	{
		System.out.println(a +" "+ b);
	}
}
public class Main9 {

	public static void main(String[] args) {
		Someclass s=new Someclass();
		myInterface m=(a,b)->{
			System.out.println("Inside Lamda exp");
			s.disp('a',5);
			
		};
		System.out.println(m.getClass().getName());
		m.fun('a', 5);
		
		myInterface m1=s::disp;
		m1.fun('b', 10);
		System.out.println(m1.getClass().getName());
	}

}

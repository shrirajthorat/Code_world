interface A{
	
	default void fun()
	{
		System.out.println("Inside fun of A");
	}
}
interface B {
	default void fun()
	{
		System.out.println("Inside fun of B");
	}
}
class C implements A,B{

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		System.out.println("Inside fun of C");
	}
	
}
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c=new C();
		c.fun();
		
	}

}

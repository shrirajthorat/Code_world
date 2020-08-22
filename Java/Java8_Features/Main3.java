interface Second{
	void abs();
	default void f()
	{
		System.out.println("inside Second");
	}
}
class sub1 implements Second{
	
	public void f()
	{
		Second.super.f();
		System.out.println("inside sub1");
	}

	@Override
	public void abs() {
		// TODO Auto-generated method stub
		System.out.println("Inside abs");
	}
}
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sub1 s=new sub1();
		s.abs();
		s.f();
	}

}

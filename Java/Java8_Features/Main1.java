interface First{
	void f1();
	default void f()
	{
		System.out.println("Inside interface default");
	}
}
class Sub implements First{

	@Override
	public void f1() {
		// TODO Auto-generated method stub
		System.out.println("Inside Sub");
	}
	
}
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub s=new Sub();
		s.f();
		s.f1();
	}

}

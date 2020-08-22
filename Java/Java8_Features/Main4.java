class Base{
	public void disp()
	{
		System.out.println("Base");
	}
}
interface myIntrface{
	default void disp()
	{
		System.out.println("myInterface");
	}
}
class Sub2 extends Base implements myIntrface{
	
}
public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub2 s=new Sub2();
		s.disp();
	}

}

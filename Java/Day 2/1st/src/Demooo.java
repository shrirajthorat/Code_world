class A{
    private int a=10;
    private static int q;
    static {
    	System.out.println("inside A");
    }
	public int getA() {
		return a;
	}
	public static int getQ() {
		return q;
	}
}
class B{
	private int b=20;
	private static int w=50;
	 static {
	    	System.out.println("inside B");
	    }
	public int getB() {
		return b;
	}
	
	public static int getW() {
		return w;
	}
}
class C{
	private int c;
	 static {
	    	System.out.println("inside C");
	    }
	public int getC() {
		return c;
	}
}
public class Demooo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		System.out.println(a.getA()+" "+a.getQ());
		B b=new B();
		System.out.println(b.getB()+" "+b.getW());
		C c=new C();
		System.out.println(c.getC());
		
	}

}
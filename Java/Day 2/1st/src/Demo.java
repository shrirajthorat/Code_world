class Myclass{
	private int a;
	private int b;
	
	public Myclass() {
		super();
		System.out.println(" inside without any argument ctor");
	}
	public Myclass(int a) {
		super();
		this.a = a;
		System.out.println(" inside one argument ctor :"+a);
	}
	public Myclass(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println(" inside two argument ctor :"+a+" "+b);
	}
	
	
}
public class Demo {

	public static void main(String[] args) {
		Myclass m=new Myclass();
		Myclass m1=new Myclass(10);
		Myclass m2=new Myclass(10,20);
	}

}

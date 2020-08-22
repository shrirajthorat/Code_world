interface MyAlgo{
	static void sqrt(int k)
	{
		System.out.println("sqrt");
	}
	static void add(int a,int b)
	{
		System.out.println("add");
	}
	static void product()
	{
		System.out.println("product");
	}
}
public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAlgo.add(5,7);
		MyAlgo.product();
		MyAlgo.sqrt(5);
	}

}

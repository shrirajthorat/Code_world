interface Base1 {
	int product(int a,int b);
}
public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Base1 b=(a,c)->{ return a*c;};
			System.out.println(b.product(5, 7));

}
}
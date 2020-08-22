interface Alpha{
	void perform();
}
class Myclass implements Alpha {
	static Myclass getAlpha()
	{
		return new Myclass();
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Inside myclass");
	}
}
public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alpha a=Myclass.getAlpha();
		a.perform();
	}

}

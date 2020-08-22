import java.util.*;

interface Game{
	void play();
}
class cricket implements Game{

	@Override
	public void play() {
		System.out.println("In crirket");
	}
	
}
class Swimming implements Game{

	@Override
	public void play() {
		System.out.println("In Swimming");
	}
	
}
class football implements Game{

	@Override
	public void play() {
		System.out.println("In football");
	}
	
}
public class Main {
	static void disp(List<? extends Game> g)
	{
		for(Game l:g)
		{
			l.play();
		}
	}
	
	public static void main(String[] args) {
		List<cricket> c=new ArrayList<cricket>();
		c.add(new cricket());
		c.add(new cricket());
		List<Swimming> s=new ArrayList<Swimming>();
		s.add(new Swimming());
		List<football> f=new ArrayList<football>();
		f.add(new football());
		disp(c);
		disp(s);
		disp(f);
	}

}

import java.util.*;
import java.util.Map.Entry;

public class HashMp {

	public static void main(String[] args) {
			
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(1,"ABC");
		m.put(2,"QWE");
		m.put(3,"ZXC");
		m.put(4,"MNB");
		m.put(5,"LKJ");
		m.put(6,"POI");
		m.put(7,"JKL");
		m.put(8,"FGH");
		m.put(9,"ABC");
		m.put(10,"AdBC");
		
		Set<Entry<Integer,String>> s=m.entrySet();
		Iterator<Entry<Integer,String>> itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer,String> me=(Entry<Integer,String>)itr.next();
			System.out.print(me.getKey()+" ");
			System.out.println(me.getValue());
		}

	}

}

import java.util.*;

public class Player {

	int playerid;
	String name;
	int runs;
	String countryname;
	
	public Player(int playerid, String name, int runs, String countryname) {
		super();
		this.playerid = playerid;
		this.name = name;
		this.runs = runs;
		this.countryname = countryname;
	}
	
	public int getRuns() {
		return runs;
	}

	public String getName() {
		return name;
	}

	public String getCountryname() {
		return countryname;
	}

	public static void main(String[] args) {
		List<Player> list=new ArrayList();
		list.add(new Player(1,"Sachine",10000,"India"));
		list.add(new Player(2,"Watson",80000,"Aus"));
		list.add(new Player(1,"Virat",15000,"India"));
		list.add(new Player(1,"Decock",70000,"S.Africa"));
		list.add(new Player(1,"Rohit",10000,"India"));
		list.add(new Player(1,"Dhoni",11000,"India"));
		list.add(new Player(1,"Pointing",4000,"Aus"));
		list.add(new Player(1,"Dravid",9000,"India"));
		list.add(new Player(1,"Shahid",0,"Pak"));
		list.add(new Player(1,"Raina",10000,"India"));
		
		System.out.println("players from India are : ");
		list.stream().filter(ref->ref.getCountryname().equals("India")).forEach(ref->System.out.println(ref.getName()));
		System.out.println();
		int a=(int)list.stream().filter(ref->ref.getRuns()>5000).count();
		System.out.println("no. of players scored more than 5000 runs is : "+a);
	}

}

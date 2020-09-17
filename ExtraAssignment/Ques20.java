/*"Consider List of T20 Players.
Player (playerid,Name,Country,team)
e.g. (1,”MSDhoni”,”India”,”Chennai Super Kings”)
Then find out which team has maximum Australian players."
*/
package ExtraAssignment;
import java.util.*;


class T_20Players {
	
	int playerid;
	String name;
	String country;
	String team;
	
	public T_20Players() {
	}
	
	public T_20Players(int playerid, String name, String country, String team) {
		super();
		this.playerid = playerid;
		this.name = name;
		this.country = country;
		this.team = team;
	}

	public int getPlayerid() {
		return playerid;
	}

	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	
	@Override
	public String toString() {
		return "Player [playerid=" + playerid + ", name=" + name + ", country=" + country + ", team=" + team + "]";
	}
}
public class Ques20 {

public static void main(String[] args) {
		
		T_20Players p1=new T_20Players(1, "MSDhoni", "India", "Chennai Super Kings");
		T_20Players p2=new T_20Players(2, "Suresh Raina", "India", "Chennai Super Kings");
		T_20Players p3=new T_20Players(3, "Faf Du Plesis", "Australia", "Chennai Super Kings");
		T_20Players p4=new T_20Players(4, "Murli Vijay", "India", "Chennai Super Kings");
		T_20Players p5=new T_20Players(5, "Kedar Jadhav", "India", "Chennai Super Kings");
		T_20Players p6=new T_20Players(6, "Shane Watson", "Australia", "Chennai Super Kings");
		T_20Players p7=new T_20Players(7, "Mitchell Satner", "Australia", "Chennai Super Kings");
		T_20Players p8=new T_20Players(8, "Harbhajan Singh", "India", "Chennai Super Kings");
		T_20Players p9=new T_20Players(9, "Ravindra Jadeja", "India", "Chennai Super Kings");
		T_20Players p10=new T_20Players(10, "Dwayne Bravo", "West Indies", "Chennai Super Kings");
		T_20Players p11=new T_20Players(11, "Imran Tahir", "South Africa", "Chennai Super Kings");
		
		List<T_20Players> csk=new ArrayList<T_20Players>();
		csk.add(p1);
		csk.add(p2);
		csk.add(p3);
		csk.add(p4);
		csk.add(p5);
		csk.add(p6);
		csk.add(p7);
		csk.add(p8);
		csk.add(p9);
		csk.add(p10);
		csk.add(p11);
		
		T_20Players P1=new T_20Players(1, "Rohit Sharma", "India", "Mumbai Indians");
		T_20Players P2=new T_20Players(2, "Kieron Pollard", "India", "Mumbai Indians");
		T_20Players P3=new T_20Players(3, "Hardik Pandya", "India", "Mumbai Indians");
		T_20Players P4=new T_20Players(4, "Krunal Pandya", "India", "Mumbai Indians");
		T_20Players P5=new T_20Players(5, "Suryakumar Yadav", "India", "Mumbai Indians");
		T_20Players P6=new T_20Players(6, "Jasprit Bumrah", "India", "Mumbai Indians");
		T_20Players P7=new T_20Players(7, "Mitchell McClenaghan", "Australia", "Mumbai Indians");
		T_20Players P8=new T_20Players(8, "Lasith Malinga", "Sri Lanka", "Mumbai Indians");
		T_20Players P9=new T_20Players(9, "Quinton de Kock", "South Africa", "Mumbai Indians");
		T_20Players P10=new T_20Players(10, "Trent Boult", "New Zealand", "Mumbai Indians");
		T_20Players P11=new T_20Players(11, "Ishan Kishan", "India", "Mumbai Indians");
		
		List<T_20Players> mi=new ArrayList<T_20Players>();
		mi.add(P1);
		mi.add(P2);
		mi.add(P3);
		mi.add(P4);
		mi.add(P5);
		mi.add(P6);
		mi.add(P7);
		mi.add(P8);
		mi.add(P9);
		mi.add(P10);
		mi.add(P11);
		
		int c1=0,c2=0;
		
		for(int i=0;i<csk.size();i++)
		{
			if(csk.get(i).getCountry().equals("Australia"))
				c1++;
		}
		
		//System.out.println("Number Of Australian Players in CSK = "+c1);
		
		for(int i=0;i<mi.size();i++)
		{
			if(mi.get(i).getCountry().equals("Australia"))
				c2++;
		}
		
		//System.out.println("Number Of Australian Players in MI = "+c2);
		
		if(c1>c2)
			System.out.println("CSK Has Maximum Number Of Australian Players = "+c1);
		else
			System.out.println("MI Has Maximum Number Of Australian Players = "+c2);
		
	}
}

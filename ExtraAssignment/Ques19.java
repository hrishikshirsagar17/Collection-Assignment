/*"There is a HashSet which has Stud3 objects. Create two arraylists from this
hashset. In one arraylist called ‘placedStud3s’ insert all Stud3s who have
been placed and in another arraylist ‘unplacedStud3s’
Stud3 class--Fields
studid, Name, Qualification, yearOfpassing, placed(true/false)"
*/
package ExtraAssignment;
import java.util.*;


class Stud3
{
	int studid;
	String name;
	String qual;
	int yearOfPassing;
	boolean placed;
	
	public Stud3() {
	}

	public Stud3(int studid, String name, String qual, int yearOfPassing, boolean placed) {
		super();
		this.studid = studid;
		this.name = name;
		this.qual = qual;
		this.yearOfPassing = yearOfPassing;
		this.placed = placed;
	}

	public int getStudid() {
		return studid;
	}

	public void setStudid(int studid) {
		this.studid = studid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQual() {
		return qual;
	}

	public void setQual(String qual) {
		this.qual = qual;
	}

	public int getYearOfPassing() {
		return yearOfPassing;
	}

	public void setYearOfPassing(int yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}

	public boolean isPlaced() {
		return placed;
	}

	public void setPlaced(boolean placed) {
		this.placed = placed;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (placed ? 1231 : 1237);
		result = prime * result + ((qual == null) ? 0 : qual.hashCode());
		result = prime * result + studid;
		result = prime * result + yearOfPassing;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stud3 other = (Stud3) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (placed != other.placed)
			return false;
		if (qual == null) {
			if (other.qual != null)
				return false;
		} else if (!qual.equals(other.qual))
			return false;
		if (studid != other.studid)
			return false;
		if (yearOfPassing != other.yearOfPassing)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Stud3 [studid=" + studid + ", name=" + name + ", qual=" + qual + ", yearOfPassing=" + yearOfPassing
				+ ", placed=" + placed + "]";
	}
	
	
}
public class Ques19 {

public static void main(String[] args) {
		
		HashSet<Stud3> s=new HashSet<>();
		s.add(new Stud3(1, "Hrishi", "BE", 2019, false));
		s.add(new Stud3(2, "Aditya", "BE", 2019, false));
		s.add(new Stud3(3, "Rahul", "BE", 2019, true));
		s.add(new Stud3(4, "Sameer", "BE", 2019, true));
		s.add(new Stud3(5, "Shubham", "BE", 2019, true));
		
		
		ArrayList<Stud3> placed=new ArrayList<>();
		ArrayList<Stud3> unplaced=new ArrayList<>();
		for(Stud3 obj:s)
		{
			if(obj.placed == true)
				placed.add(obj);
			else
				unplaced.add(obj);
		}
		
		System.out.println(placed);
		System.out.println(unplaced);
	}
	
}

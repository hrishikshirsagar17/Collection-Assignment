/*Create two Set of students objects where insertion order in maintained.
Now accept Studentid from user and check whether in both sets have student with given id at same position*/

package ExtraAssignment;
import java.util.*;

class Stud_
{
	private int sid;

	public Stud_() {
	}

	public Stud_(int sid) {
		super();
		this.sid = sid;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}


	@Override
	public String toString() {
		return "Stud_ [sid=" + sid + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sid;
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
		Stud_ other = (Stud_) obj;
		if (sid != other.sid)
			return false;
		return true;
	}


}
public class Ques13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Set<Stud_> s1=new LinkedHashSet<>();

		s1.add(new Stud_(101));
		s1.add(new Stud_(102));
		s1.add(new Stud_(103));
		s1.add(new Stud_(104));
		s1.add(new Stud_(105));

		System.out.println(s1);

		Set<Integer> s2=new LinkedHashSet<>();

		System.out.println("Enter 2 Student Id: ");

		for(int j=1;j<=2;j++)
		{
			Integer id=sc.nextInt();
			s2.add(id);
		}

		System.out.println(s2);

		ArrayList<Integer> al1=new ArrayList<>();

		for(Stud_ e:s1)
		{
			Integer s=e.getSid();
			al1.add(s);
		}

		System.out.println("al1= "+al1);

		ArrayList<Integer> al2=new ArrayList<>();

		for(Integer e:s2)
		{
			al2.add(e);
		}

		System.out.println("al2= "+al2);

		al1.retainAll(al2);
		System.out.println("after remainAll= "+al1);

		Integer i[]=new Integer[al1.size()];

		al1.toArray(i);

		System.out.println("s= "+Arrays.toString(i));

		Integer i1[]=new Integer[al2.size()];

		al2.toArray(i1);

		System.out.println("s1= "+Arrays.toString(i1));

		int j=0;
		int c=0;
		while(j<i.length)
		{
			if(i[j]!=i1[j])
				
			{
				j++;
				c++;
			}

			j++;
		}	
		if(c>0)
			System.out.println("Not In Same Order");
		else
			System.out.println("Same Order");

	}
}

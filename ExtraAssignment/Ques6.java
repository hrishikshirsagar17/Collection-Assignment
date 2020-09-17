/*"WAP wherein Set<Student>containing { introllno , String name , intmarks } are changed to
Map where key will be marks and value will be List of RollNos where all those students who have same marks are together."
*/
package ExtraAssignment;
import java.util.*;

import javax.swing.plaf.synth.SynthScrollBarUI;

class Stud
{
	private int sid;
	private String sname;
	private int marks;
	
	public Stud() {
	}

	public Stud(int sid, String sname, int marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}

	
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Stud [sid=" + sid + ", sname=" + sname + ", marks=" + marks + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + marks;
		result = prime * result + sid;
		result = prime * result + ((sname == null) ? 0 : sname.hashCode());
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
		Stud other = (Stud) obj;
		if (marks != other.marks)
			return false;
		if (sid != other.sid)
			return false;
		if (sname == null) {
			if (other.sname != null)
				return false;
		} else if (!sname.equals(other.sname))
			return false;
		return true;
	}
	
	
	
}
public class Ques6 {

	public static void main(String[] args) {
		/*"WAP wherein Set<Student>containing { introllno , String name , intmarks } are changed to
		Map where key will be marks and value will be List of RollNos where all those students who have same marks are together."
		*/
		Map<Integer, List<Integer>> m=new HashMap<Integer, List<Integer>>();

		Set<Stud> s=new HashSet<>();
		
		s.add(new Stud(10, "Hrishi", 90));
		s.add(new Stud(11, "Sameer", 90));
		s.add(new Stud(12, "Rahul", 80));
		s.add(new Stud(13, "Aditya", 80));
		s.add(new Stud(14, "Chetan", 80));
		
		for(Stud ss:s)
		{
			if(m.containsKey(ss.getMarks()))
			{
				List<Integer> al=m.get(ss.getMarks());
				al.add(ss.getSid());
			}
			else
			{
				ArrayList<Integer> al=new ArrayList<>();
				al.add(ss.getSid());
				m.put(ss.getMarks(),al);
			}
		}
		
		for(Map.Entry<Integer, List<Integer>> e:m.entrySet())
			System.out.println(e);
		
	}
}

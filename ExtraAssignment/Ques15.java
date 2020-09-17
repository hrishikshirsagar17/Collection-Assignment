/*Assume that there is already  arraylist of members of Society Member{memberid,Wing_flatNo,name}.
Write a program which creates Map where key is Wing_FlatNo and value is List of all  names of family members */

package ExtraAssignment;
import java.util.*;

class Society
{
	private int memberid;
	private String Wing_flatNo;
	private String name;
	
	public Society() {
	}

	public Society(int memberid, String wing_flatNo, String name) {
		super();
		this.memberid = memberid;
		Wing_flatNo = wing_flatNo;
		this.name = name;
	}

	public int getMemberid() {
		return memberid;
	}

	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}

	public String getWing_flatNo() {
		return Wing_flatNo;
	}

	public void setWing_flatNo(String wing_flatNo) {
		Wing_flatNo = wing_flatNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Society [memberid=" + memberid + ", Wing_flatNo=" + Wing_flatNo + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Wing_flatNo == null) ? 0 : Wing_flatNo.hashCode());
		result = prime * result + memberid;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Society other = (Society) obj;
		if (Wing_flatNo == null) {
			if (other.Wing_flatNo != null)
				return false;
		} else if (!Wing_flatNo.equals(other.Wing_flatNo))
			return false;
		if (memberid != other.memberid)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
public class Ques15 {

	public static void main(String[] args) {
		
		
		ArrayList<Society> al=new ArrayList<>();
		
		al.add(new Society(1, "A-101", "Hrishi"));
		al.add(new Society(4, "B-201", "Sameer"));
		al.add(new Society(5, "B-201", "Aditya"));
		al.add(new Society(2, "A-101", "Chetan"));
		al.add(new Society(3, "A-101", "Rahul"));
		
		Map<String, List<String>> m=new HashMap<String, List<String>>();
		
		for(Society s:al)
		{
			if(m.containsKey(s.getWing_flatNo()))
			{
				List<String> al1=m.get(s.getWing_flatNo());
				al1.add(s.getName());
			}
			else
			{
				ArrayList<String> al1=new ArrayList<>();
				al1.add(s.getName());
				m.put(s.getWing_flatNo(), al1);
			}
		}
		
		for(Map.Entry<String, List<String>> e:m.entrySet())
			System.out.println(e);
		
	}
}

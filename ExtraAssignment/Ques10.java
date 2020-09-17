/*"An map contains Stud1 object as a key and list of courses he has enrolled in. [1M]
e.g. map<Stud1 , list(course)>  
Create another map in which course id is a key and list of Stud1 objects of that 
"
*/
package ExtraAssignment;
import java.util.*;

class Stud1
{
	private int sid;
	private String sname;
	
	public Stud1() {
	}

	public Stud1(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
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

	@Override
	public String toString() {
		return "Stud1 [sid=" + sid + ", sname=" + sname + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Stud1 other = (Stud1) obj;
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

class Course
{
	private int courseid;
	private String coursename;
	
	public Course() {
	}

	public Course(int courseid, String coursename) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
	}

	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", coursename=" + coursename + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + courseid;
		result = prime * result + ((coursename == null) ? 0 : coursename.hashCode());
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
		Course other = (Course) obj;
		if (courseid != other.courseid)
			return false;
		if (coursename == null) {
			if (other.coursename != null)
				return false;
		} else if (!coursename.equals(other.coursename))
			return false;
		return true;
	}
	
	
}
public class Ques10 {

	public static void main(String[] args) {
		

		Map<Stud1, List<Course>> m1=new HashMap<Stud1, List<Course>>();
		Map<Integer, List<Stud1>> m2=new HashMap<>();
		 
		ArrayList<Course> al=new ArrayList<>();
		al.add(new Course(1, "Core Java"));
		al.add(new Course(2, "Advance Java"));
		
		ArrayList<Course> al1=new ArrayList<>();
		al1.add(new Course(3, "Python"));
		al1.add(new Course(4, "Netwroking"));
		
		ArrayList<Course> al2=new ArrayList<>();
		al2.add(new Course(1, "Core Java"));
		al2.add(new Course(3, "Python"));
		
		ArrayList<Course> al3=new ArrayList<>();
		al3.add(new Course(2, "Advance Java"));
		al3.add(new Course(4, "Networking"));
		
		
		m1.put(new Stud1(101, "Hrishi"),al);
		m1.put(new Stud1(102, "Aditya"), al1);
		m1.put(new Stud1(103, "Rahul"), al2);
		m1.put(new Stud1(104, "Shubham"), al3);
		
		for(Map.Entry<Stud1, List<Course>> e:m1.entrySet())
		{
			List<Course> c=e.getValue();
			for(Course cc:c)
			{
				if(m2.containsKey(cc.getCourseid()))
				{
					List<Stud1> s=m2.get(cc.getCourseid());
					s.add(e.getKey());
				}
				else
				{
					ArrayList<Stud1> s=new ArrayList<>();
					s.add(e.getKey());
					m2.put(cc.getCourseid(), s);
				}
			}
		}
		
		for(Map.Entry<Integer, List<Stud1>> e:m2.entrySet())
		{
			System.out.println("Course Id : "+e.getKey());
			List<Stud1> l=e.getValue();
			for(Stud1 s:l)
				System.out.println(s);
		}
			
	}
	
}

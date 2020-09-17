/*"Consider an array of Student 
Student (int sid, String sname, List<String> hobby)
From this list create a Map<String,List<Student>> where key is hobby name and list of
student objects having same hobby. Also find out most common hobby among students"
*/
package ExtraAssignment;
import java.util.*;


class Student1
{
	int sid;
	String sname;
	List<String> hobbies;
	
	public Student1() {
	}

	public Student1(int sid, String sname, List<String> hobbies) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.hobbies = hobbies;
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

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "[sid=" + sid + ", sname=" + sname + ", hobbies=" + hobbies + "]";
	}
	
}
public class Ques8 {


	public static void main(String[] args) {
		
		ArrayList<Student1> st=new ArrayList<>();
		
		st.add(new Student1(1, "Hrishi", Arrays.asList("Singing","Photography")));
		st.add(new Student1(2, "Aditya", Arrays.asList("Cooking","Dancing")));
		st.add(new Student1(3, "Sameer", Arrays.asList("Dancing","Photography")));
		st.add(new Student1(4, "Rahul", Arrays.asList("Photography","Dancing")));
		st.add(new Student1(5, "Shubham", Arrays.asList("Cooking","Photography")));
		
		HashMap<String, List<String>> m=new HashMap<>();
		
		for(Student1 stud:st)
		{
			
			for(int i=0;i<stud.hobbies.size();i++)
			{
				if(m.containsKey(stud.hobbies.get(i)))
				{
					List<String> al= m.get(stud.hobbies.get(i));
					al.add(stud.sname);
					
					m.put(stud.hobbies.get(i), al);
				}
				else
				{
					ArrayList<String> al=new ArrayList<>();
					al.add(stud.sname);
					m.put(stud.hobbies.get(i), al);
					
				}
			}
		}
		
		System.out.println(m);
		
		
		
		int max=0;
		String hobby="";
		for(Map.Entry<String, List<String>> e:m.entrySet())
		{
			 
			 
			if(e.getValue().size()> max)
			{
				max=e.getValue().size();
				hobby=e.getKey();
			}
		}
		
		System.out.println("Common Hobby = "+hobby+" ---> Number Of Students = "+max);
		
	}
	
}

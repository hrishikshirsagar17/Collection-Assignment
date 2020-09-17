/*Consider an ArrayList<Test> and  test has  {tid,sid,int marks[]} .Create a Set<Student> Student{sid,totalmarks}
from the list and sort the set in descending order of totalmarks*/

package ExtraAssignment;
import java.util.*;

class Test
{
	private int tid;
	private int sid;
	private int marks[];
	
	public Test() {
	}

	public Test(int tid, int sid, int[] marks) {
		super();
		this.tid = tid;
		this.sid = sid;
		this.marks = marks;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Test [tid=" + tid + ", sid=" + sid + ", marks=" + Arrays.toString(marks) + "]";
	}
	
}

class Stud2 implements Comparable<Stud2>
{
	private int sid;
	private int totalMarks;
	
	public Stud2() {
	}

	public Stud2(int sid, int totalMarks) {
		super();
		this.sid = sid;
		this.totalMarks = totalMarks;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	@Override
	public String toString() {
		return "Stud2 [sid=" + sid + ", totalMarks=" + totalMarks + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sid;
		result = prime * result + totalMarks;
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
		Stud2 other = (Stud2) obj;
		if (sid != other.sid)
			return false;
		if (totalMarks != other.totalMarks)
			return false;
		return true;
	}

	@Override
	public int compareTo(Stud2 o) {
		return this.totalMarks - o.totalMarks;
	}
	
	
}
public class Ques16 {

	public static void main(String[] args) {
		
		/*Consider an ArrayList<Test> and  test has  {tid,sid,int marks[]} .Create a Set<Student> Student{sid,totalmarks}
		from the list and sort the set in descending order of totalmarks*/
		
		
		int marks1[]=new int[3];
		marks1[0]=95;
		marks1[1]=94;
		marks1[2]=93;
		int marks2[]=new int[3];
		marks2[0]=90;
		marks2[1]=91;
		marks2[2]=92;
		int marks3[]=new int[3];
		marks3[0]=89;
		marks3[1]=93;
		marks3[2]=88;
		
		ArrayList<Test> test=new ArrayList<>();
		test.add(new Test(1, 101, marks1));
		test.add(new Test(2, 102, marks2));
		test.add(new Test(3, 103, marks3));
		
		Set<Stud2> stud=new HashSet<>();
		
		for(Test t:test)
		{
			int sid=t.getSid();
			int m[]=t.getMarks();
			int total=0;
			for(int m1:m)
			{
				total+=m1;
			}
			
			stud.add(new Stud2(sid, total));
		}
		
		for(Stud2 s:stud)
			System.out.println(s);
		
		
	}
}

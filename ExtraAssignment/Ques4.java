/*A hashmap contains information about students and his marks. Student object is key and marks is value.
Write a method to create 2 hashset which will have passed students of java course and passed students of angular course.
Passing marks for java is 50 and passing marks for angular is 60.
Student class is as follows. Student { intsid , String name, String course }*/

package ExtraAssignment;
import java.util.*;

class Student
{
	int sid;
	String name;
	String course;
	
	public Student() {
	}

	public Student(int sid, String name, String course) {
		super();
		this.sid = sid;
		this.name = name;
		this.course = course;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", course=" + course + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((course == null) ? 0 : course.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Student other = (Student) obj;
		if (course == null) {
			if (other.course != null)
				return false;
		} else if (!course.equals(other.course))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sid != other.sid)
			return false;
		return true;
	}
	
	
}
public class Ques4 {
	
	public static void result(Map<Student, Integer> hm)
	{
		HashSet<Student> java=new HashSet<>();
		HashSet<Student> angular=new HashSet<>();
		for(Map.Entry<Student, Integer> e:hm.entrySet())
		{
			Student s=e.getKey();
			if(s.course.equals("Java") && e.getValue()>=50)
			{
				java.add(s);
			}
			else if(s.course.equals("Angular Java") && e.getValue()>=60)
			{
				angular.add(s);
			}
			
		}
		
		System.out.println("Java Passed Students...");
		for(Student st:java)
			System.out.println(st);
		System.out.println("Angular Java Passed Students...");
		for(Student st:angular)
			System.out.println(st);
	}

	public static void main(String[] args) {
		
		HashMap<Student, Integer> hm=new HashMap<>();
		
		hm.put(new Student(101, "Hrishi", "Java"), 80);
		hm.put(new Student(102, "Sameer", "Angular Java"), 70);
		hm.put(new Student(103, "Aditya", "Angular Java"), 60);
		hm.put(new Student(104, "Rahul", "Java"), 40);
		hm.put(new Student(105, "Shubham", "Angular Java"), 50);
		hm.put(new Student(106, "Chetan", "Java"), 60);
		
		result(hm);
	}
}

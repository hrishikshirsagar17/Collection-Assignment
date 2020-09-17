/*"Write a Program in Java, You have an Employee class 
class Employee{ 
String name; 
int eid, 
int mgrid; 
} 
Every manager is also employee. So create an arraylist of 5 Emp and print all Employee along with their Manager name."
*/
package ExtraAssignment;
import java.util.*;


class Emp
{

	private int eid;
	private String name;
	private int mgrid;
	
	public Emp() {
	}
	

	public Emp(int eid, String name, int mgrid) {
		super();
		this.eid = eid;
		this.name = name;
		this.mgrid = mgrid;
	}


	@Override
	public String toString() {
		return "Emp [name=" + name + ", eid=" + eid + ", mgrid=" + mgrid + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getMgrid() {
		return mgrid;
	}

	public void setMgrid(int mgrid) {
		this.mgrid = mgrid;
	}
}
public class Ques9 {

	public static void main(String[] args) {
		
		Emp [] e=new Emp[5];
		/*Emp e1=new Emp(1, "Hrishi", 2);
		Emp e2=new Emp(2, "Sameer", 5);
		Emp e3=new Emp(3, "Shubham", 2);
		Emp e4=new Emp(4, "Chetan", 5);
		Emp e5=new Emp(5, "Rahul", 1);*/
		for(int i=0;i<e.length;i++)
		{
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter The Data For Employee"+(i+1));
			System.out.println("Enter Employee Name :");
			String ename=sc.next();
			System.out.println("Enter Employee ID :");
			int eid=sc.nextInt();
			System.out.println("Enter Manager Id(1/2/3/4/5):");
			int mgrid=sc.nextInt();
			
			e[i]=new Emp(eid, ename, mgrid);
		}
		
		for(int i=0;i<e.length;i++)
		{
			for(int j=0;j<e.length;j++)
			{
				if(e[i].getEid() == e[j].getMgrid() && i!=j)
				{
					System.out.println("Employee Name = "+e[i].getName()+" , "+"Associate Manager Name = "+e[j].getName());
				}
			}
		}
	
	}
}

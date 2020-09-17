/*Assume that there is already array list of Customer objects. Customer { intcid , String name ,int items }.
Write a program which creates hashset of customer objects.
If there are multiple customer object for same customer in arraylist ,
then items should be added to previous customer’s items.                                                                                                                
Once set is created sort that set based on no. of items purchased by that customer.
Customer with maximum items should be first.*/

package ExtraAssignment;
import java.util.*;



class Customer
{
	private int cid;
	private String name;
	private int items;

	public Customer() {
	}

	public Customer(int cid, String name, int items) {
		super();
		this.cid = cid;
		this.name = name;
		this.items = items;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getItems() {
		return items;
	}

	public void setItems(int items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", items=" + items + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cid;
		result = prime * result + items;
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
		Customer other = (Customer) obj;
		if (cid != other.cid)
			return false;
		if (items != other.items)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}


public class Ques5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Customer> al=new ArrayList<>();
		
		/*int[] items1 =new int[5];
		int[] items2 =new int[6];
		int[] items3 =new int[7];
		int[] items4 =new int[8];
		int[] items5 =new int[9];*/
		
		al.add(new Customer(1, "Hrishi", 5));
		al.add(new Customer(2, "Sameer", 6));
		al.add(new Customer(3, "Rahul", 7));
		al.add(new Customer(4, "Chetan", 8));
		al.add(new Customer(1, "Hrishi", 9));
		
		ArrayList<Customer> al1=new ArrayList<>();
		
//		for(Customer c:al)
//		{
//			
//			if(al1.contains(c)) /*&& al.contains(c.getName()))*/
//			{
//				System.out.println("in  if");
//				int i[]=c.getItems();
//				c.setItems(i);
//			}
//			else
//			{
//				al1.add(c);
//			}
//		}
//	
		int t=al.size();
		for(int i=0;i<t;i++)
		{
			if(al1.isEmpty())
			{
				al1.add(al.get(i));
				//System.out.println("if = "+al1);
			}
			else
			{
				int k=al1.size();
				for(int j=0;j<k;j++)
				{
					if(al.get(i).getCid()==al1.get(j).getCid() && al.get(i).getName().equals(al1.get(j).getName()) && i>j && i!=j)
					{
						//System.out.println("else if");
						al1.get(j).setItems(al.get(i).getItems()+al1.get(j).getItems());
					}
					else
					{
						al1.add(al.get(i));
					}
					//System.out.println("else = "+al1);
				}
			}
			
		}
		
		
		System.out.println(al1);
		

	}
}

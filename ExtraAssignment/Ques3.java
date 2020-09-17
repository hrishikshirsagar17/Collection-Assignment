/*"Given a linked list of integers , find out number of missing elements in linked list. E.g. list
contains { 2 , 3, 7} missing elements are 4, 5, 6. If list contains { 3 , 13 , 7 , 2 } . missing
elements are 4,5,6,8,9,10,11,12 and so on. Write a logic which will work for any list."
*/
package ExtraAssignment;
import java.util.*;
public class Ques3 {
	
	public static void main(String[] args) {
		

		LinkedList<Integer> l=new LinkedList<>(Arrays.asList(3,13,7,2));
		
		Collections.sort(l);
		
		Integer head=l.getFirst();
		Integer tail=l.getLast();
		
		ArrayList<Integer> al=new ArrayList<>();
		
		for(int i=head;i<=tail;i++)
		{
			if(!l.contains(i))
			{
				al.add(i);
			}
		}
		
		System.out.println(al);
	}
	

}

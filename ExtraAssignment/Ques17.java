/*"An arraylist has strings ""A+2"" , ""B+12"" , ""D+4"", ""DD+5"" and so on. Create a
map which has alphabets as keys and integers as values. If alphabet is
repeated add integer to old value"
 */
package ExtraAssignment;
import java.util.*;
public class Ques17 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		ArrayList<String> al=new ArrayList<>();
		System.out.println("Enter 5 Elements in array list");
		for(int i=0;i<5;i++)
		{
			al.add(sc.next());
		}

		System.out.println(al);

		HashMap<String, Integer> m=new HashMap<>();

		for(int i=0;i<al.size();i++)
		{
			String entry=al.get(i);
			String s[]=entry.split("[+]");
			String key=s[0];
			Integer value=Integer.valueOf(s[1]);
			if(m.containsKey(key))
			{
				int value1=m.put(key, value);
				m.put(key, value+value1);
			}
			else
				m.put(key, value);
		}

		System.out.println(m);
	}

}

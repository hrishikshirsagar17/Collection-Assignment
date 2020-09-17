/*"Given a Linkedhashmap<string, integer> , find out if given list of keys (Strings )appear in
same order in hashmap. E.g. Linkedhashmap has { “pqr” , 12 } { “rst” , 43 } { “abc” , 4 } {
“mno” ,2}
Given list is (“rst”) (“abc”) so it appears in same order. Output should be “true”
If given list is (“abc” ) (“pqr” ) then output should be “false”"
*/
package ExtraAssignment;
import java.util.*;
public class Ques2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		LinkedHashMap<String, Integer> lhm=new LinkedHashMap<>();
		
		lhm.put("pqr", 12);
		lhm.put("rst", 43);
		lhm.put("abc", 4);
		lhm.put("mno", 2);
		
		System.out.println(lhm);
		
		LinkedHashMap<String, Integer> lhm1=new LinkedHashMap<>();
		/*lhm1.put("pqr", 1);
		lhm1.put("mno", 2);*/
		
		System.out.println("Enter key and value");
	
		for(int j=1;j<=2;j++)
		{
			String key=sc.next();
			Integer value=sc.nextInt();
			lhm1.put(key, value);
		}
		
		//System.out.println(lhm1);
		
		
		ArrayList<String> al1=new ArrayList<>();
		
		for(String e:lhm.keySet())
		{
			al1.add(e);
		}
		
		//System.out.println("al1= "+al1);
		
		ArrayList<String> al2=new ArrayList<>();
		
		for(String e:lhm1.keySet())
		{
			al2.add(e);
		}
		
		//System.out.println("al2= "+al2);
		
		al1.retainAll(al2);
		//System.out.println("after remainAll= "+al1);
		
		String s[]=new String[al1.size()];
		
		al1.toArray(s);
		
		//System.out.println("s= "+Arrays.toString(s));
		
		String s1[]=new String[al2.size()];
		
		al2.toArray(s1);
		
		//System.out.println("s1= "+Arrays.toString(s1));
		
		int i=0;
		int c=0;
		while(i<s.length)
		{
			
			if(!s[i].equals(s1[i]))
			{
				i++;
				c++;
			}
			
			i++;
		}	
		if(c>0)
			System.out.println("False");
		else
			System.out.println("True");
	}
}

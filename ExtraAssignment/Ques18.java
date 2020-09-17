/*"An arraylist has strings ""A+2"" , ""B+12"" , ""D+4"", ""DD+5"" and so on. Create a
method which accepts a String eg D in input and will return
associated number value eg in this case 4 by looping the arraylist and
finding matching pattern"
*/
package ExtraAssignment;
import java.util.*;
public class Ques18 {

public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		ArrayList<String> al=new ArrayList<>(Arrays.asList("A+2" , "B+12" , "D+4", "DD+5"));
		
		System.out.println("Enter a Character String");
		String ch=sc.next();
		
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).contains(ch))
			{
				String num=al.get(i);
				String s[]=num.split("[+]");
				System.out.println("Associate Number Value = "+s[1]);
				break;
			}
		}
		
	}
}

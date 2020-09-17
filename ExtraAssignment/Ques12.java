/*Create a Map<String,String> where key is adharno  and value is voted casted to which party(eg. BJP,ShivSena,NCP,Congress,Other)
.From this create new map such that KEY is party name and value is count of votes casted */

package ExtraAssignment;
import java.util.*;
public class Ques12 {

	public static void main(String[] args) {

		HashMap<String, String> m1=new HashMap<String, String>();

		m1.put("101A", "BJP");
		m1.put("102B", "ShivSena");
		m1.put("103C", "BJP");
		m1.put("104D", "BJP");
		m1.put("105E", "NCP");
		m1.put("106F", "Congress");
		m1.put("107G", "ShivSena");
		m1.put("108H", "Other");
		m1.put("109I", "BJP");
		m1.put("110J", "ShivSena");

		HashMap<String, Integer> m2=new HashMap<String, Integer>();

		for(Map.Entry<String, String> entry:m1.entrySet())
		{
			int c=0;

			if(m2.get(entry.getValue()) != null)
				c=m2.get(entry.getValue());

			m2.put(entry.getValue(), c+1);
		}

		System.out.println(m2);
	}
}

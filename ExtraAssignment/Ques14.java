/*"Given two LinkedList, we need to combine two LinkedList  in such a way that the combined aList has alternate elements of both. If one list has extra element, then these elements are appended at the end of the combined list.

Input : list1 = {1, 2, 3, 4, 5, 6}
List2 = {11, 22, 33, 44}
List3: {1, 11, 2, 22, 3, 33, 4, 44, 5, 6}
"
 */
package ExtraAssignment;
import java.util.*;
public class Ques14 {


	public static void mergeAlternate(Integer a1[], Integer a2[], Integer c[], Integer n1, Integer n2)
	{
		int i=0,j=0,k=0;

		while(i<n1 && j<n2)
		{
			c[k++]=a1[i++];//1
			c[k++]=a2[j++];//11,22,33,44
		}

		while(i<n1)
			c[k++]=a1[i++];
		while(j<n2)
			c[k++]=a2[j++];


	}

	public static void main(String[] args) {

		LinkedList<Integer> l1=new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7 , 8 ,9));
		LinkedList<Integer> l2=new LinkedList<>(Arrays.asList(11, 22, 33, 44));

		Integer a1[]=new Integer[l1.size()];
		l1.toArray(a1);

		Integer a2[]=new Integer[l2.size()];
		l2.toArray(a2);

		Integer n1=a1.length;
		Integer n2=a2.length;

		Integer c[]=new Integer [n1+n2];
		mergeAlternate(a1, a2, c, n1, n2);

		LinkedList<Integer> list=new LinkedList<>(Arrays.asList(c));

		System.out.println(list);
	}
}

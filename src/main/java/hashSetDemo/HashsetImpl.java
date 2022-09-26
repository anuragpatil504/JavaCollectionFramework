/* in set only unique data is stored and it is stored in unorderly fashion as in hashset all the 
	values are hashed and then check for duplicates.
	To avoid order problem we used linkedhashset
	To get the elements in sorted order
*/
package hashSetDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashsetImpl {
	public static void main(String[] args) {
		Set<Integer> num = new HashSet<>();
		num.add(10);
		num.add(17);
		num.add(23);
		num.add(13);
		System.out.println(num);
		
		num.add(23);
		
		
		Set<Integer> num2 = new LinkedHashSet<>();
		num2.add(10);
		num2.add(17);
		num2.add(23);
		num2.add(13);
		
		System.out.println(num2);
		
		
		Set<Integer> num3 = new TreeSet<>();
		
		num3.add(10);
		num3.add(17);
		num3.add(23);
		num3.add(13);
		System.out.println(num3);
		
		
	}
}

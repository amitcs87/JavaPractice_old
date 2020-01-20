package collection;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
	
	public static void main(String []args) {
		
		LinkedHashSet<String> lset = new LinkedHashSet<String>();
		
		lset.add("One");
		lset.add("Two");
		lset.add("Three");
		lset.add("Four");
		
		for(String str : lset) {
			System.out.print(str+" ");
		}
		
	}

}

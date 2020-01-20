package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
	
	public static void main(String args[]) {
		
		HashSet<String> set1 = new HashSet<String>();
		
		set1.add("Jayanta");
		set1.add("Arijit");
		set1.add("Manab");
		set1.add("Arijit");
		set1.add(null);
		
		System.out.println("Print with Iterator");
		Iterator<String> itr = set1.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		
		HashSet set2 = new HashSet();
		set2.add("Som");
		set2.add("Avi");
		set2.add("Jayanta");
		
		set1.addAll(set2);
		System.out.println("\nPrint set1 after add set2");
		for(String str : set1) {
			System.out.print(str+" ");
		}
		
		System.out.println("\nRemove Item from set");
		set1.remove("Som");
		System.out.println(set1);
		
		ArrayList<String> arl = new ArrayList<String>();
		arl.add("Sudipta");
		arl.add("Swati");
		arl.add("Soma");
		arl.add("Sudipta");
		HashSet<String> set3 = new HashSet<String>(arl);
		System.out.println("\nCreate Set from List");
		System.out.println(set3);
		
		
		
		
		
	}

	

}

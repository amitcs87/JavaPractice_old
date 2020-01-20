package collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class TreeSet1 {
	
	public static void main(String []args) {
		
		//Not Contain Duplicate Value & Null value
		//maintain Acceding Order
		
		TreeSet<String> tset1 = new TreeSet<String>();
		
		tset1.add("Arijit");
		tset1.add("Jayanta");
		tset1.add("Manab");
		tset1.add("Abhijoy");
		tset1.add("Jayanta");
		//tset1.add(null);
		
		Iterator<String> itr = tset1.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		TreeSet<Integer> tset2 = new TreeSet<Integer>();
		tset2.add(23);
		tset2.add(12);
		tset2.add(6);
		tset2.add(35);
		
		System.out.println("\n"+tset2);
		System.out.println(tset2.pollFirst());
		System.out.println(tset2.pollLast());
		
		Integer[] arr = {3,6,8,1,5,9};
		List list = Arrays.asList(arr);
		TreeSet tset3 = new TreeSet(list);
		System.out.println(tset3);
		
		
	}

}

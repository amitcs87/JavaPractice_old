package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestArrayList {
	
	public static void main(String []args) {
		
		ArrayList<String> arrl = new ArrayList<String>();
		
		arrl.add("Jayanta");
		arrl.add("Arijit");
		arrl.add("Abhijoy");
		arrl.add("Manab");
		
		System.out.println("Print with iterator");
		Iterator itr = arrl.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		System.out.println("\n");
		System.out.println("Print with for each loop");
		for(String str : arrl) {
			System.out.print(str+" ");
		}
		
		System.out.println("\n");
		System.out.println("Traverse with for loop");
		for(int i=0; i< arrl.size(); i++) {
			System.out.print(arrl.get(i)+" ");
		}
		
		System.out.println("\n");
		System.out.println("Reverse the list");
		ListIterator ltrl = arrl.listIterator(arrl.size());
		while(ltrl.hasPrevious()) {
			System.out.print(ltrl.previous()+" ");
		}
		
		System.out.println("\n");
		System.out.println("Reverse with for loop");
		for(int j=arrl.size()-1; j >=0; j--) {
			System.out.print(arrl.get(j)+" ");
		}
	}
}

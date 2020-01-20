package collection;

import java.util.ArrayList;

public class ArrayList4 {
	
	public static void main(String args[]) {
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Jayanta");
		a1.add("Arijit");
		a1.add("Abhijoy");
		a1.add("Manab");
		a1.add("Jayanta");
		
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("Jayanta");
		a2.add("Som");
		a2.add("Soma");
		a2.add("Arijit");
		
		a1.retainAll(a2);
		System.out.println(a1);
		
	}

}

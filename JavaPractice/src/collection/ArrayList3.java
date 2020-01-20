package collection;

import java.util.ArrayList;

public class ArrayList3 {
	
	public static void main(String []args) {
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Jayanta");
		a1.add("Arijit");
		a1.add("Abhijoy");
		
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("Avi");
		a2.add("Som");
		
		a1.addAll(a2);
		
		System.out.println(a1);
		
		ArrayList<String> a3 = new ArrayList();
		a3.add("Sudipta");
		a3.add("Swati");
		a3.add("Soma");
		
		a1.addAll(2, a3);
		System.out.println(a1);
		
		a1.remove("Soma");
		a1.remove("Som");
		System.out.println(a1);
		
		a1.removeAll(a3);
		System.out.println(a1);
		
		a1.clear();
		System.out.println(a1);
		
	}

}

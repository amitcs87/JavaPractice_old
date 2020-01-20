package com.misc;

public class TestString {
	
	public static void main(String []args) {
		
		String s = "Sachin";
		String a = "Sachin";
		
		String d = new String("Sachin");
		String e = new String("Sachin");
		
		//s = s.concat(" Tendulkar");
		
		System.out.println(s);
		System.out.println(a);
		
		System.out.println(s==a);
		System.out.println(s==d);
		System.out.println(e==d);
		
		String x = "aa";
		String y = "ya";
		System.out.println(x.compareTo(y));
		System.out.println(y.compareTo(x));
		String f = x.concat(y);
		System.out.println(f);
		
		String z = 10+10+"Test"+10+10;
		System.out.println(z);
		
		String s11 = " Java is good.   Java is easy ";
		s11 = s11.replace("Java", "Kava");
		System.out.println(s11.trim());
		
		int a1 = 90;
		String s12 = String.valueOf(a1);
		System.out.println(a1+10+"aa");
		
		char arr[] = {'a','b','c','d'};
		String s13 = String.valueOf(arr);
		System.out.println(s13);
		
	}

}

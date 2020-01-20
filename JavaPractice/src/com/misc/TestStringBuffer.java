package com.misc;

public class TestStringBuffer {
	
	public static void main(String []args) {
		
		StringBuffer sb1 = new StringBuffer("Hellow Jayanta");
		System.out.println(sb1);
		
		sb1.replace(0, 6,"Hi");
		System.out.println(sb1);
		
		sb1.append(" Dey");
		System.out.println(sb1);
		
		sb1.insert(11, "Kumar");
		System.out.println(sb1);
		
		sb1.delete(11, 16);
		System.out.println(sb1);
		
		sb1.reverse();
		System.out.println(sb1);
	}

}

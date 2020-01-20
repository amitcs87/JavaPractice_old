package com.misc;

import java.util.StringTokenizer;

public class TestStringTokenizer {
	
	public static void main(String []args) {
		
		String s = "My name is Jayanta";
		StringTokenizer st = new StringTokenizer(s, " ");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}

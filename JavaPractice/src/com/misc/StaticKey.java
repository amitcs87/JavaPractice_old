package com.misc;

public class StaticKey {
	
	static int count = 0;
	static {
		System.out.println("This is static block");
	}
	
	StaticKey(){
		count ++;
		System.out.println(count);
	}
	
	public static void main(String args[]) {
		StaticKey c1 = new StaticKey();
		StaticKey c2 = new StaticKey();
		StaticKey c3 = new StaticKey();
	}

}

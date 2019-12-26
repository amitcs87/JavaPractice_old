package com.misc;

public class TestUnaryOperator {
	
	public static void main(String []args) {
		int a = 10;
		int b = 10;
		System.out.println(a++);
		System.out.println(a);
		System.out.println(b++ + ++b);
		
		int c = 10;
		System.out.println("C:"+ ~c);
		
		outer:
		for(int i=1;i<=3;i++) {
			inner:
			for(int j=1;j<=3;j++) {
				if(i==2 && j==2)
					break outer;
				System.out.println(i +" "+j);
			}
		}
	}

}

package com.misc;

public class Test1 {
	
	public static void fibonacci(int range) {
		int n1=1;
		int n2=1;
		int n3;
		System.out.print(n1+" "+n2+" ");
		for(int i=2; i<range; i++) {
			n3 = n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
	}
	
	public static int fibonacciRecursion(int num) {
		if(num==1 || num==2) {
			return 1;
		}
		
		return(fibonacciRecursion(num-1) + fibonacciRecursion(num-2));
	}
	
	public static void prime(int range) {
		int temp = 0;
		for(int i=2; i<=range; i++) {
			for(int j=2; j<= (Math.sqrt(i)+1); j++) {
				if(i%j == 0) {
					temp = i;
					break;
				}
			}
			if(i != temp)
				System.out.print(i+" ");
		}
	}
	
	public static void main(String []args) {
		fibonacci(10);
		
		System.out.println("\nFibonacci Series using recrsion");
		for(int i=1; i<=10; i++) {
			System.out.print(fibonacciRecursion(i)+" ");
		}
		
		System.out.println("\n");
		prime(102);
		
		System.out.println( Math.sqrt(100));
	}

}

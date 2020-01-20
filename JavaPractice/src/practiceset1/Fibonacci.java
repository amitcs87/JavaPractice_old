//https://javarevisited.blogspot.com/2017/07/top-50-java-programs-from-coding-Interviews.html

package practiceset1;

import java.util.Scanner;


//Q1: Fibonacci Series in Java
//https://www.java67.com/2016/05/fibonacci-series-in-java-using-recursion.html


public class Fibonacci {
	
	public static void fibonacci(int range){
		int n1=0;
		int n2=1;
		int n3;
		System.out.println("Fibonnaci Serises");
		System.out.print(n1+" "+n2+" ");
		for(int i=2; i<range; i++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(n3+" ");
		}
	}
	
	public static int fibonacciRecursive(int num) {
		if(num==0) {
			return 0;
		}
		if(num ==1 || num==2) {
			return 1;
		}else {
			return (fibonacciRecursive(num-1) + fibonacciRecursive(num-2));
		}
	}
	
	
	public static void main(String []args) {
		System.out.println("Enter the range for print Fibonacci series:");
		Scanner s = new Scanner(System.in);
		int range = s.nextInt();
		fibonacci(range);
		
		System.out.println("\n\nFibonacci series with Recursive");
		for(int i=0; i<range; i++) {
			System.out.print(fibonacciRecursive(i)+" ");
		}
	}

}

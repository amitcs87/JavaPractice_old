package practiceset1;

import java.util.Scanner;


//Q2: Check Prime
//https://www.java67.com/2014/01/how-to-check-if-given-number-is-prime.html

public class Prime {
	
	public static boolean isPrime(int num) {
		if(num ==0 || num==1) {
			return false;
		}
		
		for(int i=2 ; i<num/2; i++) {
			if(num % i == 0) {
				return false;
			}
		}	
		return true;
	}
	
	public static boolean isPrimeOptimize(int num) {
		if(num ==0 || num==1) {
			return false;
		}
		
		for(int i=2 ; i<(Math.sqrt(num)+1); i++) {
			if(num % i == 0) {
				return false;
			}
		}	
		return true;
	}
	
	public static void main(String []args) {
		System.out.println("Enter Number to check Prime:");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		if(isPrime(num)) {
			System.out.println(num +" is Prime");
		}else {
			System.out.println(num +" is not prime");
		}
		
		System.out.println("\nEnter range to print prime numbers:");
		Scanner s2 = new Scanner(System.in);
		int range = s2.nextInt();
		for(int i=0;i<=range;i++) {
			if(isPrimeOptimize(i)) {
				System.out.print(i +" ");
			}
		}
	}

}

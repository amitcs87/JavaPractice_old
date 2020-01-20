package practiceLogic;

public class PrimeCheck {
	
	static int input = 101;
	
	
	public static void main(String []args) {	
		if(isPrime(input)) {
			System.out.println(input +" is a prime number");
		}else {
			System.out.println(input +" is not a prime number");
		}
	}
	
	static boolean isPrime(int num) {
		int mid = input/2;
		
		if(num==0 || num==1) {
			return false;
		}
		
		for(int i=2; i<=mid; i++) {
			if(num % i == 0) {
				System.out.println(num +" is divided by "+i);
				return false;
			}
		}
		return true;
	}
}

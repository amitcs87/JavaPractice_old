package practiceLogic;

public class Factorial {
	
	static int input = 6;
	
	public static void main(String []args) {
		int fact = factorial(input);
		System.out.println(input+"!= "+fact);
	}
	
	static int factorial(int num) {
		if(num == 0) {
			return 1;
		}else {
			return(num * factorial(num-1));
		}
	}
	
}

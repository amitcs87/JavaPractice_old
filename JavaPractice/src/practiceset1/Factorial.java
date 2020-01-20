package practiceset1;

//Q7: Factorial

public class Factorial {
	
	public static int factorialWithRecusion(int number) {
		if(number == 0) {
			return 1;
		}
		return number * factorial(number - 1);
	}
	
	public static int factorial(int number) {
		if(number == 0) {
			return 1;
		}
		
		int fact = 1;
		while(number > 0) {
			fact = fact * number;
			number = number - 1;
		}
		return fact;
	}
	
	public static void main(String []args) {
		int number = 5;
		
		System.out.println(number+"!="+factorialWithRecusion(number));
		
		System.out.println(number+"!="+factorial(number));
	}

}

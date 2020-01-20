package practiceset1;

//Q4: Integet palindrome
//https://www.java67.com/2012/09/palindrome-java-program-to-check-number.html

public class IntegerPalindrome {
	 
	public static int revNumber(int num) {
		int sum = 0;
		while(num > 0) {
			int reminder = num % 10;
			sum = sum*10 + reminder;
			num = num/10;
		}
		return sum;
	}
	
	public static void main(String []args) {
		int number= 1011;
		if(number == revNumber(number)) {
			System.out.println(number +" ia palindrome");
		}else {
			System.out.println(number+" is not a palindrome");
		}
	}
}

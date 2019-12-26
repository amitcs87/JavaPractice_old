package practiceLogic;

public class PalindromeCheck {
	
	static int input = 15451;
	
	public static void main(String []args) {
		if(isPalindrome(input)) {
			System.out.println(input +" is a palindrome number");
		}else {
			System.out.println(input +" is not a palindrome number");
		}
	}
	
	static boolean isPalindrome(int num) {
		int sum = 0;
		while(num > 0) {
			int reminder = num % 10;
			sum = (sum * 10) + reminder;
			num = num /10;
		}	
		if(input == sum) {
			return true;
		}else {
			return false;
		}
	}
}

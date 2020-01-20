package practiceset1;

import java.util.Scanner;

//Q3: String Palindrome
//https://www.java67.com/2015/06/how-to-check-is-string-is-palindrome-in.html

public class StringPalindrome {
	
	static int count=0;

	public static boolean isPalindrome(String str) {	
		String rev="";
		for(int i= str.length()-1; i >= 0; i--) {
			rev = rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static String reverseStr(String str) {
		count++;
		System.out.println(count+" "+str);
		if(str == null || str.isEmpty()) {
			return str;
		}
		return str.charAt(str.length()-1) + reverseStr(str.substring(0, str.length()-1));
	}
	
	
	private static String charAt(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String []args) {
//		System.out.println("Enter String to check palindrome:");
//		Scanner s = new Scanner(System.in);
//		String str = s.nextLine();
//		if(isPalindrome(str)) {
//			System.out.println(str +" is palindrome");
//		}else {
//			System.out.println(str +" is not palindrome");
//		}
		
		
		System.out.println(reverseStr("abcd"));
	}
}

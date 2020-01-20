package practiceLogic;

public class ReverseString {
	
	static String reverseString(String str) {
		String rev="";
		for(int i=(str.length() - 1); i >= 0; i--) {
			rev = rev+str.charAt(i);
		}
		
		return rev;
	}
	
	static boolean isPlalindrome(String str) {
		if(str.equals(reverseString(str))) {
			return true;
		}else {
			return false;
		}	
	}
	
	static String capitalizeWord(String str) {
		String[] words = str.split("\\s");
		String capitalizedWord="";
		for(String s : words) {
			String first = s.substring(0,1);
			String afterFirst = s.substring(1);
			capitalizedWord = capitalizedWord + first.toUpperCase() + afterFirst + " ";
		}
		return capitalizedWord;
	}
	
	static String reverseEachWord(String str) {
		String word[] = str.split("\\s");
		String reverseEachWord = "";
		for(String w : word) {
			reverseEachWord = reverseEachWord + reverseString(w) + " ";
		}
		return reverseEachWord;
	}
	
	public static void main(String []args) {
		
		System.out.println(reverseString("Jayanta"));
		
		System.out.println(isPlalindrome("nitin"));
		
		System.out.println(capitalizeWord("my name is jayanta"));
		
		System.out.println(reverseEachWord("my name is jayanta"));
	}

}

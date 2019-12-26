package practiceLogic;

public class CheckArmstrong {
	
	static int input = 371;
	
	public static void main(String args[]) {
		isArmstrong(input);
	}
	
	static void isArmstrong(int num) {
		int c = 0;
		while(num > 0) {
			int reminder = num % 10;
			num = num / 10;
			c = c + (reminder * reminder * reminder);
		}
		
		if(input == c) {
			System.out.println(input +" is a armstrong number");
		}else {
			System.out.println(input + " is not a armstring number");
		}
	}
}

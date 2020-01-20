package practiceset1;

//Q4 Armstrom number check
public class ArmstrongNumber {
	
	public static boolean isArmstrong(int number) {
		int sum = 0;
		int temp = number;
		while(number > 0) {
			int reminder = number % 10;
			sum = sum + (reminder * reminder * reminder);
			number = number /10;
		}	
		if(temp == sum) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String []args) {
		int number = 153;
		if(isArmstrong(number)) {
			System.out.println(number +" is Armstrog number");
		}else {
			System.out.println(number +" is not a armstrong number");
		}
	}
}

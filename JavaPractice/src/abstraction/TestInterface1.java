package abstraction;

interface Bank{
	
	double getInterestRate();
	
	default void welcomeMsg() {
		System.out.println("Welcome to bank");
	}
	
	static int getPPFInterestRate() {
		return 7;
	}
}

class ICICI implements Bank{
	@Override
	public double getInterestRate() {
		return 8;
	}
	
	public void welcomeMsg() {
		System.out.println("Welcome to ICICI");
	}
}

class SBI implements Bank{
	@Override
	public double getInterestRate() {
		return 9;
	}	
}

public class TestInterface1{
	public static void main(String []args) {
		
		Bank B;
		
		B = new ICICI();
		B.welcomeMsg();
		System.out.println(B.getInterestRate());
		
		B = new SBI();
		System.out.println(B.getInterestRate());
		B.welcomeMsg();
		
		System.out.println(Bank.getPPFInterestRate());
		
	}
}

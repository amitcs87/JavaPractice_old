package polymorphism;

class Bank1{
	
	 int rateOfInterest() {
		return 0;
		
	}
}

class Icici1 extends Bank1{
	
	 int rateOfInterest() {
		return 7;
	}
	
	void displayIcici() {
		System.out.println("Welcome ICICI");
	}
}

class Sbi1 extends Bank1{
	
	 int rateOfInterest() {
		return 8;
	}
}

public class RuntimePloymorphism {
	public static void main(String []args) {
		Bank1 B;
		B = new Icici1();
		System.out.println("ICICI Rtae of Interest:"+B.rateOfInterest());
		
		Icici1 I = new Icici1();
		I.displayIcici();

		
		B = new Sbi1();
		System.out.println("SBI rtae of Interest:"+B.rateOfInterest());
		
		B = new Bank1();
		System.out.println("Bank Interest:"+B.rateOfInterest());
	}
}

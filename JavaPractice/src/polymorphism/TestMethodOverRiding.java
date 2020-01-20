package polymorphism;

class Bank{
	 int interestRate(){
		return 0;
	}
}

class Icici extends Bank{
	 int interestRate() {
		return 7;
	}
}

class Sbi extends Bank{
	 int interestRate() {
		return 8;
	}
}

class A{
	A get(){
		System.out.println("A");
		return this;
	}
	
	
}

class B extends A{
	B get(){
		System.out.println("B");
		return this;
	}
	
}

public class TestMethodOverRiding {
	public static void main(String []args) {
		Icici icici = new Icici();
		System.out.println("ICICI Interest Rate: "+icici.interestRate());
		
		Sbi sbi = new Sbi();
		System.out.println("SBI interest Rate: "+sbi.interestRate());
		
		B b = new B();
		b.get();
	} 
}

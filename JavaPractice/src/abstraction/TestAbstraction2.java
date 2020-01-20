package abstraction;

abstract class Bike{
	
	Bike(){
		System.out.println("Bike is created");
	}
	
	abstract void run();
	
	void changeGear() {
		System.out.println("Change Gear.");
	}
}

class Honda extends Bike{

	void run() {
		System.out.println("Honda Running Safely");
	}
	
	void changeGear() {
		System.out.println("Change Honda Gear");
	}
	
}

public class TestAbstraction2 {
	
	public static void main(String []args) {
		Bike B = new Honda();
		B.run();
		B.changeGear();
	}

}

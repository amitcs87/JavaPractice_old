package polymorphism;

class Animal{
	String color ="Red";
	
	Animal(){
		System.out.println("Animal is created");
	}
	
	void displayColor() {
		System.out.println("Animal Color is:"+color);
	}
}


class Dog extends Animal{
	String color = "Black";
	
	Dog(){
		System.out.println("Dog is created");
	}
	
	void displayColor() {
		System.out.println("Dog Color:"+color);
		super.displayColor();
	}
}

 public class SuperKeyword {
	public static void main(String []args) {	
		Dog d = new Dog();
		d.displayColor();
	}
}


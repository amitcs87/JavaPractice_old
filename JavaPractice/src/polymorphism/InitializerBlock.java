package polymorphism;

class Base {
	
	Base(){
		System.out.println("Base Constructor");
	}
	
	{
		System.out.println("Initilizer in Base");
	}
}

class Chield extends Base{
	
	Chield(){
		System.out.println("Chield Constructor");
	}
	
	{
		System.out.println("Initializer in chield");
	}
}

public class InitializerBlock {
	public static void main(String []args) {
		Chield c = new Chield();
	}
}

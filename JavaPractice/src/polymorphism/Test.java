package polymorphism;

class A1{
	static void staticMethod() {
		System.out.println("Class A Sttaic");
	}
	
	void nonStatic() {
		System.out.println("Class A non static");
	}
	
	private void finalMethod() {
		System.out.println("Class A Private Method");
	}
}

class B1 extends A1{
	static void staticMethod() {
		System.out.println("Class B Static");
	}
	
	void nonStatic() {
		System.out.println("Class B non static");
	}
	
	void finalMethod() {
		System.out.println("Class B private method");
	}
	
}

public class Test {
	
	public static void main(String []args) {
		
		B1 b = new B1();
		b.staticMethod();
		b.nonStatic();
		b.finalMethod();
		
		A1 a = new B1();
		a.staticMethod();
		a.nonStatic();
	}

}

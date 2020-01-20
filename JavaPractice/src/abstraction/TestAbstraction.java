package abstraction;

abstract class Shape{
	abstract void draw();
}

class Circle1 extends Shape {

	@Override
	void draw() {
		System.out.println("Draw Circle");
		
	}
	
}

class Triangle1 extends Shape{

	@Override
	void draw() {
		System.out.println("Draw triangle");
		
	}
	
}

public class TestAbstraction {
	
	public static void main(String []args) {
		Shape s;
		
		s = new Circle1();
		s.draw();
		
		s = new Triangle1();
		s.draw();
	}

}



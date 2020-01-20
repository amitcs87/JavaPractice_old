package polymorphism;

 class MethodOverloading {
	
	int add(int a, int b) {
		return a+b;
	}
	
	int add(int a, int b, int c) {
		return a+b+c;
	}
	
	double add (double a, double b) {
		return a+b;
	}

}

class TestMethodOverloading {
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		System.out.println(obj.add(10, 10));
		System.out.println(obj.add(10.5, 20.2));
		System.out.println(obj.add(10, 10, 10));	
	}
}

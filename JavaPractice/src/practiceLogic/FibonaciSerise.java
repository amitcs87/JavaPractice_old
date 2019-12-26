package practiceLogic;

public class FibonaciSerise {
	
	static int n1=0, n2=1, n3;
	static int x1=0, x2=1, x3;
	
	
	public static void main(String []args) {
		//Print Fibonacci Series with Recursive
		System.out.println("Print Fibonacci Series with Recursive");
		int count = 10;
		System.out.print(n1 + " "+n2);
		printFibonaciWithRecursive(count - 2);
		
		//Print Fibonacci Series without Recursive
		System.out.println(System.getProperty("line.separator")+ "Print Fibonacci Series without Recursive");
		System.out.print(x1 + " "+x2);
		printFibonacciWithoutRecursive(count - 2);
	}
	
	
	static void printFibonaciWithRecursive(int count) {
		if(count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" "+n3);
			printFibonaciWithRecursive(count - 1);
		}	
	}
	
	static void printFibonacciWithoutRecursive(int count) {
		for(int i=0; i<count; i++) {
			x3 = x1 + x2;
			x1 = x2;
			x2 = x3;
			System.out.print(" "+x3);
		}
	}

}

package oops;

public class TestStudent {
	
	public static void main(String args[]) {
		System.out.println("Before initialize");
		Student s1 = new Student();
		System.out.println("Student ID: "+s1.sid);
		System.out.println("Student Name: "+s1.sname);
		
		//Assign value by reference
		System.out.println(System.getProperty("line.separator")+"Assign value by reference");
		Student s2 = new Student();
		s2.sid = 1;
		s2.sname = "Jayanta Dey";
		System.out.println("Student ID: "+s2.sid);
		System.out.println("Student Name: "+s2.sname);
		
		//Assign value by method
		System.out.println(System.getProperty("line.separator")+"Assign value by method");
		Student s3 = new Student();
		s3.setValue(2, "Arijit Gupta");
		s3.getValue();
		
		//Assign value by Constructor
		System.out.println(System.getProperty("line.separator")+"Assign value by Constructor");
		Student s4 = new Student(3, "Manab");
		s4.getValue();
		
		//Copy value from object through constructor
		System.out.println(System.getProperty("line.separator")+"Copy value from object through constructor");
		Student s5 = new Student(4, "Abhijoy");
		Student s6 = new Student(s5);
		s5.getValue();
		s6.getValue();
	}

}

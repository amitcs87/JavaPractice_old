package oops;

public class Student {
	
	int sid;
	String sname;
	
	static String clg = "NSEC";
	
	//default Constructor 
	Student(){	
	}
	
	//Parameterize Constructor
	Student(int id, String name){
		sid = id;
		sname = name;
	}
	
	//Constructor to initialize another object
	Student(Student s){
		sid = s.sid;
		sname = s.sname;
	}
	

	void setValue(int id, String name) {
		sid = id;
		sname = name;
	}
	
	void getValue() {
		System.out.println("ID: "+sid);
		System.out.println("name: "+sname);
		System.out.println("Collage: "+clg);
	}

}

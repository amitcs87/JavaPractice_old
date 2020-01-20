package collection;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	String name;
	int roll;
	
	Student(String name, int roll){
		this.name = name;
		this.roll = roll;
	}
}

public class ArrayList2 {
	
	public static void main(String []args) {
		
		Student s1 = new Student("Jayanta", 2);
		Student s2 = new Student("Arijit", 1);
		Student s3 = new Student("Abhijoy", 3);
		
		ArrayList<Student> arrl = new ArrayList<Student>();
		arrl.add(s1);
		arrl.add(s2);
		arrl.add(s3);
		
		Iterator<Student> itr = arrl.iterator();
		while(itr.hasNext()) {
			Student temp = itr.next();
			System.out.println(temp.name +" "+temp.roll);
		}
		
		
		
	}

}

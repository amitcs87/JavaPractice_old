package Inheritance;

public class Emp {
	
	int id;
	String name;
	Address address;
	
	Emp(int id, String name, Address address){
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void display() {
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("City: "+address.city);
		System.out.println("State: "+address.state);
		System.out.println("Country: "+address.country);
	}
	
	public static void main(String args[]) {
		Address addr1 = new Address("Ramsagar","WB","India");
		Emp e1 = new Emp(1, "Jayanta",addr1);
		e1.display();
	}

}

package com.misc;

public class ThisKey {
	
	int id;
	String name;
	
	//This Refer current class instance
	ThisKey(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	void display() {
		System.out.print("ID: "+id+" Name:"+name);
	}
	
	public static void main(String args[]) {
		ThisKey t1 = new ThisKey(1, "Jayanta");
		t1.display();
	}

}

package com.misc;

final class Employee{
	
	final String pancardNo;
	String name;
	
	Employee(String pancardNo){
		this.pancardNo = pancardNo;
	}
	
	public String getPanNo() {
		return pancardNo;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}


public  class TestFinalClass {
	
	public static void main(String []args) {
		Employee e = new Employee("123456789");
		
		e.setName("Jayanta");
		
		System.out.println(e.getPanNo());
		System.out.println(e.getName());
	}
}

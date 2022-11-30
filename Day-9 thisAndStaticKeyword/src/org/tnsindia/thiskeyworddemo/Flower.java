package org.tnsindia.thiskeyworddemo;
//2.It can be used to invoke or initiate current class constructor

public class Flower {
	
	//private data member
	private String name;

	
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//default constructor
	public Flower() {
		super();
	}
	
	//parameterized constructor
	public Flower(String name) {
		super();
		this.name = name;
	}
	
	
}

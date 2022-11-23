package org.tnsindia.accessspecifierdemo;

public class DefaultDemo {
	//default data member
	int speed;

	//constructor
	DefaultDemo(int speed) {
		super();
		this.speed = speed;
	}
	//method
	void display()
	{
		System.out.println("The speed is: "+speed);
	}

	
}

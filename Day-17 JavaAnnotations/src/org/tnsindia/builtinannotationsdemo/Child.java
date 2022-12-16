package org.tnsindia.builtinannotationsdemo;

public class Child extends Parent{
	public String name="Monica";

	@Override
	//Indicates that a method declaration is intended to override a method declaration in a supertype.
	public void display() 
	{
		super.display();
		System.out.println("Child Name: "+name);
	}

}

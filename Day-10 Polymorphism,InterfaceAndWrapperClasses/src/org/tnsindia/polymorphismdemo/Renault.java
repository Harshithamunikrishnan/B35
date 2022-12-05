package org.tnsindia.polymorphismdemo;
//Demo on Constructor Overloading
public class Renault {
	public String mode1;
	public String engine;
	
	//Constructor Overloading
	//parameterized constructor
	Renault(String mode1,String engine)
	{
		System.out.println("Mode1 name is: "+mode1+" "+"Engine is: "+engine);
	}
	//parameterized constructor
	Renault(String mode1)
	{
		System.out.println("Mode1 name is: "+mode1);
	}
	

}

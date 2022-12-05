package org.tnsindia.polymorphismdemo;

public class MethodOverloadingExample {
	
	//method overloading
	// 1.By changing the no of arguments
	public void subtraction(int a,int b)
	{
		System.out.println("The subtraction of a and b is: "+(a-b));
	}
	public void subtraction(float a,float b,int c)
	{
		System.out.println("The subtraction of a,b and c is: "+(a-b-c));
	}

}

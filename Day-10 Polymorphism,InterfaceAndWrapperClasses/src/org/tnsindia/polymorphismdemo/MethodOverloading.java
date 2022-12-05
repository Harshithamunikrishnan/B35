package org.tnsindia.polymorphismdemo;

public class MethodOverloading {
	
	//method overloading
	//1.By having the different type of arguments
	public void subtraction(int a,int b)
	{
		System.out.println("The subtraction of a and b is: "+(a-b));
	}
	
	//if return type is different and parameter is same then it is overriding
	public void subtraction(float a,float b,int c)
	{
		System.out.println("The subtraction of a,b and c is: "+(a-b-c));
	}

}

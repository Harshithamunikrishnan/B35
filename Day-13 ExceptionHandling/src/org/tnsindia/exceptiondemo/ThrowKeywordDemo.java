package org.tnsindia.exceptiondemo;

import java.util.Scanner;

public class ThrowKeywordDemo {
	
	public static void print(int age,int weight)
	{
		if(age>18 && weight>50)
		{
			System.out.println("Eligible to donate blood");
		}
		else
		{
			//throw keyword is used to throw an exception explicitly
			throw new ArithmeticException("Not eligible to donate blood");
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		int weight=s.nextInt();
		try
		{
			//calling the method
			print(age,weight);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			
		}
		
	}

}

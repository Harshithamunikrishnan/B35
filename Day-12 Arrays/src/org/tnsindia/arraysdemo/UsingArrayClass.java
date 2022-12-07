package org.tnsindia.arraysdemo;

import java.util.Arrays;

public class UsingArrayClass {
	//Varargs allows methods to receive unspecified number of argument
	public static void display(int ...a)
	{
		//sort method in array class is used to sort the values 
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		//fun call
		display(23,45,89,77,65,43);

	}

}

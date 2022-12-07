package org.tnsindia.arraysdemo;
//demo on Varargs

//Varargs allows methods to receive unspecified number of argument
public class Varargs {
	//String ...s is variable -argument and it contains 0-n values
	public static void print(int a,int b,String ...s)
	{
		System.out.println(a+" "+b);
		//to print varargs
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+"\t");
		}
	}
	
	public static void main(String[] args) {
		//fun call
		print(23,42,"Java","Python","HTML","JS");

	}

	
}

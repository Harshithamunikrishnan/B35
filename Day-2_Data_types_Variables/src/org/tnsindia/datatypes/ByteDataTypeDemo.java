package org.tnsindia.datatypes;

public class ByteDataTypeDemo {

	public static void main(String[] args) {
		//byte xyz=120 is not valid as it is out of range of byte data-type
		//data members
		int xyz=128;
		//int _abc=2147403640;is not valid as it is out of range of int data
		long _abc=2147403640L;
		System.out.println("The value is: "+xyz);
		System.out.println("The value is: "+_abc);
		char num='z';
		float c=15.67f;
		double d=41.9;
		String str="Harshitha";
		boolean var=true;
		int x=(int)12.5;//typecasting
		float y=(float)34;
		System.out.println("The value is: "+num);
		System.out.println("The value is: "+c);
		System.out.println("The value is: "+d);
		System.out.println("The value is: "+str);
		System.out.println("The value is: "+var);
		System.out.println("The value is: "+x);
		System.out.println("The value is: "+y);
		


	}

}

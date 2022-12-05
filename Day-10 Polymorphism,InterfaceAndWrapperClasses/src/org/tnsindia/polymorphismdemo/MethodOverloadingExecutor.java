package org.tnsindia.polymorphismdemo;
//driver class
public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		//Object creation
		MethodOverloadingExample m=new MethodOverloadingExample();
		//method calling
		m.subtraction(10, 50);
		m.subtraction(20, 10, 10);
		
		System.out.println();
		
		//Object creation
		MethodOverloadingExample m1=new MethodOverloadingExample();
		//method calling
		m1.subtraction(30, 60);
		m1.subtraction(25f, 10f, 40);
	}

}

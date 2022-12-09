package org.tnsindia.exceptiondemo;

import java.util.Scanner;
//demo on when finally block is not executed
public class FinallyBlockNotExecutedDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=16;
		try {
			int y=s.nextInt();
			System.out.println("Inside try-catch"+x/y);
			/*1. When we call below line and our try block does not contain
			 any exception, then "finally" block is not executed*/
			System.exit(0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Handled "+e);
		}
		/*finally
		{
			System.out.println("Finally Block");
		}*/
		/*2. When "finally" block contains the exception, then "finally" block is not executed*/
		finally
		{
			int res=14/0;
			System.out.println(res);
		}
   }

}

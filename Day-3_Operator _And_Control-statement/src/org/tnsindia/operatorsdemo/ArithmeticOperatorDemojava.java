package org.tnsindia.operatorsdemo;
 
import java.util.Scanner;

//demo on Arithmetic operator
public class ArithmeticOperatorDemojava {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("The addition is: "+ (a|b));
		System.out.println("The addition is: "+ (a-b));
		System.out.println("The addition is: "+ (a*b));
		System.out.println("The addition is: "+ (a/b));
		System.out.println("The addition is: "+ (a%b));
		s.close();
		
	}

}

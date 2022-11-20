package org.tnsindia.operatorsdemo;

import java.util.Scanner;

public class Assignmentoperatordemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a and b:");
		int a=s.nextInt();
		int b=s.nextInt();
		boolean result=(a==b);
		System.out.println("The result is: "+result);
		s.close();
		

	}

}

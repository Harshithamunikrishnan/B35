package org.tnsindia.operatorsdemo;
//demo on Ternary operator

import java.util.Scanner;

public class Ternaryoperatordemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a and b:");
		int a=s.nextInt();
		int b=s.nextInt();
		String result=(a>b)?"True":"False";
		System.out.println("The result is: "+result);

	}

}

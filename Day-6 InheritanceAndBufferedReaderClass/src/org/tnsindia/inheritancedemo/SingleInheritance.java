package org.tnsindia.inheritancedemo;

import java.util.Scanner;
//driver class for single-inheritance

public class SingleInheritance {

	public static void main(String[] args) {
		System.out.println("Enter the name of the animal:");
		Scanner s=new Scanner(System.in);
		String name1=s.nextLine();
		System.out.println("Enter the breed of the animal:");
		String breed1=s.nextLine();
		
		Lion l=new Lion();
		l.name=name1;
		l.breed=breed1;
		l.display();
		l.print();

	}

}

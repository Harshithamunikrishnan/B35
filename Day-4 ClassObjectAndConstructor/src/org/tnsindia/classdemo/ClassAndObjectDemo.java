package org.tnsindia.classdemo;

import java.util.Scanner;

//Driver class
public class ClassAndObjectDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the speed of the bike:");
		int speed=s.nextInt();
		
		//creation of object
		Bike obj=new Bike();
		
		//compile time input
		//obj.speed=50;
		obj.speed(speed);
		s.close();
		

	}

}

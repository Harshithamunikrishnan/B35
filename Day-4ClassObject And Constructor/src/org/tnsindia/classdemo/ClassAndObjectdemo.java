package org.tnsindia.classdemo;

import java.util.Scanner;

public class ClassAndObjectdemo {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the speed of the bike: ");
		int speed=s.nextInt();
		//creation of object
		bike obj=new bike();
		
		//compile time input
		//obj.speed=55;
		obj.speed(speed);
		s.close();
	}

}

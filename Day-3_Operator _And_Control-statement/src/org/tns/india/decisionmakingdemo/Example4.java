package org.tns.india.decisionmakingdemo;

import java.util.Scanner; 

public class Example4 {

	public static void main(String[] args) {
		//Switch
		Scanner s=new Scanner(System.in);
		char a=s.next().charAt(0);
		switch(a)
		{
		case 'x':
		System.out.println("Rocky");
		break;
		case 'y':
		System.out.println("Hey");
		break;
		case 'z':
		System.out.println("Jessie");
		break;
		default:
			System.out.println("Invalid input");
		s.close();
		}

	}

}

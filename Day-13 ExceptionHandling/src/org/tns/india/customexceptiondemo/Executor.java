package org.tns.india.customexceptiondemo;

import java.util.Scanner;
//driver class for custom exception
public class Executor {

	public static void main(String[] args) throws LoginCredentials{
		Scanner s=new Scanner(System.in);
		String id=s.nextLine();
		String password=s.nextLine();
		//validating
		if(id!="smithapandit@tnsif.org" && password!="456xyz");
		{
			throw new LoginCredentials(id, password);
		}

	}

}

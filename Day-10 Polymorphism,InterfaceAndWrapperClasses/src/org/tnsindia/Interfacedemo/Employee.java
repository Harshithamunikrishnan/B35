package org.tnsindia.Interfacedemo;

/*//Implementable class
 //interface only implements the classes
 
public class Employee implements Manager{

	@Override
	public void projectDiscussion() {
		System.out.println("About java projects");
		
	}

	@Override
	public void salaryDiscussion() {
		System.out.println("About Basic and Variable Pay");
		
	}
	
}*/

//Multiple inheritance using interface
//child class is implementing the multiple parent interface
public class Employee implements HR,Manager
{

	@Override
	public void projectDiscussion() {
		System.out.println("About java projects");		
	}

	@Override
	public void salaryDiscussion() {
		System.out.println("About Basic and Variable Pay");
		
	}
	
}

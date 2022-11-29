package org.tnsindia.abstractdemo;

public  class ATMMachineChild extends ATMMachine{

	//provided the implementation to abstract method of parent class
	@Override
	void withdraw() {
		int balance=40000;
		System.out.println("Withdrawing amount is: "+balance);
		
	}
	
	

}

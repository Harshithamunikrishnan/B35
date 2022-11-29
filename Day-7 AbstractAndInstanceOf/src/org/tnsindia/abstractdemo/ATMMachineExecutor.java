package org.tnsindia.abstractdemo;

public class ATMMachineExecutor {

	public static void main(String[] args) {
		ATMMachine a=new ATMMachineChild();
		a.withdraw();
		a.display();
	}

}

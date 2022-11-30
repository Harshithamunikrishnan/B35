package org.tnsindia.thiskeyworddemo;
//driver class
public class Executor {

	public static void main(String[] args) {
		Account a=new Account();
		a.accept(13354, "Savings Account");
		a.display();
		
		Flower f=new Flower();
		f.setName("Tulip");
		System.out.println("Flower is: "+f.getName());
		
		Vehicle v=new Vehicle();
		v.speed=55;
		v.display2();
		
		Food f1=new Food();
		f1.get1();
		
		Color c=new Color();
	}

}

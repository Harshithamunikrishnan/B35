package org.tnsindia.instanceofdemo;
//abstract class
abstract class Animal
{
	abstract void accept();
}
//implementable child class for the abstract class
class Dog extends Animal
{

	@Override
	void accept() {
		System.out.println("Dog Barks");
		
	}
	
}
//driver class 
public class InstanceOfDemo {

	public static void main(String[] args) {
		//Animal d=new Dog();
		Dog d=new Dog();
		d.accept();
		
		System.out.println(d instanceof Dog);
		System.out.println(d instanceof Animal);

	}

}

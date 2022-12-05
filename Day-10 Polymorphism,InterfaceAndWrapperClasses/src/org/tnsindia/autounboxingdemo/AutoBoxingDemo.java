package org.tnsindia.autounboxingdemo;
//demo on auto-boxing
public class AutoBoxingDemo {

	public static void main(String[] args) {
		char c='z';
		//converting primitive to object-type
		Character ch=c;
		System.out.println(ch);
		System.out.println(ch.getClass().getName());
		

	}

}

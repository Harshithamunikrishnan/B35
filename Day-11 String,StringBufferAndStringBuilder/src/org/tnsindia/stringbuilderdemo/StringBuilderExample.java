package org.tnsindia.stringbuilderdemo;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("Smrithi Padukone");//12
		
		//capacity method returns the current capacity
		/*The capacity is the number of characters that can be stored
		 (including already written characters), beyond which an allocation will occur*/
		System.out.println(s.capacity());//by default capacity is 16+it will take length of input
		System.out.println(s.length());
		System.out.println(s.append("Shiv"));
		
		System.out.println(s.insert(10, "Capgemini"));
		
		System.out.println(s.capacity());//by default capacity is 16+it will take length of input
		s.setCharAt(2, 'z');
		System.out.println(s);
		

	}

}

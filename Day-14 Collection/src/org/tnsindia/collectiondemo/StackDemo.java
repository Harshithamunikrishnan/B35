package org.tnsindia.collectiondemo;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String>obj=new Stack<>();
		//insertion
		obj.push("Smitha");
		obj.push("Shruthi");
		obj.push("Raaj");
		obj.push("Rosy");
		obj.push("Sij");
		System.out.println(obj);
		//remove-LIFO
		obj.pop();
		System.out.println(obj);
	}

}

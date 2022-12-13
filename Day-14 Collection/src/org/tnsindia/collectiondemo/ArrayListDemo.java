package org.tnsindia.collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Character>obj=new ArrayList<>(3);
		obj.add('K');//0
		obj.add('L');//1st index
		obj.add('M');//2nd index
		obj.add('L');//3rd index
		obj.add('O');
		List<Character>obj1=new ArrayList<>(3);
		System.out.println(obj1.isEmpty());
		System.out.println(obj1.isEmpty());
		System.out.println(obj.contains('O'));
		
		System.out.println("The Collection Elements Are: "+obj);
		//size of the list
		System.out.println("The total elements are: "+obj.size());
		System.out.println("The index of given elements are: "+obj.indexOf('L'));
		System.out.println("The last index is: "+obj.lastIndexOf('L'));
		
		System.out.println("The Collection Elements Are: "+obj.get(2));

	}

}

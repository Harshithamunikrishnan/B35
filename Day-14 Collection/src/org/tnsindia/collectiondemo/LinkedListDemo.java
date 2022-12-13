package org.tnsindia.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Character>obj=new LinkedList<Character>();
		obj.add('K');//0
		obj.add('L');//1st index
		obj.add('M');//2nd index
		obj.add('L');//3rd index
		obj.add('O');
		obj.addFirst('J');
		obj.addLast('R');
		List<Character>obj1=new LinkedList<>();
		System.out.println(obj1.isEmpty());
		System.out.println(obj1.isEmpty());
		System.out.println(obj.contains('O'));
		
		System.out.println("The Collection Elements Are: "+obj);
		//size of the list
		System.out.println("The total elements are: "+obj.size());
		System.out.println("The index of given elements are: "+obj.indexOf('L'));
		System.out.println("The last index is: "+obj.lastIndexOf('L'));
		
		System.out.println("The Collection Elements Are: "+obj.get(2));
		//ascending order
		Collections.sort(obj);
		System.out.println("The Collection Elements Are: "+obj);
		//descending order
		Collections.reverse(obj);
		System.out.println("The Collection Elements Are: "+obj);

		}

}
